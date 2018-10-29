package com.gmail.slartua.journal.View;

import com.gmail.slartua.journal.model.entity.Student;

import java.util.ArrayList;

public class View implements ConstantMessages {
    public void printMessage(String message) {
        System.out.println(message);
    }
    public void printJournal(String message, ArrayList<Student> journal){
        System.out.println(message);
        if(journal.isEmpty())System.out.println("Journal is empty!");
        for (Student student : journal) {
            if (student != null) {
                System.out.println(student.toString());
            }
        }
    }
}
