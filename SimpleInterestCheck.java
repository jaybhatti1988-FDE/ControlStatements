package com.java.fde.basiccontrol.staments.examples.six;

import java.util.Scanner;

public class SimpleInterestCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      SIMPLE INTEREST CHECK SYSTEM        ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // --- Input ---
        System.out.print("Enter Principal   :- "); 
        while (!sc.hasNextDouble()) {
			System.out.println("Invalid Number. Enter Principal Again:- ");
			sc.next();
		}
        double principal=sc.nextDouble();
        
        System.out.print("Enter ROI         :- ");
        while (!sc.hasNextDouble()) {
			System.out.println("Invalid Number. Enter ROI Again:- ");
			sc.next();
		}
        double roi = sc.nextDouble();

        System.out.print("Enter Tenture     :- ");
        while (!sc.hasNextInt()) {
			System.out.println("Invalid Number. Enter Tenture Again:- ");
			sc.next();
		}
        int tenture = sc.nextInt();
        
        if (principal<=0||roi<=0||tenture<=0) {
        	System.out.println("Zero or negative values are not allowed.");
		} else {

        double simpleInterest=(principal*roi*tenture)/100;
        double totalAmt=principal+simpleInterest;
        System.out.println("\n------------------------------------------");
        System.out.println("          SIMPLE INTEREST DETAILS         ");
        System.out.println("------------------------------------------");
        System.out.printf ("Principal Amount  : ₹%.2f%n", principal);
        System.out.printf ("Rate of Interest  : %.2f%%%n", roi);
        System.out.println("Tenure            : " + tenture + " Year(s)");
        System.out.printf ("Simple Interest   : ₹%.2f%n", simpleInterest);
        System.out.printf ("Total Amount      : ₹%.2f%n", totalAmt);
        System.out.println("------------------------------------------");
		}
        sc.close();

	}

}
