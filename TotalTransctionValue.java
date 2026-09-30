package com.java.fde.basiccontrol.staments.examples.twentyone;

import java.util.Scanner;

public class TotalTransctionValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("╔══════════════════════════════════════════╗");
		System.out.println("║      TOTAL TRANSACTION VALUE SYSTEM      ║");
		System.out.println("╚══════════════════════════════════════════╝");

		// --- Input ---
		System.out.print("Enter Number of Transaction   :- ");
		while (!sc.hasNextInt()) {
			System.out.println("Invalid Number. Enter age Again:- ");
			sc.next();
		}
		int noOfTrnstion = sc.nextInt();

		if (noOfTrnstion <= 0) {
			System.out.println("Zero and Negative Values are not allowed");

		} else {
			double totalValue = 0;
			double highest = Double.MIN_VALUE;
			double lowest = Double.MAX_VALUE;

			System.out.println("\n------------------------------------------");
			System.out.println("         ENTER TRANSACTION AMOUNTS          ");
			System.out.println("--------------------------------------------");

			for (int i = 1; i <= noOfTrnstion; i++) {
				System.out.print("Enter Amount of Transaction   :- "+ i + "(₹) :");
				while (!sc.hasNextDouble()) {
					System.out.println("Invalid Number. Enter age Again:- ");
					sc.next();
				}
				double amt = sc.nextDouble();
				totalValue = totalValue + amt;
				if (amt > highest) {
					highest = amt;
				}
				if (amt < lowest) {
					lowest = amt;
				}
				double avgValue = totalValue / noOfTrnstion;
				System.out.println("\n------------------------------------------");
				System.out.println("           TRANSACTION SUMMARY             ");
				System.out.println("------------------------------------------");
				System.out.println("Total Transactions : " + noOfTrnstion);
				System.out.printf("Total Value         : ₹%.2f%n", totalValue);
				System.out.printf("Average Value       : ₹%.2f%n", avgValue);
				System.out.printf("Highest Transaction : ₹%.2f%n", highest);
				System.out.printf("Lowest Transaction  : ₹%.2f%n", lowest);
				System.out.println("------------------------------------------");
			}
			System.out.println("------------------------------------------");
			System.out.println("     Thank you for choosing our Banking!  ");
			System.out.println("------------------------------------------");

			sc.close();
		}
	}
}
