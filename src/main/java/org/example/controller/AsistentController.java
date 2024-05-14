package org.example.controller;

import com.google.gson.Gson;
import org.example.model.entity.Consultation;
import org.example.model.entity.Medic;
import org.example.model.entity.MedicalRecord;
import org.example.model.entity.User;
import org.example.model.repository.ConsultationRepository;
import org.example.model.repository.MedicRepository;
import org.example.model.repository.MedicalRecordRepository;
import org.example.model.repository.UserRepository;
import org.example.utils.LoggedInUser;
import org.example.utils.SessionManager;
import org.example.view.AsistentForm;
import org.example.view.LoginForm;
import org.springframework.stereotype.Controller;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.HashSet;
import java.util.List;

@Controller
public class AsistentController {

    AsistentForm asistentForm;
    private MedicalRecordRepository medicalRecordRepository = new MedicalRecordRepository();
    private MedicRepository medicRepository = new MedicRepository();
    private ConsultationRepository consultationRepository = new ConsultationRepository();
    UserRepository userRepository = new UserRepository();

    public AsistentController(AsistentForm asistentForm) {
        this.asistentForm = asistentForm;
        asistentForm.getAsistentVizualizareFiseButton().addActionListener(e->this.handleViewAllMedicalRecords());
        asistentForm.getAsistentActualizareFisaButton().addActionListener(e->handleUpdateMedicalRecord());
        asistentForm.getAsistentCautarePacientButton().addActionListener(e->handleSearchPatientByName());
        asistentForm.getAsistentCreareFisaButton().addActionListener(e->handleCreateMedicalRecord());
        asistentForm.getAsistentFiltrarePacientiMedicComboBox().addActionListener(e->this.handleFilterByMedic());
        asistentForm.getAsistentFiltrarePacientiVarstaComboBox().addActionListener(e->this.handleFilterByAge());
        asistentForm.getAsistentFiltrarePacientDiagnosticCcomboBox().addActionListener(e->this.handleFilterByDiagnostic());
        asistentForm.getAsistentStergereFisaButton().addActionListener(e->this.handleDeleteMedicalRecord());
        asistentForm.getAsistentAdaugareConsultatieButton().addActionListener(e->this.handleCreateConsultation());
        asistentForm.getAsistentGenerareXMLButton().addActionListener(e->this.handleExportXML());
        asistentForm.getAsistentGenerareDOCButton().addActionListener(e->this.handleExportDOC());
        asistentForm.getAsistentGenerareJSONButton().addActionListener(e->this.handleExportJSON());
        asistentForm.getAsistentGenerareCSVButton().addActionListener(e->this.handleExpotCSV());
        asistentForm.getAsistentLogOutButton().addActionListener(e->this.handleLogOut());
    }

    public void handleViewAllMedicalRecords(){
        asistentForm.getAsistentVizualizareFiseMedicaTextArea().setText("");

        List<MedicalRecord> allMedicalRecords = medicalRecordRepository.readAll();
        for (MedicalRecord medicalRecord : allMedicalRecords) {
            asistentForm.getAsistentVizualizareFiseMedicaTextArea().append("Numar Fisa: " + medicalRecord.getIdfisaMedicala().toString() + "\n" + "Nume pacient: " + medicalRecord.getPatientName() + "\n" + "Diagnostic: " + medicalRecord.getDiagnostic() + ", Simptome: " +
                    medicalRecord.getSymptoms() + "\n" + ", Tratament: " + medicalRecord.getTreatment() + ", Varsta Pacient: " + medicalRecord.getPatientAge().toString() + "\n" + "\n");
        }
    }

    public void handleUpdateMedicalRecord(){

        Integer idfisaMedicala = Integer.parseInt(asistentForm.getAsistentActualizareIDFisaTextField().getText());
        Integer patientAge = Integer.parseInt(asistentForm.getAsistentActualizareVarstaPacientTextField().getText());
        Integer medicID = Integer.parseInt(asistentForm.getAsistentActualizareMedicApartinatorTextField().getText());
        Integer asistentID = Integer.parseInt(asistentForm.getAsistentActualizareAsistentApartinatorTextField().getText());

        Medic medic = medicRepository.findMedicByID(medicID);
        User asistent = userRepository.findByID(asistentID);

        MedicalRecord existingMedicalRecord = medicalRecordRepository.findById(idfisaMedicala);

        String patientName = existingMedicalRecord.getPatientName();
        String symptoms = existingMedicalRecord.getSymptoms();
        String treatment = existingMedicalRecord.getTreatment();
        String diagnostic = existingMedicalRecord.getDiagnostic();

        MedicalRecord newMedicalRecord = new MedicalRecord(idfisaMedicala,patientName,symptoms,treatment,diagnostic,patientAge,medic,asistent);

        medicalRecordRepository.update(newMedicalRecord);
    }

    public void handleCreateMedicalRecord(){

        String patientName = asistentForm.getAsistentCreareFisaNumePacientTextField().getText();
        String symptoms = asistentForm.getAsistentCreareFisaSimptomeTextField().getText();
        String treatment = asistentForm.getAsistentCreareFisaTratamentTextField().getText();
        String diagnostic = asistentForm.getAsistentCreareFisaDiagnosticTextField().getText();
        Integer patientAge = Integer.parseInt(asistentForm.getAsistentCreareFisaVarstaTextField().getText());
        Integer medic = Integer.parseInt(asistentForm.getAsistentCreareFisaMedicTextField().getText());
        Integer asistent = Integer.parseInt(asistentForm.getAsistentCreareFisaAsistentTextField().getText());

        Medic idMedic = medicRepository.findMedicByID(medic);

        User idAsistent = userRepository.findByID(asistent);

        MedicalRecord newMedicalRecord = new MedicalRecord();
        newMedicalRecord.setPatientName(patientName);
        newMedicalRecord.setSymptoms(symptoms);
        newMedicalRecord.setTreatment(treatment);
        newMedicalRecord.setDiagnostic(diagnostic);
        newMedicalRecord.setPatientAge(patientAge);
        newMedicalRecord.setIdMedic(idMedic);
        newMedicalRecord.setIdAsistent(idAsistent);

        medicalRecordRepository.save(newMedicalRecord);
    }

    public void handleSearchPatientByName(){
        String patientName = asistentForm.getAsistentCautarePacientNumeTextField().getText();

        asistentForm.getAsistentCautarePacientTextArea().setText("");

        List<MedicalRecord> allMedicalRecords = medicalRecordRepository.allMedicalRecordByPatientName(patientName);

        if (!allMedicalRecords.isEmpty()) {
            for (MedicalRecord medicalRecord : allMedicalRecords) {
                asistentForm.getAsistentCautarePacientTextArea().append("Numar Fisa: " + medicalRecord.getIdfisaMedicala().toString() + "\n" + "Diagnostic: " + medicalRecord.getDiagnostic() + ", Simptome: " +
                        medicalRecord.getSymptoms() + "\n" + ", Tratament: " + medicalRecord.getTreatment() + ", Varsta Pacient: " + medicalRecord.getPatientAge().toString() + "\n" + "\n");
            }
        } else {
            asistentForm.getAsistentCautarePacientTextArea().append("Pacientul cu numele furnizat nu exista");
        }
    }
    public void addItemsDiagnosticComboBox() {
        LoggedInUser loggedInUser = SessionManager.getLoggedInUser();
        Integer idUserLoggedIn = loggedInUser.getIdUserLoggedIn();
        List<MedicalRecord> allFisaMedicala = medicalRecordRepository.allMedicalRecordByUserId(loggedInUser.getIdUserLoggedIn());

        HashSet<String> diagnostics = new HashSet<>();

        for (MedicalRecord fisaMedicala : allFisaMedicala) {
            diagnostics.add(fisaMedicala.getDiagnostic());
        }
        if (diagnostics != null) {
            for (String diagnostic : diagnostics) {
                asistentForm.getAsistentFiltrarePacientDiagnosticCcomboBox().addItem(diagnostic);
            }
        }
    }

    public void addItemsMedicComboBox() {
        LoggedInUser loggedInUser = SessionManager.getLoggedInUser();
        Integer idUserLoggedIn = loggedInUser.getIdUserLoggedIn();
        List<MedicalRecord> allFisaMedicala = medicalRecordRepository.allMedicalRecordByUserId(loggedInUser.getIdUserLoggedIn());

        HashSet<Medic> medics = new HashSet<>();

        for (MedicalRecord fisaMedicala : allFisaMedicala) {
            medics.add(fisaMedicala.getIdMedic());
        }

        if (medics != null) {
            for (Medic medic : medics) {
                //LazyInitializationException if I try to get the name of the medic
                asistentForm.getAsistentFiltrarePacientiMedicComboBox().addItem(medic.getIdMedic());
            }
        }
    }

    public void addItemsVarstaComboBox() {
        LoggedInUser loggedInUser = SessionManager.getLoggedInUser();
        Integer idUserLoggedIn = loggedInUser.getIdUserLoggedIn();
        List<MedicalRecord> allFisaMedicala = medicalRecordRepository.allMedicalRecordByUserId(loggedInUser.getIdUserLoggedIn());

        HashSet<Integer> ages = new HashSet<>();

        for (MedicalRecord fisaMedicala : allFisaMedicala) {
            ages.add(fisaMedicala.getPatientAge());
        }
        if (ages != null) {
            for (Integer age : ages) {
                asistentForm.getAsistentFiltrarePacientiVarstaComboBox().addItem(age);
            }
        }

    }


    public void handleFilterByDiagnostic(){
        String selectedDiagnostic = asistentForm.getAsistentFiltrarePacientDiagnosticCcomboBox().getSelectedItem().toString();

        asistentForm.getAsistentFiltrarePacientiDiagnosticTextArea().setText("");


        List<MedicalRecord> allByDiagnostic = medicalRecordRepository.allMedicalRecordByDiagnostic(selectedDiagnostic);

        for (MedicalRecord fisaMedicala : allByDiagnostic) {
            asistentForm.getAsistentFiltrarePacientiDiagnosticTextArea().append("Numar Fisa: " + fisaMedicala.getIdfisaMedicala().toString() + "\n" + "Nume pacient : " + fisaMedicala.getPatientName() + "\n" + "Diagnostic: " + fisaMedicala.getDiagnostic() + ", Simptome: " +
                    fisaMedicala.getSymptoms() + "\n" + ", Tratament: " + fisaMedicala.getTreatment() + ", Varsta Pacient: " + fisaMedicala.getPatientAge().toString() + "\n" + "\n");

        }
    }

    public void handleFilterByAge(){
        asistentForm.getAsistentFiltrarePacientiVarstaTextArea().setText("");

        Integer varsta = Integer.parseInt(asistentForm.getAsistentFiltrarePacientiVarstaComboBox().getSelectedItem().toString());

        List<MedicalRecord> allByVarsta = medicalRecordRepository.allMedicalRecordByVarsta(varsta);

        for(MedicalRecord fisaMedicala : allByVarsta){
            asistentForm.getAsistentFiltrarePacientiVarstaTextArea().append("Numar Fisa: " + fisaMedicala.getIdfisaMedicala().toString() +"\n" + "Nume pacient : " + fisaMedicala.getPatientName() +  "\n" + "Diagnostic: " + fisaMedicala.getDiagnostic() + "\n" + ", Simptome: " +
                    fisaMedicala.getSymptoms() + "\n" + ", Tratament: "  + fisaMedicala.getTreatment() + "\n" + ", Varsta Pacient: " + fisaMedicala.getPatientAge().toString() + "\n" + "\n");
        }
    }

    public void handleFilterByMedic(){
        asistentForm.getAsistentFiltrarePacientiMedicTextArea().setText("");
        Integer medicID = Integer.parseInt(asistentForm.getAsistentFiltrarePacientiMedicComboBox().getSelectedItem().toString());

        List<MedicalRecord> allByMedicID = medicalRecordRepository.allMedicalRecordByMedicID(medicID);

        for (MedicalRecord fisaMedicala : allByMedicID) {
            asistentForm.getAsistentFiltrarePacientiMedicTextArea().append("Numar Fisa: " + fisaMedicala.getIdfisaMedicala().toString() +"\n" + "Nume pacient : " + fisaMedicala.getPatientName() +  "\n" + "Diagnostic: " + fisaMedicala.getDiagnostic() + "\n" + ", Simptome: " +
                    fisaMedicala.getSymptoms() + "\n" + ", Tratament: "  + fisaMedicala.getTreatment() + "\n" + ", Varsta Pacient: " + fisaMedicala.getPatientAge().toString() + "\n" + "\n");
        }
    }

    public void handleDeleteMedicalRecord(){
        Integer IDFisa = Integer.parseInt(asistentForm.getAsistentStergereFisaTextField().getText());

        MedicalRecord medicalRecordToDelete = medicalRecordRepository.findById(IDFisa);

        medicalRecordRepository.delete(medicalRecordToDelete);
    }

    public void handleCreateConsultation(){
        Integer startConsultationHour = Integer.parseInt(asistentForm.getAsistentAdaugareConsultatieOraInceputTextField().getText());
        Integer endConsultationHour = Integer.parseInt(asistentForm.getAsistentAdaugareConsultatieOraFinalTextField().getText());
        String namePatient = asistentForm.getAsistentAdaugareConsultatieNumePacientTextField().getText();
        Integer medic = Integer.parseInt(asistentForm.getAsistentAdaugareConsultatieMedicTextField().getText());

        Medic idMedic = medicRepository.findMedicByID(medic);

        Consultation consultation = new Consultation();
        consultation.setStartConsultationHour(startConsultationHour);
        consultation.setEndConsultationHour(endConsultationHour);
        consultation.setNamePatient(namePatient);
        consultation.setIdMedic(idMedic);

        consultationRepository.save(consultation);
    }

    public void handleExpotCSV(){
        String jdbcURL = "jdbc:mysql://127.0.0.1:3306/cabinetmedicalMVVM";
        String username = "root";
        String password = "cutucutumiau";

        String csvFilePath = "Medic_exports.csv";

        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
            String sql = "SELECT * FROM medic";

            Statement statement = connection.createStatement();

            ResultSet result = statement.executeQuery(sql);

            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(csvFilePath));

            // write header line containing column names
            fileWriter.write("idMedic,name,surname,idUser,startTimeProgram,endTimeProgram");

            while (result.next()) {
                Integer idMedic = result.getInt("idMedic");
                String name = result.getString("name");
                String surname = result.getString("surname");
                Integer idUser = result.getInt("idUser");
                Integer startTimeProgram = result.getInt("startTimeProgram");
                Integer endTimeProgram = result.getInt("endTimeProgram");


                String line = String.format("\"%d\",%s,%s,%d,%d,%d",
                        idMedic, name, surname, idUser, startTimeProgram, endTimeProgram);

                fileWriter.newLine();
                fileWriter.write(line);
            }

            statement.close();
            fileWriter.close();

        } catch (SQLException e) {
            System.out.println("Datababse error:");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File IO error:");
            e.printStackTrace();
        }
    }

    public void handleExportDOC(){
        String jdbcURL = "jdbc:mysql://127.0.0.1:3306/cabinetmedicalMVVM";
        String username = "root";
        String password = "cutucutumiau";

        String docFilePath = "Medic_exports.doc";

        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
            String sql = "SELECT * FROM medic";

            Statement statement = connection.createStatement();

            ResultSet result = statement.executeQuery(sql);

            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(docFilePath));

            // Write header line containing column names
            fileWriter.write("idMedic\tname\tsurname\tidUser\tstartTimeProgram\tendTimeProgram");
            fileWriter.newLine();

            // Write data to the file
            while (result.next()) {
                Integer idMedic = result.getInt("idMedic");
                String name = result.getString("name");
                String surname = result.getString("surname");
                Integer idUser = result.getInt("idUser");
                Integer startTimeProgram = result.getInt("startTimeProgram");
                Integer endTimeProgram = result.getInt("endTimeProgram");

                String line = String.format("%d\t%s\t%s\t%d\t%d\t%d",
                        idMedic, name, surname, idUser, startTimeProgram, endTimeProgram);

                fileWriter.write(line);
                fileWriter.newLine();
            }

            statement.close();
            fileWriter.close();

            System.out.println("Data exported successfully to " + docFilePath);

        } catch (SQLException e) {
            System.out.println("Database error:");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File IO error:");
            e.printStackTrace();
        }
    }

    public void handleExportXML(){
        String jdbcURL = "jdbc:mysql://127.0.0.1:3306/cabinetmedicalMVVM";
        String username = "root";
        String password = "cutucutumiau";

        String xmlFilePath = "Medic_exports.xml";

        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
            String sql = "SELECT * FROM medic";

            Statement statement = connection.createStatement();

            ResultSet result = statement.executeQuery(sql);

            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(xmlFilePath));

            // Write XML header
            fileWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            fileWriter.newLine();
            fileWriter.write("<medics>");
            fileWriter.newLine();

            // Write data to the XML file
            while (result.next()) {
                Integer idMedic = result.getInt("idMedic");
                String name = result.getString("name");
                String surname = result.getString("surname");
                Integer idUser = result.getInt("idUser");
                Integer startTimeProgram = result.getInt("startTimeProgram");
                Integer endTimeProgram = result.getInt("endTimeProgram");

                // Format data into XML
                fileWriter.write("  <medic>");
                fileWriter.newLine();
                fileWriter.write("    <idMedic>" + idMedic + "</idMedic>");
                fileWriter.newLine();
                fileWriter.write("    <name>" + name + "</name>");
                fileWriter.newLine();
                fileWriter.write("    <surname>" + surname + "</surname>");
                fileWriter.newLine();
                fileWriter.write("    <idUser>" + idUser + "</idUser>");
                fileWriter.newLine();
                fileWriter.write("    <startTimeProgram>" + startTimeProgram + "</startTimeProgram>");
                fileWriter.newLine();
                fileWriter.write("    <endTimeProgram>" + endTimeProgram + "</endTimeProgram>");
                fileWriter.newLine();
                fileWriter.write("  </medic>");
                fileWriter.newLine();
            }

            // Close XML tags
            fileWriter.write("</medics>");

            statement.close();
            fileWriter.close();

            System.out.println("Data exported successfully to " + xmlFilePath);

        } catch (SQLException e) {
            System.out.println("Database error:");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File IO error:");
            e.printStackTrace();
        }
    }

    public void handleExportJSON(){
        String url = "jdbc:mysql://127.0.0.1:3306/cabinetmedicalMVVM";
        String user = "root";
        String password = "cutucutumiau";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM medic")) {

            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumns = rsmd.getColumnCount();
            Gson gson = new Gson();
            StringBuilder json = new StringBuilder("[");

            while (rs.next()) {
                json.append("{");
                for (int i = 1; i <= numColumns; i++) {
                    String column = rsmd.getColumnName(i);
                    Object value = rs.getObject(i);
                    json.append("\"").append(column).append("\":\"").append(value).append("\"");
                    if (i < numColumns) {
                        json.append(",");
                    }
                }
                json.append("}");
                if (!rs.isLast()) {
                    json.append(",\n");
                }
            }
            json.append("]");

            // Do something with the JSON string, for example, print it or write it to a file
            System.out.println(json);

            // Or write it to a file
            try (FileWriter writer = new FileWriter("MedicData.json")) {
                writer.write(json.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void handleLogOut(){
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(asistentForm.getPanel1());
        frame.setVisible(false);
        LoginForm loginForm = new LoginForm();
        JFrame loginFrame = new JFrame("Login Form");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.getContentPane().add(loginForm.getPanel1()); // Add the JPanel from Login to the JFrame
        loginFrame.setSize(700, 700);
        loginFrame.setLocationRelativeTo(null); // Center the frame on the screen
        loginFrame.setVisible(true); // Make the frame visible

        SessionManager.logOutUser();
    }

}
