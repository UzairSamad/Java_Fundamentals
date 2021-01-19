package com.testproject;

public class Employe {
            private int baseSalary;
            private int hourlyRate;
    public static int numberOfEmployess= 0;

    public Employe(int baseSalary){
            this(baseSalary,0);
    }
    public Employe(int baseSalary, int hourlyRate){
        setHourlyRate(hourlyRate);
        setBaseSalary(baseSalary);
        numberOfEmployess++;
    }

    private void  setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Salary Should be more than 1");
        this.baseSalary = baseSalary;
    }
    private void setHourlyRate(int hourlyRate){
        if(hourlyRate < 0)
            throw new IllegalArgumentException("Hourly Rate Should be more than 0");
        this.hourlyRate = hourlyRate;
    }

    public int calWage(int extraHours){
        return this.baseSalary + (this.hourlyRate*extraHours);
    }
    public int calWage(){
        return this.calWage(0);

    }
}
