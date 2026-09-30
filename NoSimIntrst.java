package com.java.fde.basiccontrol.staments.examples.twentyfour;

import java.util.Scanner;

public class NoSimIntrst {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   MULTIPLE ACCOUNT INTEREST CALCULATION  ║");
        System.out.println("╚══════════════════════════════════════════╝");
		
        System.out.print("Enter No. of Accounts :- ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid Number. Enter Again :- ");
            sc.next();
        }
        int noAccnts = sc.nextInt();
        sc.nextLine();
        
        if (noAccnts<=0) {
			System.out.println("Invalid Input: Number of accounts must be greater than zero.");
		}else {
			
			double totalInterest=0;
			for (int i = 1; i < noAccnts; i++) {
				 System.out.println("\n------------------------------------------");
	             System.out.println("          ACCOUNT " + i + " DETAILS");
	             System.out.println("------------------------------------------");
	             
	             System.out.print("Enter Account Number      :- ");
	             String accNo=sc.nextLine().trim();
	             
	             System.out.println("Enter Principal Amount      :- ");
	             while (!sc.hasNextDouble()) {
	                    System.out.print("Invalid Number. Enter Principal Again :- ");
	                    sc.next();
	                }
	                double principal = sc.nextDouble();
	                
	                System.out.print("Enter Rate of Interest (%) :- ");
	                while (!sc.hasNextDouble()) {
	                    System.out.print("Invalid Number. Enter Rate Again :- ");
	                    sc.next();
	                }
	                double rate = sc.nextDouble();

	                System.out.print("Enter Time Period (Years)  :- ");
	                while (!sc.hasNextInt()) {
	                    System.out.print("Invalid Number. Enter Time Again :- ");
	                    sc.next();
	                }
	                int time = sc.nextInt();
	                sc.nextLine();    
	                
	                double interest=(principal*rate*time)/100;
	                totalInterest=totalInterest+interest;
	                
	                System.out.println("------------------------------------------");
	                System.out.println("Account Number     : " + accNo);
	                System.out.printf ("Principal Amount   : ₹%.2f%n", principal);
	                System.out.printf ("Rate of Interest   : %.2f%%%n", rate);
	                System.out.println("Time Period        : " + time + " Year(s)");
	                System.out.printf ("Interest Earned    : ₹%.2f%n", interest);
	                System.out.printf ("Total Amount       : ₹%.2f%n", principal + interest);
			}
		
		
        System.out.println("\n------------------------------------------");
        System.out.println("           OVERALL SUMMARY                  ");
        System.out.println("------------------------------------------");
        System.out.println("Total Accounts Processed : " + noAccnts);
        System.out.printf ("Total Interest (All Accts): ₹%.2f%n", totalInterest);
        System.out.println("------------------------------------------");
		}
        System.out.println("------------------------------------------");
        System.out.println("     Thank you for Surffing with us!      ");
        System.out.println("------------------------------------------");
			sc.close();
		}
	}

