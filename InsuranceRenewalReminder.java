package com.java.fde.basiccontrol.staments.examples.nighteen;

import java.util.Scanner;

public class InsuranceRenewalReminder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║     POLICY RENEWAL REMINDER SYSTEM       ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // --- Input ---
        System.out.print("Enter Days Remaining for Policy Expiry :- ");
        while (!sc.hasNextInt()) {
			System.out.println("Invalid Number. Enter age Again:- ");
			sc.next();
		}
        int daysLeft =sc.nextInt();
                
        System.out.println("\n------------------------------------------");
        System.out.println("           RENEWAL STATUS                   ");
        System.out.println("------------------------------------------");
        System.out.println("Days Remaining     : " + daysLeft + " Day(s)");
        System.out.println("------------------------------------------");
             
                
        if (daysLeft < 0) {

            System.out.println("POLICY EXPIRED: Your policy expired " + (-daysLeft) + " day(s) ago.");
            System.out.println("Immediate renewal required to restore coverage.");

        } else if (daysLeft == 0) {

            System.out.println("URGENT: Your policy expires TODAY!");
            System.out.println("Renew immediately to avoid a coverage gap.");

        } else if (daysLeft <= 7) {

            System.out.println("HIGH URGENCY: Policy expires in " + daysLeft + " day(s).");
            System.out.println("Renew now to avoid losing coverage.");

        } else if (daysLeft <= 30) {

            System.out.println("MEDIUM URGENCY: Policy expires in " + daysLeft + " day(s).");
            System.out.println("Please renew soon to stay covered.");

        } else if (daysLeft <= 60) {

            System.out.println("LOW URGENCY: Policy expires in " + daysLeft + " day(s).");
            System.out.println("Renewal recommended within the next couple of months.");

        } else {

            System.out.println("NO ACTION NEEDED: Policy is valid for " + daysLeft + " more day(s).");

        }
        
        System.out.println("------------------------------------------");
        System.out.println("     Thank you for choosing our Insurance!  ");
        System.out.println("------------------------------------------");

        sc.close();
        
	}
        	

}
