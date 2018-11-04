package com.gmail.slartua.string.model;

import com.gmail.slartua.string.model.entity.Sentence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextService {
//    private Sentence[] sentences;

    public String loadTextFromFile(File file){
        StringBuilder sb = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String text = "";
            for (; (text = bufferedReader.readLine()) !=null;){
                sb.append(text);
                sb.append(System.lineSeparator());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return sb.toString();
    }

    public Sentence[] getSentencesFromText(String string){
        Sentence[] sentences = string.split("")
    }



}
