package com.talevski.viktor.example.bad;

public class Text {
    private String text;
    private Integer length;
    private String subText;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        length = text.length();
    }

    public Integer getLength() {
        return length;
    }

    public String getSubText() {
        return subText;
    }

    public void setSubText(String subText) {
        this.subText = subText;
    }

    public String toUpperCase() {
        return text.toUpperCase();
    }

    public String removeSubText(String subText) {
        text = text.replaceAll(subText, "");
        return text;
    }

    public void readText() {
        System.out.println(text);
    }
}
