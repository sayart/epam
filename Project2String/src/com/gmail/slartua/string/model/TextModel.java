package com.gmail.slartua.string.model;

import com.gmail.slartua.string.model.entity.Sentence;

public class TextModel {
	private int uniqueSentence = 0;

	public TextModel() {
		super();
	}

	public int getUniqueSentence() {
		return uniqueSentence;
	}
	
	public void countUniqueSentence(Sentence[] sentences) {
		for (Sentence sentence : sentences) {
			if(Sentence.isUniqueSentence(sentence)) 
				uniqueSentence++;
		}
	}
	
	@Override
	public String toString() {
		return "TextModel [uniqueSentences=" + uniqueSentence + "]";
	}
	
	
}
