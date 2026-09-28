package com.java.fde.basiccontrol.staments.examples;

import java.util.Scanner;

public class AccountBalanceCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      BANK WITHDRAWAL CHECK SYSTEM        ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // --- Input ---
        System.out.print("Enter Account Holder Name   :- ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number        :- ");
        String accNo = sc.nextLine();

        System.out.print("Enter Current Balance (₹)   :- ");
        double balance = sc.nextDouble();

        System.out.print("Enter Withdrawal Amount (₹) :- ");
        double withdrawAmount = sc.nextDouble();

        System.out.println("\n------------------------------------------");
        System.out.println("         WITHDRAWAL TRANSACTION           ");
        System.out.println("------------------------------------------");
        System.out.println("Account Holder   : " + name);
        System.out.println("Account Number   : " + accNo);
        System.out.printf ("Current Balance  : ₹%.2f%n", balance);
        System.out.printf ("Withdraw Amount  : ₹%.2f%n", withdrawAmount);
        System.out.println("------------------------------------------");

        // --- Validation ---
        if (withdrawAmount <= 0) {

            System.out.println("❌ Invalid Amount! Withdrawal amount must be greater than zero.");

        } else if (withdrawAmount > balance) {

            System.out.println("❌ Insufficient Balance!");
            System.out.println("   Transaction Failed.");
            System.out.printf ("   You need ₹%.2f more to complete this withdrawal.%n",
                               withdrawAmount - balance);
            System.out.printf ("   Available Balance : ₹%.2f%n", balance);

        } else if (withdrawAmount == balance) {

            double remainingBalance = balance - withdrawAmount;
            System.out.println("  Warning : You are withdrawing your entire balance!");
            System.out.println("  Transaction Successful!");
            System.out.printf ("  Amount Withdrawn  : ₹%.2f%n", withdrawAmount);
            System.out.printf ("  Remaining Balance : ₹%.2f%n", remainingBalance);

        } else {

            double remainingBalance = balance - withdrawAmount;
            System.out.println("    Transaction Successful!");
            System.out.printf ("    Amount Withdrawn  : ₹%.2f%n", withdrawAmount);
            System.out.printf ("    Remaining Balance : ₹%.2f%n", remainingBalance);

        }

        System.out.println("------------------------------------------");
        System.out.println("       Thank you for Banking with us!      ");
        System.out.println("------------------------------------------");

        sc.close();

	}

}
