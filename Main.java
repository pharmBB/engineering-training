package com.blessying;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         final byte MONTH_IN_YEAR = 12;
         final byte PERCENT = 100;

         Scanner scanner = new Scanner(System.in);

         System.out.print("Principal: ");
         int principle = scanner.nextInt();

         System.out.print("Annual Interest: ");
          float annualInterest = scanner.nextFloat();
          float monthlyInterest = annualInterest / PERCENT / MONTH_IN_YEAR;

         System.out.print("Period (Years): ");
         int period = scanner.nextInt();
         int numberOfPayment = period * MONTH_IN_YEAR;

         double mortgage = numberOfPayment * monthlyInterest * principle;
        System.out.print(mortgage);
    }
}
