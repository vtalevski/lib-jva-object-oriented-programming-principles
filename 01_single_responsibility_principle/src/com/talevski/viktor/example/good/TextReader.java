package com.talevski.viktor.example.good;

public class TextReader {
    private Text text;

    public TextReader(Text text) {
        this.text = text;
    }

    public void readText() {
        System.out.println(text.getText());
    }
}
