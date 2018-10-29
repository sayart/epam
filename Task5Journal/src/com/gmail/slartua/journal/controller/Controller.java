package com.gmail.slartua.journal.controller;

import com.gmail.slartua.journal.View.InputUtility;
import com.gmail.slartua.journal.View.View;
import com.gmail.slartua.journal.com.gmail.slartua.journal.model.Journal;
import com.gmail.slartua.journal.com.gmail.slartua.journal.model.entity.Student;

public class Controller {
    private Journal<Student> model = new Journal<>();
    private View view = new View();

    public void run(){
        view.printMessage(InputUtility.inputFirstName(view));
    }
}
