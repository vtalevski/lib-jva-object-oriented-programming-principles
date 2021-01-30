package com.talevski.viktor.example.good;

public class TextModifier {
    private Text text;

    public TextModifier(Text text) {
        this.text = text;
    }

    public String toUpperCase() {
        return text.getText().toUpperCase();
    }

    public String removeSubText(String subText) {
        text.setText(text.getText().replaceAll(subText, ""));
        return text.getText();
    }
}
