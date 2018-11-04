package com.gmail.slartua.lingvo;

public class Main {
    public static void main(String[] args) {
        Lingvo lingvo = new Lingvo();
//        int numberOfWords = View.inputNumberOfWords();
       for (int count = 0; count < 2; count++){
           lingvo.addWords(View.inputEnglishWord(), View.inputRussianWord());
       }
       View.printMessage(lingvo.translateSentence(View.inputSentenceToTranslate()));

    }

}
