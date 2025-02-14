package org.example.view;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import lombok.Getter;
import org.example.controller.AdminController;
import org.example.model.entity.User;
import org.example.model.repository.UserRepository;
import org.example.utils.LanguageManager;

import javax.swing.*;
import java.awt.*;
import java.util.List;

@Getter
public class AdminForm implements Observer {
    private JPanel panel1;
    private JLabel adminTitleLabel;
    private JLabel adminIconLabel;
    private JTextArea adminVizualizareUsersTextArea;
    private JButton adminLogOutButton;
    private JTextField adminCreateUsernameTextField;
    private JTextField adminCreatePasswordTextField;
    private JTextField adminCreateTypeUserTextField;
    private JButton adminCreareUserButton;
    private JTextField adminUpdateIDUserTextField;
    private JTextField adminUpdateUsernameTextField;
    private JTextField adminUpdatePasswordTTextField;
    private JButton adminUpdateUserButton;
    private JTextField adminStergereUserTextField;
    private JButton adminStergereUserButton;
    private JComboBox adminFiltrareUtilizatoriComboBox;
    private JTextArea adminFiltrareUtilizatoriTextArea;
    private JButton adminVizualizareUsersButton;
    private JLabel adminCreateUserLabel;
    private JLabel adminViewUsersLabel;
    private JLabel adminUpdateUserLabel;
    private JLabel adminDeleteUserLabel;
    private JLabel adminCreateUserUsernameLabel;
    private JLabel adminCreateUserPasswordLabel;
    private JLabel adminCreateUserTypeUserLabel;
    private JLabel adminUpdateIDUserLabel;
    private JLabel adminUpdateUsernameLabel;
    private JLabel adminUpdatePasswordLabel;
    private JLabel adminStergereIDUserLabel;
    private JLabel adminFiltrareUtilizatoriLabel;

    private UserRepository userRepository = new UserRepository();

    private AdminController adminController;

    public AdminForm() {

        adminController = new AdminController(this);

        initComboBox();
        languageSetter();
        initObservers();
    }

    public void languageSetter() {
        this.adminTitleLabel.setText(LanguageManager.getString("adminTitleLabel"));
        this.adminLogOutButton.setText(LanguageManager.getString("adminLogOutButton"));
        this.adminCreareUserButton.setText(LanguageManager.getString("adminCreareUserButton"));
        this.adminUpdateUserButton.setText(LanguageManager.getString("adminUpdateUserButton"));
        this.adminStergereUserButton.setText(LanguageManager.getString("adminStergereUserButton"));
        this.adminVizualizareUsersButton.setText(LanguageManager.getString("adminVizualizareUsersButton"));
        this.adminCreateUserLabel.setText(LanguageManager.getString("adminCreateUserLabel"));
        this.adminViewUsersLabel.setText(LanguageManager.getString("adminViewUsersLabel"));
        this.adminUpdateUserLabel.setText(LanguageManager.getString("adminUpdateUserLabel"));
        this.adminDeleteUserLabel.setText(LanguageManager.getString("adminDeleteUserLabel"));
        this.adminCreateUserTypeUserLabel.setText(LanguageManager.getString("adminCreateUserTypeUserLabel"));
        this.adminUpdateIDUserLabel.setText(LanguageManager.getString("adminUpdateIDUserLabel"));
        this.adminUpdateUsernameLabel.setText(LanguageManager.getString("adminUpdateUsernameLabel"));
        this.adminUpdatePasswordLabel.setText(LanguageManager.getString("adminUpdatePasswordLabel"));
        this.adminStergereIDUserLabel.setText(LanguageManager.getString("adminStergereIDUserLabel"));
        this.adminFiltrareUtilizatoriLabel.setText(LanguageManager.getString("adminFiltrareUtilizatoriLabel"));
        this.adminCreateUserPasswordLabel.setText(LanguageManager.getString("adminCreateUserPasswordLabel"));
        this.adminCreateUserUsernameLabel.setText(LanguageManager.getString("adminCreateUserUsernameLabel"));
    }

    public void initComboBox() {
        this.adminFiltrareUtilizatoriComboBox.addItem("Admin");
        this.adminFiltrareUtilizatoriComboBox.addItem("Asistent");
        this.adminFiltrareUtilizatoriComboBox.addItem("Medic");
    }

    private void initObservers() {
        userRepository.readAll().forEach(user -> user.attach(this));
    }

    @Override
    public void update() {

        List<User> allUsers = userRepository.readAll();
        StringBuilder sb = new StringBuilder();

        for (User user : allUsers) {
            String rol = (user.getRole() == 1) ? "administrator" : (user.getRole() == 2) ? "medic" : "asistent";
            sb.append("ID User: " + user.getIdUser() + "\n" +
                    "Username: " + user.getUsername() + "\n" +
                    "Password: " + user.getPassword() + "\n" +
                    "Rol: " + rol + "\n\n");
        }

        JTextArea textArea = this.getAdminVizualizareUsersTextArea();
        textArea.setText(sb.toString());
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
        panel1.setBackground(new Color(-2252579));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(11, 4, new Insets(0, 0, 0, 0), -1, -1));
        panel2.setBackground(new Color(-2526763));
        panel1.add(panel2, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        adminTitleLabel = new JLabel();
        adminTitleLabel.setForeground(new Color(-13893586));
        adminTitleLabel.setText("ADMIN");
        panel2.add(adminTitleLabel, new GridConstraints(1, 0, 1, 4, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminIconLabel = new JLabel();
        adminIconLabel.setIcon(new ImageIcon(getClass().getResource("/images/administrator.png")));
        adminIconLabel.setText("");
        panel2.add(adminIconLabel, new GridConstraints(2, 0, 1, 4, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminViewUsersLabel = new JLabel();
        adminViewUsersLabel.setText("Vizualizare Users");
        panel2.add(adminViewUsersLabel, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminCreateUserLabel = new JLabel();
        adminCreateUserLabel.setText("Creare User");
        panel2.add(adminCreateUserLabel, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminUpdateUserLabel = new JLabel();
        adminUpdateUserLabel.setText("Update User");
        panel2.add(adminUpdateUserLabel, new GridConstraints(3, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminDeleteUserLabel = new JLabel();
        adminDeleteUserLabel.setText("Stergere User");
        panel2.add(adminDeleteUserLabel, new GridConstraints(3, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminVizualizareUsersTextArea = new JTextArea();
        panel2.add(adminVizualizareUsersTextArea, new GridConstraints(4, 0, 6, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        adminLogOutButton = new JButton();
        adminLogOutButton.setBackground(new Color(-2514727));
        adminLogOutButton.setText("Log out");
        panel2.add(adminLogOutButton, new GridConstraints(0, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminCreateUserUsernameLabel = new JLabel();
        adminCreateUserUsernameLabel.setText("Username");
        panel2.add(adminCreateUserUsernameLabel, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminCreateUsernameTextField = new JTextField();
        panel2.add(adminCreateUsernameTextField, new GridConstraints(5, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        adminCreateUserPasswordLabel = new JLabel();
        adminCreateUserPasswordLabel.setText("Password");
        panel2.add(adminCreateUserPasswordLabel, new GridConstraints(6, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminCreatePasswordTextField = new JTextField();
        panel2.add(adminCreatePasswordTextField, new GridConstraints(7, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        adminCreateUserTypeUserLabel = new JLabel();
        adminCreateUserTypeUserLabel.setText("Tip Utilizator (2 : medic ; 3 : asistent)");
        panel2.add(adminCreateUserTypeUserLabel, new GridConstraints(8, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminCreateTypeUserTextField = new JTextField();
        panel2.add(adminCreateTypeUserTextField, new GridConstraints(9, 1, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        adminCreareUserButton = new JButton();
        adminCreareUserButton.setBackground(new Color(-2252579));
        adminCreareUserButton.setText("Creare");
        panel2.add(adminCreareUserButton, new GridConstraints(10, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminUpdateIDUserLabel = new JLabel();
        adminUpdateIDUserLabel.setText("ID User");
        panel2.add(adminUpdateIDUserLabel, new GridConstraints(4, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminUpdateIDUserTextField = new JTextField();
        panel2.add(adminUpdateIDUserTextField, new GridConstraints(5, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        adminUpdateUsernameLabel = new JLabel();
        adminUpdateUsernameLabel.setText("Username");
        panel2.add(adminUpdateUsernameLabel, new GridConstraints(6, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminUpdateUsernameTextField = new JTextField();
        panel2.add(adminUpdateUsernameTextField, new GridConstraints(7, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        adminUpdatePasswordLabel = new JLabel();
        adminUpdatePasswordLabel.setText("Password");
        panel2.add(adminUpdatePasswordLabel, new GridConstraints(8, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminUpdatePasswordTTextField = new JTextField();
        panel2.add(adminUpdatePasswordTTextField, new GridConstraints(9, 2, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        adminUpdateUserButton = new JButton();
        adminUpdateUserButton.setBackground(new Color(-2383653));
        adminUpdateUserButton.setText("Update");
        panel2.add(adminUpdateUserButton, new GridConstraints(10, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminStergereIDUserLabel = new JLabel();
        adminStergereIDUserLabel.setText("ID User");
        panel2.add(adminStergereIDUserLabel, new GridConstraints(4, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminStergereUserTextField = new JTextField();
        panel2.add(adminStergereUserTextField, new GridConstraints(5, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        adminStergereUserButton = new JButton();
        adminStergereUserButton.setBackground(new Color(-2383653));
        adminStergereUserButton.setText("Stergere");
        panel2.add(adminStergereUserButton, new GridConstraints(6, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminFiltrareUtilizatoriLabel = new JLabel();
        adminFiltrareUtilizatoriLabel.setText("Filtrare Utilizatori");
        panel2.add(adminFiltrareUtilizatoriLabel, new GridConstraints(7, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminFiltrareUtilizatoriComboBox = new JComboBox();
        adminFiltrareUtilizatoriComboBox.setBackground(new Color(-2383653));
        panel2.add(adminFiltrareUtilizatoriComboBox, new GridConstraints(8, 3, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        adminFiltrareUtilizatoriTextArea = new JTextArea();
        panel2.add(adminFiltrareUtilizatoriTextArea, new GridConstraints(9, 3, 2, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        adminVizualizareUsersButton = new JButton();
        adminVizualizareUsersButton.setBackground(new Color(-2252579));
        adminVizualizareUsersButton.setText("Vizualizare");
        panel2.add(adminVizualizareUsersButton, new GridConstraints(10, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
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
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }

}
