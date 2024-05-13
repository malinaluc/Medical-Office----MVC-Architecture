package org.example.view;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import lombok.Getter;
import org.example.utils.LanguageManager;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.Locale;

@Getter
public class AsistentForm implements Observer {
    private JPanel panel1;
    private JLabel asistentTitleLabel;
    private JLabel asistentIconLabel;
    private JButton asistentLogOutButton;
    private JLabel asistentVizualizareFiseMedicaleLabel;
    private JLabel asistentActualizareFisaMedicalaLabel;
    private JLabel asistentCreareFisaMedicalaLabel;
    private JLabel asistentFiltrarePacientiLabel;
    private JLabel asistentStergereFisaLabel;
    private JTextArea asistentVizualizareFiseMedicaTextArea;
    private JLabel asistentActualizareIDFisaLabel;
    private JTextField asistentActualizareIDFisaTextField;
    private JTextField asistentActualizareVarstaPacientTextField;
    private JTextField asistentActualizareMedicApartinatorTextField;
    private JTextField asistentActualizareAsistentApartinatorTextField;
    private JButton asistentActualizareFisaButton;
    private JLabel asistentActualizareVarstaPacientLabel;
    private JLabel asistentActualizareMedicApartinatorLabel;
    private JLabel asistentActualizareAsistentApartinatorLabel;
    private JTextField asistentCreareFisaDiagnosticTextField;
    private JTextField asistentCreareFisaTratamentTextField;
    private JTextField asistentCreareFisaSimptomeTextField;
    private JTextField asistentCreareFisaVarstaTextField;
    private JTextField asistentCreareFisaMedicTextField;
    private JTextField asistentCreareFisaAsistentTextField;
    private JTextField asistentCreareFisaNumePacientTextField;
    private JButton asistentCreareFisaButton;
    private JButton asistentCautarePacientButton;
    private JTextField asistentCautarePacientNumeTextField;
    private JTextArea asistentCautarePacientTextArea;
    private JButton asistentVizualizareFiseButton;
    private JLabel asistentCreareFisaDiagnosticLabel;
    private JLabel asistentCreareFisaTratamentLabel;
    private JLabel asistentCreareFisaSimptomeLabel;
    private JLabel asistentCreareFisaVarstaLabel;
    private JLabel asistentCreareFisaMedicLabel;
    private JLabel asistentCreareFisaAsistentLabel;
    private JLabel asistentCreareFisaNumePacientLabel;
    private JLabel asistentCautarePacientLabel;
    private JLabel asistentCautarePacientNumeLabel;
    private JComboBox asistentFiltrarePacientDiagnosticCcomboBox;
    private JTextArea asistentFiltrarePacientiDiagnosticTextArea;
    private JComboBox asistentFiltrarePacientiVarstaComboBox;
    private JTextArea asistentFiltrarePacientiVarstaTextArea;
    private JComboBox asistentFiltrarePacientiMedicComboBox;
    private JTextArea asistentFiltrarePacientiMedicTextArea;
    private JTextField asistentStergereFisaTextField;
    private JButton asistentStergereFisaButton;
    private JLabel asistentStergereFisaIDLabel;
    private JLabel asistentFiltrarePacientiDiagnosticLabel;
    private JLabel asistentFiltrarePacientiVarstaLabel;
    private JLabel asistentFiltrarePacientiMedicLabel;
    private JLabel asisstentProgramareConsultatieLabel;
    private JLabel asistentOraInceputLabel;
    private JTextField asistentAdaugareConsultatieOraInceputTextField;
    private JLabel asistentOraFinalLabel;
    private JTextField asistentAdaugareConsultatieOraFinalTextField;
    private JLabel asistentNumePacientLabel;
    private JTextField asistentAdaugareConsultatieNumePacientTextField;
    private JLabel asistentMedicLabel;
    private JTextField asistentAdaugareConsultatieMedicTextField;
    private JButton asistentAdaugareConsultatieButton;
    private JButton asistentGenerareCSVButton;
    private JButton asistentGenerareJSONButton;
    private JButton asistentGenerareXMLButton;
    private JButton asistentGenerareDOCButton;

    public AsistentForm() {
        languageSetter();

    }

    public void languageSetter() {
        this.asistentTitleLabel.setText(LanguageManager.getString("asistentTitleLabel"));
        this.asistentVizualizareFiseMedicaleLabel.setText(LanguageManager.getString("asistentVizualizareFiseMedicaleLabel"));
        this.asistentActualizareFisaMedicalaLabel.setText(LanguageManager.getString("asistentActualizareFisaMedicalaLabel"));
        this.asistentCreareFisaMedicalaLabel.setText(LanguageManager.getString("asistentCreareFisaMedicalaLabel"));
        this.asistentFiltrarePacientiLabel.setText(LanguageManager.getString("asistentFiltrarePacientiLabel"));
        this.asistentStergereFisaLabel.setText(LanguageManager.getString("asistentStergereFisaLabel"));
        this.asistentActualizareIDFisaLabel.setText(LanguageManager.getString("asistentActualizareIDFisaLabel"));
        this.asistentActualizareVarstaPacientLabel.setText(LanguageManager.getString("asistentActualizareVarstaPacientLabel"));
        this.asistentActualizareMedicApartinatorLabel.setText(LanguageManager.getString("asistentActualizareMedicApartinatorLabel"));
        this.asistentActualizareAsistentApartinatorLabel.setText(LanguageManager.getString("asistentActualizareAsistentApartinatorLabel"));
        this.asistentCreareFisaDiagnosticLabel.setText(LanguageManager.getString("asistentCreareFisaDiagnosticLabel"));
        this.asistentCreareFisaTratamentLabel.setText(LanguageManager.getString("asistentCreareFisaTratamentLabel"));
        this.asistentCreareFisaSimptomeLabel.setText(LanguageManager.getString("asistentCreareFisaSimptomeLabel"));
        this.asistentCreareFisaVarstaLabel.setText(LanguageManager.getString("asistentCreareFisaVarstaLabel"));
        this.asistentCreareFisaMedicLabel.setText(LanguageManager.getString("asistentCreareFisaMedicLabel"));
        this.asistentCreareFisaAsistentLabel.setText(LanguageManager.getString("asistentCreareFisaAsistentLabel"));
        this.asistentCreareFisaNumePacientLabel.setText(LanguageManager.getString("asistentCreareFisaNumePacientLabel"));
        this.asistentCautarePacientLabel.setText(LanguageManager.getString("asistentCautarePacientLabel"));
        this.asistentCautarePacientNumeLabel.setText(LanguageManager.getString("asistentCautarePacientNumeLabel"));
        this.asistentStergereFisaIDLabel.setText(LanguageManager.getString("asistentStergereFisaIDLabel"));
        this.asistentFiltrarePacientiDiagnosticLabel.setText(LanguageManager.getString("asistentFiltrarePacientiDiagnosticLabel"));
        this.asistentFiltrarePacientiVarstaLabel.setText(LanguageManager.getString("asistentFiltrarePacientiVarstaLabel"));
        this.asistentFiltrarePacientiMedicLabel.setText(LanguageManager.getString("asistentFiltrarePacientiMedicLabel"));
        this.asisstentProgramareConsultatieLabel.setText(LanguageManager.getString("asisstentProgramareConsultatieLabel"));
        this.asistentOraInceputLabel.setText(LanguageManager.getString("asistentOraInceputLabel"));
        this.asistentOraFinalLabel.setText(LanguageManager.getString("asistentOraFinalLabel"));
        this.asistentNumePacientLabel.setText(LanguageManager.getString("asistentNumePacientLabel"));
        this.asistentMedicLabel.setText(LanguageManager.getString("asistentMedicLabel"));
        this.asistentActualizareFisaButton.setText(LanguageManager.getString("asistentActualizareFisaButton"));
        this.asistentCreareFisaButton.setText(LanguageManager.getString("asistentCreareFisaButton"));
        this.asistentCautarePacientButton.setText(LanguageManager.getString("asistentCautarePacientButton"));
        this.asistentVizualizareFiseButton.setText(LanguageManager.getString("asistentVizualizareFiseButton"));
        this.asistentStergereFisaButton.setText(LanguageManager.getString("asistentStergereFisaButton"));
        this.asistentAdaugareConsultatieButton.setText(LanguageManager.getString("asistentAdaugareConsultatieButton"));
        this.asistentGenerareCSVButton.setText(LanguageManager.getString("asistentGenerareCSVButton"));
        this.asistentGenerareJSONButton.setText(LanguageManager.getString("asistentGenerareJSONButton"));
        this.asistentGenerareXMLButton.setText(LanguageManager.getString("asistentGenerareXMLButton"));
        this.asistentGenerareDOCButton.setText(LanguageManager.getString("asistentGenerareDOCButton"));
        this.asistentLogOutButton.setText(LanguageManager.getString("asistentLogOutButton"));

    }

    @Override
    public void update() {
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(3, 3, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setBackground(new Color(-2383653));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(18, 6, new Insets(0, 0, 0, 0), -1, -1));
        panel2.setBackground(new Color(-2526763));
        panel1.add(panel2, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        asistentVizualizareFiseMedicaleLabel = new JLabel();
        asistentVizualizareFiseMedicaleLabel.setText("Vizualizare fise medicale");
        panel2.add(asistentVizualizareFiseMedicaleLabel, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentActualizareFisaMedicalaLabel = new JLabel();
        asistentActualizareFisaMedicalaLabel.setText("Actualizare fisa medicala");
        panel2.add(asistentActualizareFisaMedicalaLabel, new GridConstraints(2, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentCreareFisaMedicalaLabel = new JLabel();
        asistentCreareFisaMedicalaLabel.setText("Creare fisa medicala");
        panel2.add(asistentCreareFisaMedicalaLabel, new GridConstraints(2, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentFiltrarePacientiLabel = new JLabel();
        asistentFiltrarePacientiLabel.setText("Filtrare pacienti");
        panel2.add(asistentFiltrarePacientiLabel, new GridConstraints(2, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentStergereFisaLabel = new JLabel();
        asistentStergereFisaLabel.setText("Stergere fisa");
        panel2.add(asistentStergereFisaLabel, new GridConstraints(2, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentIconLabel = new JLabel();
        asistentIconLabel.setIcon(new ImageIcon(getClass().getResource("/images/asistent.png")));
        asistentIconLabel.setText("");
        panel2.add(asistentIconLabel, new GridConstraints(1, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentTitleLabel = new JLabel();
        Font asistentTitleLabelFont = this.$$$getFont$$$("Castellar", Font.BOLD, 22, asistentTitleLabel.getFont());
        if (asistentTitleLabelFont != null) asistentTitleLabel.setFont(asistentTitleLabelFont);
        asistentTitleLabel.setForeground(new Color(-13893586));
        asistentTitleLabel.setText("Asistent");
        panel2.add(asistentTitleLabel, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentLogOutButton = new JButton();
        asistentLogOutButton.setBackground(new Color(-2383653));
        asistentLogOutButton.setText("Log out");
        panel2.add(asistentLogOutButton, new GridConstraints(0, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentActualizareIDFisaLabel = new JLabel();
        asistentActualizareIDFisaLabel.setText("ID Fisa");
        panel2.add(asistentActualizareIDFisaLabel, new GridConstraints(3, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(41, 20), null, 0, false));
        asistentActualizareIDFisaTextField = new JTextField();
        panel2.add(asistentActualizareIDFisaTextField, new GridConstraints(4, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentActualizareVarstaPacientLabel = new JLabel();
        asistentActualizareVarstaPacientLabel.setText("Varsta Pacient");
        panel2.add(asistentActualizareVarstaPacientLabel, new GridConstraints(5, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentVizualizareFiseMedicaTextArea = new JTextArea();
        panel2.add(asistentVizualizareFiseMedicaTextArea, new GridConstraints(4, 0, 13, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        asistentCreareFisaDiagnosticLabel = new JLabel();
        asistentCreareFisaDiagnosticLabel.setText("Diagnostic");
        panel2.add(asistentCreareFisaDiagnosticLabel, new GridConstraints(3, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(65, 20), null, 0, false));
        asistentCreareFisaDiagnosticTextField = new JTextField();
        panel2.add(asistentCreareFisaDiagnosticTextField, new GridConstraints(4, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentCreareFisaTratamentLabel = new JLabel();
        asistentCreareFisaTratamentLabel.setText("Tratament");
        panel2.add(asistentCreareFisaTratamentLabel, new GridConstraints(5, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentCreareFisaTratamentTextField = new JTextField();
        panel2.add(asistentCreareFisaTratamentTextField, new GridConstraints(6, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentCreareFisaSimptomeLabel = new JLabel();
        asistentCreareFisaSimptomeLabel.setText("Simptome");
        panel2.add(asistentCreareFisaSimptomeLabel, new GridConstraints(7, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentCreareFisaSimptomeTextField = new JTextField();
        panel2.add(asistentCreareFisaSimptomeTextField, new GridConstraints(8, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentCreareFisaVarstaLabel = new JLabel();
        asistentCreareFisaVarstaLabel.setText("Varsta PAcient");
        panel2.add(asistentCreareFisaVarstaLabel, new GridConstraints(9, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentCreareFisaVarstaTextField = new JTextField();
        panel2.add(asistentCreareFisaVarstaTextField, new GridConstraints(10, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentActualizareVarstaPacientTextField = new JTextField();
        panel2.add(asistentActualizareVarstaPacientTextField, new GridConstraints(6, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentActualizareMedicApartinatorLabel = new JLabel();
        asistentActualizareMedicApartinatorLabel.setText("Medic Apartinator");
        panel2.add(asistentActualizareMedicApartinatorLabel, new GridConstraints(7, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentActualizareMedicApartinatorTextField = new JTextField();
        panel2.add(asistentActualizareMedicApartinatorTextField, new GridConstraints(8, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentActualizareAsistentApartinatorLabel = new JLabel();
        asistentActualizareAsistentApartinatorLabel.setText("Asistent Apartinator");
        panel2.add(asistentActualizareAsistentApartinatorLabel, new GridConstraints(9, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentActualizareAsistentApartinatorTextField = new JTextField();
        panel2.add(asistentActualizareAsistentApartinatorTextField, new GridConstraints(10, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentActualizareFisaButton = new JButton();
        asistentActualizareFisaButton.setBackground(new Color(-2383653));
        asistentActualizareFisaButton.setText("Actualizare");
        panel2.add(asistentActualizareFisaButton, new GridConstraints(11, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentCreareFisaMedicLabel = new JLabel();
        asistentCreareFisaMedicLabel.setText("Medic Apartinator");
        panel2.add(asistentCreareFisaMedicLabel, new GridConstraints(11, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentCreareFisaMedicTextField = new JTextField();
        panel2.add(asistentCreareFisaMedicTextField, new GridConstraints(12, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentCreareFisaAsistentLabel = new JLabel();
        asistentCreareFisaAsistentLabel.setText("Asistent Apartinator");
        panel2.add(asistentCreareFisaAsistentLabel, new GridConstraints(13, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentCreareFisaAsistentTextField = new JTextField();
        panel2.add(asistentCreareFisaAsistentTextField, new GridConstraints(14, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentCreareFisaNumePacientLabel = new JLabel();
        asistentCreareFisaNumePacientLabel.setText("Nume Pacient");
        panel2.add(asistentCreareFisaNumePacientLabel, new GridConstraints(15, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentCreareFisaNumePacientTextField = new JTextField();
        panel2.add(asistentCreareFisaNumePacientTextField, new GridConstraints(16, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentCreareFisaButton = new JButton();
        asistentCreareFisaButton.setBackground(new Color(-2383653));
        asistentCreareFisaButton.setText("Creare");
        panel2.add(asistentCreareFisaButton, new GridConstraints(17, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentCautarePacientNumeTextField = new JTextField();
        panel2.add(asistentCautarePacientNumeTextField, new GridConstraints(15, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentCautarePacientTextArea = new JTextArea();
        panel2.add(asistentCautarePacientTextArea, new GridConstraints(16, 1, 2, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        asistentVizualizareFiseButton = new JButton();
        asistentVizualizareFiseButton.setBackground(new Color(-2383653));
        asistentVizualizareFiseButton.setText("Vizualizare");
        panel2.add(asistentVizualizareFiseButton, new GridConstraints(17, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentCautarePacientNumeLabel = new JLabel();
        asistentCautarePacientNumeLabel.setText("Nume");
        panel2.add(asistentCautarePacientNumeLabel, new GridConstraints(14, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentCautarePacientButton = new JButton();
        asistentCautarePacientButton.setBackground(new Color(-2383653));
        asistentCautarePacientButton.setText("Cautare");
        panel2.add(asistentCautarePacientButton, new GridConstraints(14, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentCautarePacientLabel = new JLabel();
        asistentCautarePacientLabel.setText("Cautare Pacient");
        panel2.add(asistentCautarePacientLabel, new GridConstraints(13, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentFiltrarePacientiDiagnosticLabel = new JLabel();
        asistentFiltrarePacientiDiagnosticLabel.setText("Diagnostic");
        panel2.add(asistentFiltrarePacientiDiagnosticLabel, new GridConstraints(3, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(65, 20), null, 0, false));
        asistentFiltrarePacientDiagnosticCcomboBox = new JComboBox();
        asistentFiltrarePacientDiagnosticCcomboBox.setBackground(new Color(-2514727));
        asistentFiltrarePacientDiagnosticCcomboBox.setEditable(false);
        panel2.add(asistentFiltrarePacientDiagnosticCcomboBox, new GridConstraints(4, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentFiltrarePacientiDiagnosticTextArea = new JTextArea();
        panel2.add(asistentFiltrarePacientiDiagnosticTextArea, new GridConstraints(5, 4, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        asistentFiltrarePacientiVarstaLabel = new JLabel();
        asistentFiltrarePacientiVarstaLabel.setText("Varsta");
        panel2.add(asistentFiltrarePacientiVarstaLabel, new GridConstraints(7, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentFiltrarePacientiVarstaComboBox = new JComboBox();
        asistentFiltrarePacientiVarstaComboBox.setBackground(new Color(-2383653));
        panel2.add(asistentFiltrarePacientiVarstaComboBox, new GridConstraints(8, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentFiltrarePacientiVarstaTextArea = new JTextArea();
        panel2.add(asistentFiltrarePacientiVarstaTextArea, new GridConstraints(9, 4, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        asistentFiltrarePacientiMedicLabel = new JLabel();
        asistentFiltrarePacientiMedicLabel.setText("Medic");
        panel2.add(asistentFiltrarePacientiMedicLabel, new GridConstraints(11, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentFiltrarePacientiMedicComboBox = new JComboBox();
        asistentFiltrarePacientiMedicComboBox.setBackground(new Color(-2383653));
        panel2.add(asistentFiltrarePacientiMedicComboBox, new GridConstraints(12, 4, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentFiltrarePacientiMedicTextArea = new JTextArea();
        panel2.add(asistentFiltrarePacientiMedicTextArea, new GridConstraints(13, 4, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        asistentStergereFisaIDLabel = new JLabel();
        asistentStergereFisaIDLabel.setText("ID Fisa");
        panel2.add(asistentStergereFisaIDLabel, new GridConstraints(3, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(41, 20), null, 0, false));
        asistentStergereFisaTextField = new JTextField();
        panel2.add(asistentStergereFisaTextField, new GridConstraints(4, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentStergereFisaButton = new JButton();
        asistentStergereFisaButton.setBackground(new Color(-2383653));
        asistentStergereFisaButton.setText("Stergere");
        panel2.add(asistentStergereFisaButton, new GridConstraints(5, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asisstentProgramareConsultatieLabel = new JLabel();
        asisstentProgramareConsultatieLabel.setText("Programare Consultatie");
        panel2.add(asisstentProgramareConsultatieLabel, new GridConstraints(8, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentOraInceputLabel = new JLabel();
        asistentOraInceputLabel.setText("Ora inceput");
        panel2.add(asistentOraInceputLabel, new GridConstraints(9, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentAdaugareConsultatieOraInceputTextField = new JTextField();
        panel2.add(asistentAdaugareConsultatieOraInceputTextField, new GridConstraints(10, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentOraFinalLabel = new JLabel();
        asistentOraFinalLabel.setText("Ora final");
        panel2.add(asistentOraFinalLabel, new GridConstraints(11, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentAdaugareConsultatieOraFinalTextField = new JTextField();
        panel2.add(asistentAdaugareConsultatieOraFinalTextField, new GridConstraints(12, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentNumePacientLabel = new JLabel();
        asistentNumePacientLabel.setText("Nume pacient");
        panel2.add(asistentNumePacientLabel, new GridConstraints(13, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentAdaugareConsultatieNumePacientTextField = new JTextField();
        panel2.add(asistentAdaugareConsultatieNumePacientTextField, new GridConstraints(14, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentMedicLabel = new JLabel();
        asistentMedicLabel.setText("Medic");
        panel2.add(asistentMedicLabel, new GridConstraints(15, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentAdaugareConsultatieMedicTextField = new JTextField();
        panel2.add(asistentAdaugareConsultatieMedicTextField, new GridConstraints(16, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        asistentAdaugareConsultatieButton = new JButton();
        asistentAdaugareConsultatieButton.setBackground(new Color(-2383653));
        asistentAdaugareConsultatieButton.setText("Adaugare");
        panel2.add(asistentAdaugareConsultatieButton, new GridConstraints(17, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentGenerareCSVButton = new JButton();
        asistentGenerareCSVButton.setBackground(new Color(-2383653));
        asistentGenerareCSVButton.setText("CSV");
        panel2.add(asistentGenerareCSVButton, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentGenerareJSONButton = new JButton();
        asistentGenerareJSONButton.setBackground(new Color(-2383653));
        asistentGenerareJSONButton.setText("JSON");
        panel2.add(asistentGenerareJSONButton, new GridConstraints(1, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentGenerareXMLButton = new JButton();
        asistentGenerareXMLButton.setBackground(new Color(-2383653));
        asistentGenerareXMLButton.setEnabled(true);
        asistentGenerareXMLButton.setText("XML");
        panel2.add(asistentGenerareXMLButton, new GridConstraints(1, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        asistentGenerareDOCButton = new JButton();
        asistentGenerareDOCButton.setBackground(new Color(-2514727));
        asistentGenerareDOCButton.setEnabled(true);
        asistentGenerareDOCButton.setText("DOC");
        panel2.add(asistentGenerareDOCButton, new GridConstraints(1, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel1.add(spacer1, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        panel1.add(spacer2, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        panel1.add(spacer3, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer4 = new Spacer();
        panel1.add(spacer4, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }

}
