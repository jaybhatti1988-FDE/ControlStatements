package com.java.fde.basiccontrol.staments.examples.sixteen;

import java.util.Scanner;

public class InsurancePrmiumCalculation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      INSURNACE PRICE CHECK SYSTEM        ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // --- Input ---
        System.out.print("Enter yourAge   :- "); 
        while (!sc.hasNextDouble()) {
			System.out.println("Invalid Number. Enter age Again:- ");
			sc.next();
		}
        int age=sc.nextInt();
        
        System.out.println("\n------------------------------------------");
        System.out.println("            PREMIUM DETAILS                ");
        System.out.println("------------------------------------------");
        System.out.println("Customer Age       : " + age + " Year(s)");
        System.out.println("------------------------------------------");
        
        double premium;
                
        if (age<=0||age>100) {
        	System.out.println("Zero or negative values are not allowed.");
		}
        if (age <= 0 || age > 100) {

            System.out.println(" Invalid Age: Please enter an age between 1 and 100.");

        } else if (age <= 18) {

            premium = 2000;
            System.out.printf("Age Group          : Below/Up to 18 Years%n");
            System.out.printf("Annual Premium     : ₹%.2f%n", premium);

        } else if (age <= 35) {

            premium = 3500;
            System.out.printf("Age Group          : 19 - 35 Years%n");
            System.out.printf("Annual Premium     : ₹%.2f%n", premium);

        } else if (age <= 50) {

            premium = 5500;
            System.out.printf("Age Group          : 36 - 50 Years%n");
            System.out.printf("Annual Premium     : ₹%.2f%n", premium);

        } else if (age <= 65) {

            premium = 8500;
            System.out.printf("Age Group          : 51 - 65 Years%n");
            System.out.printf("Annual Premium     : ₹%.2f%n", premium);

        } else {

            premium = 12000;
            System.out.printf("Age Group          : Above 65 Years%n");
            System.out.printf("Annual Premium     : ₹%.2f%n", premium);

        }
        
        System.out.println("------------------------------------------");
        System.out.println("     Thank you for choosing our Insurance!  ");
        System.out.println("------------------------------------------");

        sc.close();
        
	}
        	

}
