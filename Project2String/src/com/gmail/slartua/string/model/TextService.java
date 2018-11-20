package com.gmail.slartua.string.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextService {

    public static String loadTextFromFile(String filePath){
        StringBuilder sb = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(filePath)))){
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
    
    

}
