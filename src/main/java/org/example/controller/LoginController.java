package org.example.controller;

import lombok.extern.apachecommons.CommonsLog;
import org.example.model.entity.User;
import org.example.model.repository.UserRepository;
import org.example.utils.LanguageManager;
import org.example.utils.SessionManager;
import org.example.view.AdminForm;
import org.example.view.AsistentForm;
import org.example.view.LoginForm;
import org.example.view.MedicForm;
import org.springframework.stereotype.Controller;

import javax.swing.*;

import static org.example.utils.ExtensionFunctions.logDebug;

@Controller
public class LoginController {

    private final LoginForm loginForm;

    private final org.example.model.repository.UserRepository userRepository = new UserRepository();

    public LoginController(LoginForm loginForm) {
        this.loginForm = loginForm;
    }

    public void handleLoginAction(){

        String username = loginForm.getUsernameTextField().getText();
        char[] passwordChar = loginForm.getPasswordTextField().getPassword();
        String password = new String(passwordChar);
        String selectedLanguage = String.valueOf(loginForm.getLanguageComboBox().getSelectedItem());
        logDebug("Username = " + username + " and Password = " + password);

        LanguageManager.loadLanguage(LanguageManager.stirngToLanguage(selectedLanguage));
        User user = userRepository.getUserByEmailAndPassword(username, password);

        if (user != null) {

            SessionManager.getInstance().loginUser(user.getIdUser(), user.getUsername(), user.getPassword());
            if (user.getRole() == 2) showMedicForm();
            else if (user.getRole() == 1) showAdminForm();
            else showAsistentForm();
        } else
            JOptionPane.showMessageDialog(null, "Wrong username or password", "Error Message", JOptionPane.INFORMATION_MESSAGE);

    }

    public void showMedicForm() {

        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(loginForm.getPanel1());
        frame.setVisible(false);
        MedicForm medicForm = new MedicForm();
        JFrame medicFrame = new JFrame("Medic Form");
        medicFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        medicFrame.getContentPane().add(medicForm.getPanel1());
        medicFrame.setSize(700, 700);
        medicFrame.setLocationRelativeTo(null);
        medicFrame.setVisible(true);
    }

    public void showAdminForm() {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(loginForm.getPanel1());
        frame.setVisible(false);
        AdminForm adminForm = new AdminForm();
        JFrame adminFrame = new JFrame("Admin Form");
        adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adminFrame.getContentPane().add(adminForm.getPanel1());
        adminFrame.setSize(700, 700);
        adminFrame.setLocationRelativeTo(null);
        adminFrame.setVisible(true);
    }

    public void showAsistentForm() {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(loginForm.getPanel1());
        frame.setVisible(false);
        AsistentForm asistentForm = new AsistentForm();
        JFrame asistentFrame = new JFrame("Asistent Frame");
        asistentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        asistentFrame.getContentPane().add(asistentForm.getPanel1());
        asistentFrame.setSize(700, 700);
        asistentFrame.setLocationRelativeTo(null);
        asistentFrame.setVisible(true);
    }

}
