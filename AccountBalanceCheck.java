package com.java.fde.basiccontrol.staments.examples.two;

import java.util.Scanner;

public class AccountBalanceCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      BANK BALANCE STATUS CHECK SYSTEM    ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // --- Input ---
        System.out.print("Enter Account Holder Name   :- ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number        :- ");
        String accNo = sc.nextLine();

        System.out.print("Enter Current Balance (₹)   :- ");
        double balance = sc.nextDouble();

        System.out.print("Enter Minimum Balance Amount (₹) :- ");
        double minBal = sc.nextDouble();

        System.out.println("\n------------------------------------------");
        System.out.println("         WITHDRAWAL TRANSACTION           ");
        System.out.println("------------------------------------------");
        System.out.println("Account Holder   : " + name);
        System.out.println("Account Number   : " + accNo);
        System.out.printf ("Current Balance  : ₹%.2f%n", balance);
        System.out.printf ("Withdraw Amount  : ₹%.2f%n", minBal);
        System.out.println("------------------------------------------");

        // --- Validation ---
        if (balance <= 0 || minBal<0) {

            System.out.println(" Invalid Amount! amount must be greater than zero.");

        } else if (balance < minBal) {

            System.out.println("WARNING: Balance is below the minimum required balance!");
            System.out.printf ("Shortfall        : ₹%.2f%n", minBal - balance);
            System.out.println("Please deposit the shortfall to avoid penalty charges.");
        } else {          
            System.out.println("Minimum balance requirement is satisfied.");
            System.out.printf ("Surplus Balance  : ₹%.2f%n", balance - minBal);
        }

        System.out.println("------------------------------------------");
        System.out.println("       Thank you for Banking with us!      ");
        System.out.println("------------------------------------------");

        sc.close();

	}

}
