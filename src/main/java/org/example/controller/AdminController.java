package org.example.controller;

import org.example.model.entity.User;
import org.example.model.repository.UserRepository;
import org.example.utils.SessionManager;
import org.example.view.AdminForm;
import org.example.view.LoginForm;
import org.springframework.stereotype.Controller;

import javax.swing.*;
import java.util.List;

@Controller
public class AdminController {

    AdminForm adminForm;
    private UserRepository userRepository = new UserRepository();

    public AdminController(AdminForm adminForm) {
        this.adminForm = adminForm;

        adminForm.getAdminCreareUserButton().addActionListener(e->this.handleCreateUser());
        adminForm.getAdminVizualizareUsersButton().addActionListener(e->this.handleViewAllUsers());
        adminForm.getAdminLogOutButton().addActionListener(e->this.handleLogOut());
        adminForm.getAdminUpdateUserButton().addActionListener(e->this.handleUpdateUser());
        adminForm.getAdminStergereUserButton().addActionListener(e->this.handleDeleteUser());
        adminForm.getAdminFiltrareUtilizatoriComboBox().addActionListener(e->handleFilterByUserType());
    }

    public void handleViewAllUsers(){
        adminForm.getAdminVizualizareUsersTextArea().setText("");
        List<User> allUsers = userRepository.readAll();
        for (User user : allUsers) {
            String rol = (user.getRole() == 1) ? "administrator" : (user.getRole() == 2) ? "medic" : "asistent";
            adminForm.getAdminVizualizareUsersTextArea().append("ID User: " + user.getIdUser() + "\n" + "Username: " + user.getUsername() + "\n" + "Password: " + user.getPassword() + "\n" + "Rol: " + rol + "\n" + "\n");
        }
    }

    public void handleCreateUser() {
        String username = adminForm.getAdminCreateUsernameTextField().getText();
        String password = adminForm.getAdminCreatePasswordTextField().getText();
        Integer rol = Integer.parseInt(adminForm.getAdminCreateTypeUserTextField().getText());

        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(password);
        newUser.setRole(rol);

        userRepository.save(newUser);

        adminForm.update();
    }

    public void handleUpdateUser() {
        String username = adminForm.getAdminUpdateUsernameTextField().getText();
        String password = adminForm.getAdminUpdatePasswordTTextField().getText();
        Integer idUtilizator = Integer.parseInt(adminForm.getAdminUpdateIDUserTextField().getText());

        User existingUser = userRepository.findByID(idUtilizator);

        Integer rol = existingUser.getRole();

        User newUser = new User();
        newUser.setIdUser(idUtilizator);
        newUser.setUsername(username);
        newUser.setPassword(password);
        newUser.setRole(rol);

        userRepository.update(newUser);

        adminForm.update();
    }

    public void handleDeleteUser() {
        Integer idUser = Integer.parseInt(adminForm.getAdminStergereUserTextField().getText());
        User userToDelete = userRepository.findByID(idUser);
        userRepository.delete(userToDelete);

        adminForm.update();
    }

    public void handleFilterByUserType(){
        String selectedRole = adminForm.getAdminFiltrareUtilizatoriComboBox().getSelectedItem().toString();
        Integer role ;
        if(selectedRole.equals("Admin")) role = 1;
        else if(selectedRole.equals("Medic")) role = 2;
        else role =3;

        adminForm.getAdminFiltrareUtilizatoriTextArea().setText("");

        List<User> allUsers = userRepository.allUsersByUserTypeID(role);

        for(User user : allUsers){
            adminForm.getAdminFiltrareUtilizatoriTextArea().append("Username : " + user.getUsername() + "\n");
        }
    }

    public void handleLogOut() {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(adminForm.getPanel1());
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
