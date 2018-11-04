package com.gmail.slartua.lingvo;

import java.util.HashMap;
import java.util.Map;

public class Lingvo {
    private Map<String, String> dictionary = new HashMap<>();

    public Lingvo() {
        super();
    }

    public Map<String, String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    private String translateWord(String word){
        String result = dictionary.get(word);
        if (result == null) {
            return word;
        }else return result;
    }

    public void addWords(String englishWord, String russianWord){
        dictionary.put(englishWord, russianWord);
    }

    public String translateSentence(String sentence){
        String[] words = sentence.split("[ ,.!]");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            if(word != null){
                sb.append(translateWord(word) + " ");
            }
        }
        return sb.toString();
    }





}
