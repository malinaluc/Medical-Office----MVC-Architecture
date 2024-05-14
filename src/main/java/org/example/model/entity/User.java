package org.example.model.entity;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.view.Observer;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User implements Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;

    private String username;
    private String password;
    /**
     * Role of the user.
     * Possible values:
     * 1 -> Administrator
     * 2 -> Medic
     * 3 -> Assistant
     */
    @NotNull
    private Integer role;



    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Transient
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o){
        observers.add(o);
    }
    @Override
    public void detach(Observer o){
        observers.remove(o);
    }
    @Override
    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
