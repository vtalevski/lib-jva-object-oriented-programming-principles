package com.talevski.viktor;

import com.talevski.viktor.example.bad.HealthInsurance;
import com.talevski.viktor.example.bad.HomeInsurance;
import com.talevski.viktor.example.bad.InsuranceManager;

/**
 * Reference link for the OCP - Open Closed Principle - 'https://springframework.guru/principles-of-object-oriented-design/open-closed-principle'.
 */
public class OpenClosedPrincipleApplication {
    public static void main(String[] args) {
        System.out.println("Bad example.");

        InsuranceManager badInsuranceManager = new InsuranceManager();
        badInsuranceManager.processHealthInsurance(new HealthInsurance());
        badInsuranceManager.processHomeInsurance(new HomeInsurance());

        System.out.println("------------------------------");

        System.out.println("Good example.");

        com.talevski.viktor.example.good.InsuranceManager goodInsuranceManager = new com.talevski.viktor.example.good.InsuranceManager();
        goodInsuranceManager.processInsurance(new com.talevski.viktor.example.good.HealthInsurance());
        goodInsuranceManager.processInsurance(new com.talevski.viktor.example.good.HomeInsurance());
    }
}
