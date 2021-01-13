package com.testproject;

//import java.text.NumberFormat;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.Scanner;
//
//
//public class Main {
//    /*
//            *******Procedural Approach ***********
//    public static void main(String[] args) {
//       int baseSalary = 50_000;
//       int extraHours = 10;
//       int hourlyRate = 20;
//
//       int wage = calcWage(baseSalary,extraHours,hourlyRate);
//        System.out.println(wage);
//    }
//
//    public static  int calcWage(int baseSalary,int extraHours,int hourlyRate){
//        return baseSalary + (extraHours*hourlyRate);
//    }
//*/
//
//    //            *******Object Oriented Approach***********
////      we encapsulated the implementation in employee class here
//        public static void main(String[] args) {
//            Employe employee = new Employe(500,22);
//            int wage1 = employee1.calWage();
//            System.out.println(Employe.numberOfEmployess);
//        }
//}


public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        PrintMortafe printMortafe = new PrintMortafe();
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);
        printMortafe.printPaymentSchedule(principal, annualInterest, years);


    }

}
