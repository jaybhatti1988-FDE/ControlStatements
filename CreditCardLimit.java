package com.java.fde.basiccontrol.staments.examples.nine;

import java.util.Scanner;

public class CreditCardLimit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      CREDIT CARD CHECK SYSTEM            ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // --- Input ---
        System.out.print("Enter Purchase Amount (₹)   :- "); 
        while (!sc.hasNextDouble()) {
			System.out.println("Invalid Number. Enter Salary Again:- ");
			sc.next();
		}
        double amt=sc.nextDouble();
        
        System.out.print("Enter Credit Limit (₹)   :- "); 
        while (!sc.hasNextDouble()) {
			System.out.println("Invalid Number. Enter Salary Again:- ");
			sc.next();
		}
        double creditLimit=sc.nextDouble();
        
        System.out.println("\n------------------------------------------");
        System.out.println("          TRANSACTION DETAILS             ");
        System.out.println("------------------------------------------");
        System.out.printf("Purchase Amount   : ₹%.2f%n", amt);
        System.out.printf("Credit Limit      : ₹%.2f%n", creditLimit);
        System.out.println("------------------------------------------");
                
        if (amt<=0||creditLimit<=0) {
        	System.out.println("Zero or negative values are not allowed.");
		} else if(amt>creditLimit ){
			System.out.printf("TRANSACTION DECLINED: Purchase amount exceeds credit limit." );
			System.out.printf("   Amount Over Limit : ₹%.2f%n", amt - creditLimit);
		}
		else {
			double limit =creditLimit-amt;
			System.out.printf("Remaning Credit Limit ₹%.2f%n" , limit );
		}
        
        sc.close();

	}

}
