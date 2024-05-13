package org.example.model.entity;

import org.example.view.Observer;

public interface Subject {

    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers();
}
