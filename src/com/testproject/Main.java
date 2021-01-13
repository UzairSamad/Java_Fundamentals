package com.testproject;

public class Main {

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        MortageCalculator calculator = new MortageCalculator(principal,annualInterest,years);
        MortageReport mortageReport = new MortageReport(calculator);
        mortageReport.printPaymentSchedule();
        mortageReport.printMortgage();
    }

}
