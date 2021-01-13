package com.testproject;

import java.text.NumberFormat;

public class PrintMortafe {

    private MortageCalculator mortageCalculator;

    public PrintMortafe(MortageCalculator mortageCalculator) {
        this.mortageCalculator = mortageCalculator;
    }

    public  void printMortgage() {
        double mortgage = mortageCalculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
         System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= mortageCalculator.getYears() * MortageCalculator.MONTHS_IN_YEAR; month++) {
            double balance = mortageCalculator.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
