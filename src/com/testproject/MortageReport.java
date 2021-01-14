package com.testproject;

import java.text.NumberFormat;

public class MortageReport {

    private final NumberFormat currency;
    private MortageCalculator mortageCalculator;

    public MortageReport(MortageCalculator mortageCalculator) {
        this.mortageCalculator = mortageCalculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public  void printMortgage() {
        double mortgage = mortageCalculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
         System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for(double balance: mortageCalculator.getRemainingBalances())
            System.out.println(currency.format(balance));
    }
}
