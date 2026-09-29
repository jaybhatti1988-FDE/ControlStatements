package com.java.fde.basiccontrol.staments.examples.ten;

import java.util.Scanner;

public class EMICheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      EMI CHECK SYSTEM                    ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // --- Input ---
        System.out.print("Enter Salary (₹)   :- "); 
        while (!sc.hasNextDouble()) {
			System.out.println("Invalid Number. Enter Salary Again:- ");
			sc.next();
		}
        double salary=sc.nextDouble();
        
        System.out.print("Enter Existing EMI Amount (₹)   :- "); 
        while (!sc.hasNextDouble()) {
			System.out.println("Invalid Number. Enter Salary Again:- ");
			sc.next();
		}
        double existEMI=sc.nextDouble();
        
        System.out.print("Enter MAX Allowed EMI Percent (%)   :- "); 
        while (!sc.hasNextDouble()) {
			System.out.println("Invalid Number. Enter Salary Again:- ");
			sc.next();
		}
        double maxEmiPercent=sc.nextDouble();
        
        System.out.println("\n------------------------------------------");
        System.out.println("          TRANSACTION DETAILS             ");
        System.out.println("------------------------------------------");
        System.out.printf("Salary    		 : ₹%.2f%n", salary);
        System.out.printf("Existing EMI      : ₹%.2f%n", existEMI);
        System.out.printf("Max EMI           : %.2f%n", maxEmiPercent);
        System.out.println("------------------------------------------");
                
        if (salary<=0||existEMI<=0||maxEmiPercent<=0||maxEmiPercent>100) {
        	System.out.println("Zero or negative values are not allowed.");
        	System.out.println("Max EMI Percentage 100.");
		} else {
			double emiPercent=(existEMI/salary)*100;
			double maxAllowedEmi=(salary*maxEmiPercent)/100;

            System.out.printf("EMI as %% of Salary   : %.2f%%%n", emiPercent);
            System.out.printf("Max Allowed EMI (₹)  : ₹%.2f%n", maxAllowedEmi);
            System.out.println("------------------------------------------");
		
        if (emiPercent>maxEmiPercent) {
        	System.out.println("NOT ELIGIBLE: Existing EMI exceeds " + maxEmiPercent + "% of salary.");
            System.out.printf("   Reduce EMI by at least ₹%.2f to qualify.%n", existEMI - maxAllowedEmi);

		} else {
			double availableEmi=maxAllowedEmi-existEMI;

            System.out.printf("ELIGIBLE for a new loan.");
            System.out.printf(" Additional EMI you can afford : ₹%.2f%n", availableEmi);
            System.out.println("------------------------------------------");
		 }
		}
        sc.close();

	}

}
