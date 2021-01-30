package com.talevski.viktor.example.bad;

public class InsuranceManager {
    public void processHealthInsurance(HealthInsurance healthInsurance) {
        if (healthInsurance.processHealthInsurance()) {
            System.out.println("HealthInsurance is active.");
        } else System.out.println("HealthInsurance is not active.");
    }

    public void processHomeInsurance(HomeInsurance homeInsurance) {
        if (homeInsurance.processHomeInsurance()) {
            System.out.println("HomeInsurance is active.");
        } else System.out.println("HomeInsurance is not active.");
    }
}
