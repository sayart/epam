package com.gmail.slartua.journal.model;

import com.gmail.slartua.journal.model.entity.Student;

import java.util.ArrayList;

public class Journal<T extends Student>{
    private ArrayList<T> journal;

    public Journal() {
        super();
    }

    public Journal(ArrayList<T> journal) {
        super();
        this.journal = journal;
    }

    public ArrayList<T> getJournal() {
        return journal;
    }

    public void setJournal(ArrayList<T> journal) {
        this.journal = journal;
    }
    public void addStudent(T student){
        journal.add(student);
    }

}
