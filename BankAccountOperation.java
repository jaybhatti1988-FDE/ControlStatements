package com.java.fde.basiccontrol.staments.examples.five;

import java.util.Scanner;

public class BankAccountOperation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      BANKING OPERATION SYSTEM            ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // --- Input ---
        System.out.print("Enter Account Number        :- ");
        String accNo = sc.nextLine();
        
        System.out.print("Enter Account Holder Name   :- ");
        String name = sc.nextLine();

        System.out.print("Enter Current Balance (₹)   :- ");
        double balance = sc.nextDouble();
        sc.nextLine();
        
        int choice;
        
        do {
        	 System.out.println("\n------------------------------------------");
             System.out.println("         BANKING MENU                       ");
             System.out.println("--------------------------------------------");
             System.out.println("1) Deposit");
             System.out.println("2) Withdraw");
             System.out.println("3) Balance Inquiry");
             System.out.println("4) Exit");
             System.out.println("Select an Option");
             choice=sc.nextInt();
             
             switch (choice) {
			case 1:
				 System.out.print("Enter Amount (₹)   :- ");
			        double amount = sc.nextDouble();
			        if (amount>0) {
						balance=balance+amount;
						printReceipt(accNo,name,"Deposit",amount,balance);
					} else {
						System.out.println("Invalid Amount, Amount Should be Positive");
					}
				break;
				
			case 2:
		        System.out.print("Enter Withdrawal Amount (₹) :- ");
		        double withdrawAmount = sc.nextDouble();
		        
		        if (withdrawAmount <= 0) {

		            System.out.println("❌ Invalid Amount! Withdrawal amount must be greater than zero.");

		        } else if (withdrawAmount > balance) {
		            System.out.println("❌ Insufficient Balance!"+String.format("%.2f", balance));
		        }else {
		        	balance=balance-withdrawAmount;
		        	printReceipt(accNo, name, "Withdraw", withdrawAmount, balance);
		        }
				break;
				
			case 3:
				System.out.println("\n------------------------------------------");
		        System.out.println("         BALANCE INQUIRY                    ");
		        System.out.println("--------------------------------------------");
		        System.out.println("Account Number   : " + accNo);
		        System.out.println("Account Holder   : " + name);
		        System.out.printf ("Amount   : ₹%.2f%n", balance);
		        System.out.println("--------------------------------------------");
				break;
				
			case 4:
				  System.out.println("-----------------------------------------------");
			      System.out.println("  Thank you " + name + " for Banking with us!  ");
			      System.out.println("-----------------------------------------------");
				break;	

			default:
				System.out.println("Invalid Option Please select 1-4");
			}
             
		} while (choice!=4); 
        sc.close();
	}
        private static void printReceipt(String accNo, String name, String type, double amount, double balance) {
        System.out.println("\n------------------------------------------");
        System.out.println("         BANKING TRANSACTION                ");
        System.out.println("--------------------------------------------");
        System.out.println("Account Number   : " + accNo);
        System.out.println("Account Holder   : " + name);
        System.out.printf ("Transaction Type : %s%n", type);
        System.out.printf ("Transaction Amount   : ₹%.2f%n", amount);
        System.out.printf ("\nCurrent Balance  : ₹%.2f%n", balance);
        System.out.println("------------------------------------------");
       }
}
