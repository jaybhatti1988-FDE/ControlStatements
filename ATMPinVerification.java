package com.java.fde.basiccontrol.staments.examples.two;

import java.util.Scanner;

public class ATMPinVerification {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      BANK ATM PIN STATUS CHECK SYSTEM    ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // --- Input ---
       
        System.out.print("Enter Account Number        :- ");
        String accNo = sc.nextLine();

        System.out.print("Enter your Pin   :- ");
        int pin = sc.nextInt();

        System.out.print("Enter your Confirm Pin   :- ");
        int confirmpin = sc.nextInt();
        
       

        System.out.println("\n------------------------------------------");
        System.out.println("             PIN VERIFICATION               ");
        System.out.println("------------------------------------------");
           System.out.println("Account Number   : " + accNo);
           System.out.println("------------------------------------------");

        // --- Validation ---
        
        if (pin == confirmpin) {

            System.out.println(" Valid Pin! Your Pin is correct, Welcome "+ accNo + " ! ");
           
        }else if(pin<=0 ||confirmpin<=0||pin>7||confirmpin>7)
        	
        {
        	System.out.println("Entered PIN should be poitive and not Zer .");
        	System.out.println("WARNING: PIN must be 6 digits.");
        }
        
        

        System.out.println("------------------------------------------");
        System.out.println("       Thank you for Banking with us!      ");
        System.out.println("------------------------------------------");

        sc.close();

	}

}
