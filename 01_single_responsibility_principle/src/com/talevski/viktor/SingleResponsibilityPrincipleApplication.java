package com.talevski.viktor;

import com.talevski.viktor.example.bad.Text;
import com.talevski.viktor.example.good.TextModifier;
import com.talevski.viktor.example.good.TextReader;

/**
 * Reference link for the SRP - Single Responsibility Principle - 'https://springframework.guru/principles-of-object-oriented-design/single-responsibility-principle'.
 * Reference link for the difference between the SRP and SOC - Separation Of Concerns -'https://stackoverflow.com/questions/1724469/difference-between-single-responsibility-principle-and-separation-of-concerns'.
 */
public class SingleResponsibilityPrincipleApplication {
    public static void main(String[] args) {
        System.out.println("Bad example.");

        Text badText = new Text();
        badText.setText("This is the main method of the SingleResponsibilityPrincipleApplication class.");
        badText.removeSubText("SingleResponsibilityPrincipleApplication ");
        badText.readText();

        System.out.println("------------------------------");

        System.out.println("Good example.");

        com.talevski.viktor.example.good.Text goodText = new com.talevski.viktor.example.good.Text();
        goodText.setText("This is the main method of the SingleResponsibilityPrincipleApplication class.");

        TextModifier textModifier = new TextModifier(goodText);
        textModifier.removeSubText("SingleResponsibilityPrincipleApplication ");

        TextReader textReader = new TextReader(goodText);
        textReader.readText();
    }
}
