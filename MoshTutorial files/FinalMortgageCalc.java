package com.javatutorial;

import java.text.NumberFormat;
import java.util.Scanner;

public class FinalMortgageCalc {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        boolean isPrincipalValid = false;
        boolean isInterestValid = false;
        boolean isYearsValid = false;
        int principal = 0;
        float annualInterest = 1;
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;;
        byte years = 10;
        int numberOfPayments = years*12;

        Scanner scanner = new Scanner(System.in);
        while (isPrincipalValid == false) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1000000){
                isPrincipalValid = true;
            }
            else {
                System.out.println("Please enter a number within the valid range!");
            }
        }
        while (isInterestValid == false) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
            monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
            if (annualInterest > 0 && annualInterest < 30){
                isInterestValid = true;
            }
            else {
                System.out.println("Please enter a number greater than zero but less than 30");
            }
        }
        while (isYearsValid == false) {
            System.out.print("Period (in years): ");
            years = scanner.nextByte();
            numberOfPayments = years * MONTHS_IN_YEAR;
            if (years >= 1 && years <= 30){
                isYearsValid = true;
            }
            else {
                System.out.println("Please enter a number between 1 and 30");
            }
        }
        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))/(Math.pow(1 + monthlyInterest, numberOfPayments) -1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Monthly Mortgage: " + mortgageFormatted);
    }
}
