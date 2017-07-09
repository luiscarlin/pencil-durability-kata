package com.kata;

public class Paper {
    private String text;

    public Paper() {
        text = new String();
    }

    public void add(String text) {
        this.text += text;
    }

    public String getText() {
        return text;
    }
}
