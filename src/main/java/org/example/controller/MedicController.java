package org.example.controller;

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
import org.example.view.LoginForm;
import org.example.view.MedicForm;
import org.springframework.stereotype.Controller;

import javax.swing.*;
import java.util.List;

@Controller
public class MedicController {

    MedicForm medicForm;

    private MedicalRecordRepository medicalRecordRepository = new MedicalRecordRepository();

   private MedicRepository medicRepository = new MedicRepository();
   private UserRepository userRepository = new UserRepository();
   private ConsultationRepository consultationRepository = new ConsultationRepository();

    public MedicController(MedicForm medicForm) {
        this.medicForm = medicForm;
    }

    public void handleReadAllFisaMedicala() {

        medicForm.getMedicVizualizareFiseMedicaleTextArea().setText("");
        LoggedInUser loggedInUser = SessionManager.getLoggedInUser();
        List<MedicalRecord> allFisaMedicala = medicalRecordRepository.allMedicalRecordByUserId(loggedInUser.getIdUserLoggedIn());
        for (MedicalRecord medicalRecord : allFisaMedicala) {
            medicForm.getMedicVizualizareFiseMedicaleTextArea().append("Numar Fisa: " + medicalRecord.getIdfisaMedicala().toString() + "\n" + "Nume pacient: " + medicalRecord.getPatientName() + "\n" + "Diagnostic: " + medicalRecord.getDiagnostic() + ", Simptome: " +
                    medicalRecord.getSymptoms() + "\n" + ", Tratament: " + medicalRecord.getTreatment() + ", Varsta Pacient: " + medicalRecord.getPatientAge().toString() + "\n" + "\n");
        }
    }

    public void handleUpdateMedicalRecord() {
        String fisaIDString = medicForm.getMedicUpdateIDFisaTextField().getText();
        Integer idfisaMedicala = Integer.parseInt(fisaIDString);
        String diagnostic = medicForm.getMedicUpdateDiagnosticTextField().getText();
        String treatment = medicForm.getMedicUpdateTratamentTextField().getText();
        String symptoms = medicForm.getMedicUpdateSimptomeTextField().getText();

        MedicalRecord existingFisaMedicala = medicalRecordRepository.findById(idfisaMedicala);
        String patientName = existingFisaMedicala.getPatientName();
        Medic idMedic = existingFisaMedicala.getIdMedic();
        User idAsistent = existingFisaMedicala.getIdAsistent();
        Integer patientAge = existingFisaMedicala.getPatientAge();

        MedicalRecord fisaMedicala = new MedicalRecord(idfisaMedicala, patientName, symptoms, treatment, diagnostic, patientAge, idMedic, idAsistent);

        medicalRecordRepository.updateFisa(fisaMedicala);
    }

    public void handleFilterByDiagnostic() {
        String selectedDiagnostic = medicForm.getMedicFiltrareDiagnosticComboBox().getSelectedItem().toString();

        List<MedicalRecord> allMedicalRecords = medicalRecordRepository.allMedicalRecordByDiagnostic(selectedDiagnostic);

        medicForm.getMedicFiltrareDiagnosticTextArea().setText("");

        for (MedicalRecord fisaMedicala : allMedicalRecords) {
            medicForm.getMedicFiltrareDiagnosticTextArea().append("Numar Fisa: " + fisaMedicala.getIdfisaMedicala().toString() + "\n" + "Nume pacient : " + fisaMedicala.getPatientName() + "\n" + "Diagnostic: " + fisaMedicala.getDiagnostic() + ", Simptome: " +
                    fisaMedicala.getSymptoms() + "\n" + ", Tratament: " + fisaMedicala.getTreatment() + ", Varsta Pacient: " + fisaMedicala.getPatientAge().toString() + "\n" + "\n");

        }
    }

    public void handleFilterByTreatment() {
        String selectedTreatment = medicForm.getMedicFiltrareTratamentComboBox().getSelectedItem().toString();

        List<MedicalRecord> allMedicalRecords = medicalRecordRepository.allMedicalRecordByTratament(selectedTreatment);

        medicForm.getMedicFiltrareTratamentTextArea().setText("");

        for (MedicalRecord fisaMedicala : allMedicalRecords) {
            medicForm.getMedicFiltrareTratamentTextArea().append("Numar Fisa: " + fisaMedicala.getIdfisaMedicala().toString() + "\n" + fisaMedicala.getPatientName() + "\n" + "Diagnostic: " + fisaMedicala.getDiagnostic() + ", Simptome: " +
                    fisaMedicala.getSymptoms() + "\n" + ", Tratament: " + fisaMedicala.getTreatment() + ", Varsta Pacient: " + fisaMedicala.getPatientAge().toString() + "\n" + "\n");

        }
    }

    public void handleSearchForPatientByName() {


        String patientName = medicForm.getMedicCautarePacientNumeTextField().getText();

        medicForm.getMedicCautarePacientTextArea().setText("");

        List<MedicalRecord> allMedicalRecords = medicalRecordRepository.allMedicalRecordByPatientName(patientName);

        if (!allMedicalRecords.isEmpty()) {
            for (MedicalRecord medicalRecord : allMedicalRecords) {
                medicForm.getMedicCautarePacientTextArea().append("Numar Fisa: " + medicalRecord.getIdfisaMedicala().toString() + "\n" + "Diagnostic: " + medicalRecord.getDiagnostic() + ", Simptome: " +
                        medicalRecord.getSymptoms() + "\n" + ", Tratament: " + medicalRecord.getTreatment() + ", Varsta Pacient: " + medicalRecord.getPatientAge().toString() + "\n" + "\n");
            }
        } else {
            medicForm.getMedicCautarePacientTextArea().append("Pacientul cu numele furnizat nu exista");
        }
    }

    public void handleSetWorkSchedule(){
        Integer startHour = Integer.parseInt(medicForm.getMedicOraInceputTextField().getText());
        Integer endHour = Integer.parseInt(medicForm.getMedicOraFinalTextField().getText());

        LoggedInUser loggedInUser = SessionManager.getLoggedInUser();

        Medic loggedInMedic = medicRepository.findMedicByID(loggedInUser.getIdUserLoggedIn());

        Integer IDMedic = loggedInMedic.getIdMedic();
        String name = loggedInMedic.getName();
        String surname = loggedInMedic.getSurname();

        User newUser = userRepository.findByID(loggedInUser.getIdUserLoggedIn());


        Medic newMedic = new Medic(IDMedic,name,surname,newUser,startHour,endHour);

        userRepository.update(newMedic);
    }

    public void handleViewAllConsultations(){
        medicForm.getMedicProgramConsultatiiTextArea().setText("");

        LoggedInUser loggedInUser = SessionManager.getLoggedInUser();

        Medic loggedInMedic = medicRepository.findMedicByID(loggedInUser.getIdUserLoggedIn());

        List<Consultation> allConsultations = consultationRepository.allConsultationsByMedicId(loggedInMedic.getIdMedic());

        for(Consultation consultation : allConsultations){
            medicForm.getMedicProgramConsultatiiTextArea().append("Interval orar: " + consultation.getStartConsultationHour() + " - " + consultation.getEndConsultationHour()+"\nNume pacient: " + consultation.getNamePatient()+ "\n" + "\n");
        }
    }

    public void handleLogOut(){
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(medicForm.getPanel1());
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


