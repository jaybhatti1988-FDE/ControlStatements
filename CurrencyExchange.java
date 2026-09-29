package com.java.fde.basiccontrol.staments.examples.five;

import java.util.Scanner;

public class CurrencyExchange {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      CURRENCY OPERATION SYSTEM            ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // --- Input ---
        System.out.print("Enter Amount (₹)       :- ");
        while (!sc.hasNextDouble()) {
			System.out.println("Invalid Number. Enter Salary Again:- ");
			sc.next();
		}
        double amt = sc.nextDouble();
        
       
        
        int choice;
        
        do {
        	 System.out.println("\n------------------------------------------");
             System.out.println("         CURRENCY MENU                      ");
             System.out.println("--------------------------------------------");
             System.out.println("1) US");
             System.out.println("2) EUR");
             System.out.println("3) AUS");
             System.out.println("4) Exit");
             System.out.println("Select an Option");
             choice=sc.nextInt();
             
             switch (choice) {
			case 1:
				double us=amt/95.91;
				 System.out.printf("US Dollar is $%.2f%n",us);
				break;
				
			case 2:
				double eur=amt/109.00;
				 System.out.printf("EURO is €%.2f%n",eur);
				break;
				
			case 3:
				double aus=amt/67.23;
				 System.out.printf("AUS Dollar is $%.2f%n",aus);
				break;
				
			case 4:
				  System.out.println("-----------------------------------------------");
			      System.out.println("       Thank you  for Surfing with us!     	 ");
			      System.out.println("-----------------------------------------------");
				break;	

			default:
				System.out.println("Invalid Option Please select 1-4");
			}
             
		} while (choice!=4); 
        sc.close();
	}
       
}
