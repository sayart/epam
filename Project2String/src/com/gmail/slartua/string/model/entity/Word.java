package com.gmail.slartua.string.model.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Word extends TextElement{
    public static final String REG_WORD = "^[a-zA-Zа-яА-Я]+$";

    public Word() {
        super();
    }

    public Word(String value) {
        super(value);
    }
        
    public static List<Word> getWordsFromSentence(Sentence sentence) {
    	List<Word> list = new ArrayList<>();
    	Pattern pattern = Pattern.compile(REG_WORD);
    	Matcher matcher = pattern.matcher(sentence.getValue());
    	while(matcher.find()) {
    		list.add(new Word(matcher.group()));    		
    	}
    	return list;	
    }  

    @Override
    public String toString() {
        return super.getValue();
    }
}
