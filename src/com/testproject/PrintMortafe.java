package com.testproject;

import java.text.NumberFormat;

public class PrintMortafe {

    private MortageCalculator mortageCalculator;

    public  void printMortgage(int principal, float annualInterest, byte years) {
        mortageCalculator = new MortageCalculator(principal,annualInterest,years);
        double mortgage = mortageCalculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule(int principal, float annualInterest, byte years) {
         mortageCalculator = new MortageCalculator(principal,annualInterest,years);
         System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= years * Main.MONTHS_IN_YEAR; month++) {
            double balance = mortageCalculator.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
