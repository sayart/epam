package com.gmail.slartua.journal.controller;

import com.gmail.slartua.journal.View.InputUtility;
import com.gmail.slartua.journal.View.View;
import com.gmail.slartua.journal.model.Journal;
import com.gmail.slartua.journal.model.entity.Student;

import java.time.LocalDate;

public class Controller {
    private Journal<Student> model = new Journal<>();
    private View view = new View();

    public void run(){
        addStudentToJournal();
        view.printJournal("Journal", model.getJournal());

    }
    private void addStudentToJournal(){
        String firstName = InputUtility.inputFirstName(view);
        String secondName = InputUtility.inputSecondName(view);
        LocalDate dateOfBirth = InputUtility.inputDateOfBirth(view);
        String phoneNumber = InputUtility.inputPhoneNumber(view);
        String adress = InputUtility.inputAdress(view);
        Student student = new Student(firstName, secondName, dateOfBirth, phoneNumber, adress);
        model.addStudent(student);
    }
}
