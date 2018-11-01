package com.gmail.slartua.lingvo;

import java.util.HashMap;
import java.util.Map;

public class Lingvo {
    private Map<String, String> dictionary;

    public Lingvo() {
        super();
        dictionary = new HashMap<>();
    }

    public String translateWord(String word){
        String result = dictionary.get(word);
        if (result == null) {
            return word;
        }else return result;
    }

    public void addWords(String englishWord, String russianWord){
        dictionary.put(englishWord, russianWord);
    }




}
