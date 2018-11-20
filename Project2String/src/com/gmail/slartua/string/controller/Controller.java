package com.gmail.slartua.string.controller;

import com.gmail.slartua.string.model.TextModel;
import com.gmail.slartua.string.model.TextService;
import com.gmail.slartua.string.model.entity.Sentence;
import com.gmail.slartua.string.view.View;

public class Controller {
	private TextModel model = new TextModel();
	private View view = new View();
	
	public void run() {
		model.countUniqueSentence(Sentence.getSentencesFromText(TextService.loadTextFromFile(view.inputFilePath())));
		view.printMessage(model.toString());
	}

}
