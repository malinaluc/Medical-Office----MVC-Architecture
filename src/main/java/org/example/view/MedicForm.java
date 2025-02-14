package org.example.view;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import lombok.Getter;
import org.example.controller.MedicController;
import org.example.utils.LanguageManager;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.Locale;

@Getter
public class MedicForm implements Observer {
    private JPanel panel1;
    private JLabel medicTitleLabel;
    private JLabel medicIconLabel;
    private JTextArea medicVizualizareFiseMedicaleTextArea;
    private JTextField medicUpdateIDFisaTextField;
    private JTextField medicUpdateSimptomeTextField;
    private JTextField medicUpdateDiagnosticTextField;
    private JTextField medicUpdateTratamentTextField;
    private JComboBox medicFiltrareDiagnosticComboBox;
    private JTextArea medicFiltrareDiagnosticTextArea;
    private JComboBox medicFiltrareTratamentComboBox;
    private JButton medicCautarePacientButton;
    private JTextField medicCautarePacientNumeTextField;
    private JTextArea medicCautarePacientTextArea;
    private JTextField medicOraInceputTextField;
    private JTextField medicOraFinalTextField;
    private JButton medicIntroducereProgramButton;
    private JButton medicVizualizareFiseMedicaleButton;
    private JButton medicAcualizareFisaButton;
    private JTextArea medicFiltrareTratamentTextArea;
    private JTextArea medicProgramConsultatiiTextArea;
    private JButton medicVizualizareConsultatiiButton;
    private JLabel medicVizualizareFiseMedicaleLabel;
    private JLabel medicActualizareFiseMedicaleLabel;
    private JLabel medicFiltrarePacientiLabel;
    private JLabel medicCautarePacientLabel;
    private JLabel medicProgramConsultatiiLabel;
    private JLabel medicUpdateIDFIsaMedicalaLabel;
    private JLabel medicUpdateSimptomeLabel;
    private JLabel medicUpdateDiagnosticLabel;
    private JLabel medicUpdateTratamentLabel;
    private JLabel medicFiltrareDiagnosticLabel;
    private JLabel medicFiltrareTratamentLabel;
    private JLabel medicFiltrarePacientiNumePacientLabel;
    private JLabel medicProgramDeLucruLabel;
    private JLabel medicOraInceputLabel;
    private JLabel medicOraFinalLabel;
    private JButton medicLogOutButton;
    private MedicController medicController;

    public MedicForm() {

        medicController = new MedicController(this);
        medicController.addItemsDiagnosticComboBox();
        medicController.addItemsTratamentComboBox();
        languageSetter();

    }

    public void languageSetter() {
        this.medicTitleLabel.setText(LanguageManager.getString("medicTitleLabel"));
        this.medicCautarePacientButton.setText(LanguageManager.getString("medicCautarePacientButton"));
        this.medicIntroducereProgramButton.setText(LanguageManager.getString("medicIntroducereProgramButton"));
        this.medicVizualizareFiseMedicaleButton.setText(LanguageManager.getString("medicVizualizareFiseMedicaleButton"));
        this.medicAcualizareFisaButton.setText(LanguageManager.getString("medicAcualizareFisaButton"));
        this.medicVizualizareConsultatiiButton.setText(LanguageManager.getString("medicVizualizareConsultatiiButton"));
        this.medicVizualizareFiseMedicaleLabel.setText(LanguageManager.getString("medicVizualizareFiseMedicaleLabel"));
        this.medicActualizareFiseMedicaleLabel.setText(LanguageManager.getString("medicActualizareFiseMedicaleLabel"));
        this.medicFiltrarePacientiLabel.setText(LanguageManager.getString("medicFiltrarePacientiLabel"));
        this.medicCautarePacientLabel.setText(LanguageManager.getString("medicCautarePacientLabel"));
        this.medicProgramConsultatiiLabel.setText(LanguageManager.getString("medicProgramConsultatiiLabel"));
        this.medicUpdateIDFIsaMedicalaLabel.setText(LanguageManager.getString("medicUpdateIDFIsaMedicalaLabel"));
        this.medicUpdateSimptomeLabel.setText(LanguageManager.getString("medicUpdateSimptomeLabel"));
        this.medicUpdateDiagnosticLabel.setText(LanguageManager.getString("medicUpdateDiagnosticLabel"));
        this.medicUpdateTratamentLabel.setText(LanguageManager.getString("medicUpdateTratamentLabel"));
        this.medicFiltrareDiagnosticLabel.setText(LanguageManager.getString("medicFiltrareDiagnosticLabel"));
        this.medicFiltrareTratamentLabel.setText(LanguageManager.getString("medicFiltrareTratamentLabel"));
        this.medicFiltrarePacientiNumePacientLabel.setText(LanguageManager.getString("medicFiltrarePacientiNumePacientLabel"));
        this.medicOraInceputLabel.setText(LanguageManager.getString("medicOraInceputLabel"));
        this.medicOraFinalLabel.setText(LanguageManager.getString("medicOraFinalLabel"));
        this.medicLogOutButton.setText(LanguageManager.getString("medicLogOutButton"));
        this.medicProgramDeLucruLabel.setText(LanguageManager.getString("medicProgramDeLucruLabel"));


    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
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
        panel2.setLayout(new GridLayoutManager(13, 6, new Insets(0, 0, 0, 0), -1, -1));
        panel2.setBackground(new Color(-2526763));
        panel1.add(panel2, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        medicIconLabel = new JLabel();
        medicIconLabel.setIcon(new ImageIcon(getClass().getResource("/images/doctor.png")));
        medicIconLabel.setText("");
        panel2.add(medicIconLabel, new GridConstraints(1, 0, 1, 6, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicVizualizareFiseMedicaleLabel = new JLabel();
        medicVizualizareFiseMedicaleLabel.setText("Vizualizare fise medicale");
        panel2.add(medicVizualizareFiseMedicaleLabel, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicActualizareFiseMedicaleLabel = new JLabel();
        medicActualizareFiseMedicaleLabel.setText("Actualizare fise medicale");
        panel2.add(medicActualizareFiseMedicaleLabel, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicFiltrarePacientiLabel = new JLabel();
        medicFiltrarePacientiLabel.setText("Filtrare Pacienti");
        panel2.add(medicFiltrarePacientiLabel, new GridConstraints(2, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicCautarePacientLabel = new JLabel();
        medicCautarePacientLabel.setText("Cautare Pacient");
        panel2.add(medicCautarePacientLabel, new GridConstraints(2, 3, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicProgramConsultatiiLabel = new JLabel();
        medicProgramConsultatiiLabel.setText("Program Consultatii");
        panel2.add(medicProgramConsultatiiLabel, new GridConstraints(2, 5, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicUpdateIDFIsaMedicalaLabel = new JLabel();
        medicUpdateIDFIsaMedicalaLabel.setText("ID Fisa Medicala");
        panel2.add(medicUpdateIDFIsaMedicalaLabel, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicUpdateIDFisaTextField = new JTextField();
        panel2.add(medicUpdateIDFisaTextField, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        medicUpdateSimptomeLabel = new JLabel();
        medicUpdateSimptomeLabel.setText("Simptome");
        panel2.add(medicUpdateSimptomeLabel, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicUpdateSimptomeTextField = new JTextField();
        panel2.add(medicUpdateSimptomeTextField, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        medicUpdateDiagnosticLabel = new JLabel();
        medicUpdateDiagnosticLabel.setText("Diagnostic");
        panel2.add(medicUpdateDiagnosticLabel, new GridConstraints(7, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicUpdateDiagnosticTextField = new JTextField();
        panel2.add(medicUpdateDiagnosticTextField, new GridConstraints(8, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        medicUpdateTratamentLabel = new JLabel();
        medicUpdateTratamentLabel.setText("Tratament");
        panel2.add(medicUpdateTratamentLabel, new GridConstraints(9, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicUpdateTratamentTextField = new JTextField();
        panel2.add(medicUpdateTratamentTextField, new GridConstraints(10, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        medicFiltrareDiagnosticLabel = new JLabel();
        medicFiltrareDiagnosticLabel.setText("Diagnostic");
        panel2.add(medicFiltrareDiagnosticLabel, new GridConstraints(3, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicFiltrareDiagnosticComboBox = new JComboBox();
        medicFiltrareDiagnosticComboBox.setBackground(new Color(-2383653));
        panel2.add(medicFiltrareDiagnosticComboBox, new GridConstraints(4, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicFiltrareDiagnosticTextArea = new JTextArea();
        panel2.add(medicFiltrareDiagnosticTextArea, new GridConstraints(5, 2, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        medicFiltrareTratamentComboBox = new JComboBox();
        medicFiltrareTratamentComboBox.setBackground(new Color(-2383653));
        panel2.add(medicFiltrareTratamentComboBox, new GridConstraints(9, 2, 2, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicFiltrareTratamentLabel = new JLabel();
        medicFiltrareTratamentLabel.setText("Tratament");
        panel2.add(medicFiltrareTratamentLabel, new GridConstraints(8, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicFiltrarePacientiNumePacientLabel = new JLabel();
        medicFiltrarePacientiNumePacientLabel.setText("Nume");
        panel2.add(medicFiltrarePacientiNumePacientLabel, new GridConstraints(3, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicCautarePacientButton = new JButton();
        medicCautarePacientButton.setBackground(new Color(-2383653));
        medicCautarePacientButton.setText("Cautare");
        panel2.add(medicCautarePacientButton, new GridConstraints(3, 4, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicCautarePacientNumeTextField = new JTextField();
        panel2.add(medicCautarePacientNumeTextField, new GridConstraints(4, 3, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        medicCautarePacientTextArea = new JTextArea();
        panel2.add(medicCautarePacientTextArea, new GridConstraints(5, 3, 2, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        medicProgramDeLucruLabel = new JLabel();
        medicProgramDeLucruLabel.setText("Program de Lucru");
        panel2.add(medicProgramDeLucruLabel, new GridConstraints(7, 3, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicOraInceputLabel = new JLabel();
        medicOraInceputLabel.setText("Ora inceput");
        panel2.add(medicOraInceputLabel, new GridConstraints(8, 3, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicOraInceputTextField = new JTextField();
        panel2.add(medicOraInceputTextField, new GridConstraints(9, 3, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        medicOraFinalLabel = new JLabel();
        medicOraFinalLabel.setText("Ora final");
        panel2.add(medicOraFinalLabel, new GridConstraints(10, 3, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicOraFinalTextField = new JTextField();
        panel2.add(medicOraFinalTextField, new GridConstraints(11, 3, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        medicIntroducereProgramButton = new JButton();
        medicIntroducereProgramButton.setBackground(new Color(-2383653));
        medicIntroducereProgramButton.setText("Introducere");
        panel2.add(medicIntroducereProgramButton, new GridConstraints(12, 3, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicVizualizareFiseMedicaleTextArea = new JTextArea();
        panel2.add(medicVizualizareFiseMedicaleTextArea, new GridConstraints(4, 0, 8, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        medicVizualizareFiseMedicaleButton = new JButton();
        medicVizualizareFiseMedicaleButton.setBackground(new Color(-2383653));
        medicVizualizareFiseMedicaleButton.setText("Vizualizare");
        panel2.add(medicVizualizareFiseMedicaleButton, new GridConstraints(12, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicAcualizareFisaButton = new JButton();
        medicAcualizareFisaButton.setBackground(new Color(-2383653));
        medicAcualizareFisaButton.setText("Acualizare");
        panel2.add(medicAcualizareFisaButton, new GridConstraints(12, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicFiltrareTratamentTextArea = new JTextArea();
        panel2.add(medicFiltrareTratamentTextArea, new GridConstraints(11, 2, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        medicProgramConsultatiiTextArea = new JTextArea();
        panel2.add(medicProgramConsultatiiTextArea, new GridConstraints(4, 5, 8, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        medicVizualizareConsultatiiButton = new JButton();
        medicVizualizareConsultatiiButton.setBackground(new Color(-2383653));
        medicVizualizareConsultatiiButton.setText("Vizualizare");
        panel2.add(medicVizualizareConsultatiiButton, new GridConstraints(12, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicTitleLabel = new JLabel();
        Font medicTitleLabelFont = this.$$$getFont$$$("Castellar", Font.BOLD, 22, medicTitleLabel.getFont());
        if (medicTitleLabelFont != null) medicTitleLabel.setFont(medicTitleLabelFont);
        medicTitleLabel.setForeground(new Color(-13893586));
        medicTitleLabel.setText("MEDIC");
        panel2.add(medicTitleLabel, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        medicLogOutButton = new JButton();
        medicLogOutButton.setBackground(new Color(-2383653));
        medicLogOutButton.setText("Log Out");
        panel2.add(medicLogOutButton, new GridConstraints(0, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel1.add(spacer1, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        panel1.add(spacer2, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
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
