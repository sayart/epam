package com.gmail.slartua.string.model.entity;

public abstract class TextElement {
    private String value;
    
    public TextElement() {
        super();
    }

    public TextElement(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
