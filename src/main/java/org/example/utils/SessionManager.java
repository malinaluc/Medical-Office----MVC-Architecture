package org.example.utils;

public class SessionManager {
    private static SessionManager instance;
    private static LoggedInUser loggedInUser;

    private SessionManager() {}


    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public static void loginUser(Integer loggedInUserID, String username, String password) {
        loggedInUser = new LoggedInUser(loggedInUserID, username, password);
    }

    public static LoggedInUser getLoggedInUser() {
        return loggedInUser;
    }

    public static void logOutUser() {
        loggedInUser = null;
    }

}
