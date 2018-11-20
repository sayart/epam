package com.gmail.slartua.string.model.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sentence extends TextElement {
	public static final String REG_SENTENCE = "(?<=[a-z])\\.\\s+";

	public Sentence() {
		super();
	}

	public Sentence(String value) {
		super(value);
	}

	public static Sentence[] getSentencesFromText(String string) {
		String[] stringSentences = string.split(REG_SENTENCE);
		Sentence[] sentences = new Sentence[stringSentences.length];
		for (int i = 0; i < sentences.length; i++) {
			sentences[i] = new Sentence(stringSentences[i]);
		}
		return sentences;
	}

	public static boolean isUniqueSentence(Sentence sentence) {
		List<Word> list = Word.getWordsFromSentence(sentence);
		Map<String, Integer> words = new HashMap<>();
		for (Word word : list) {
			String key = word.getValue().toLowerCase();
			if (words.containsKey(key)) {
				return false;
			} else {
				words.put(key, 1);
			}
		}
		return true;
	}

}
