package com.talevski.viktor.example.good;

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
}
