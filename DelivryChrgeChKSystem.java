package com.java.fde.basiccontrol.staments.examples.fourteen;

import java.util.Scanner;

public class DelivryChrgeChKSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      DELIVERY CHARGE CHECK SYSTEM        ║");
        System.out.println("╚══════════════════════════════════════════╝");

       
        System.out.print("Enter Total Cart Amount (₹)         :- ");
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid Number. Enter Cart Amount Again :- ");
            sc.next();
        }
        double cartAmount = sc.nextDouble();

        System.out.print("Enter Free Delivery Threshold (₹)   :- ");
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid Number. Enter Threshold Again :- ");
            sc.next();
        }
        double freeDeliveryThreshold = sc.nextDouble();

        System.out.print("Enter Delivery Charge (₹)           :- ");
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid Number. Enter Charge Again :- ");
            sc.next();
        }
        double deliveryCharge = sc.nextDouble();

        System.out.println("\n------------------------------------------");
        System.out.println("            DELIVERY DETAILS               ");
        System.out.println("------------------------------------------");
        System.out.printf("Cart Amount          : ₹%.2f%n", cartAmount);
        System.out.printf("Free Delivery Above  : ₹%.2f%n", freeDeliveryThreshold);
        System.out.printf("Delivery Charge Rate : ₹%.2f%n", deliveryCharge);
        System.out.println("------------------------------------------");

      
        if (cartAmount <= 0 || freeDeliveryThreshold <= 0 || deliveryCharge < 0) {

            System.out.println(" Invalid Input: Cart amount and threshold must be greater than zero,");
            System.out.println("   and delivery charge cannot be negative.");

        } else if (cartAmount >= freeDeliveryThreshold) {

            System.out.println(" FREE DELIVERY applicable on this order!");
            System.out.printf("Delivery Charges     : ₹0.00%n");
            System.out.printf("Final Payable Amt    : ₹%.2f%n", cartAmount);

        } else {

            double amountNeeded = freeDeliveryThreshold - cartAmount;
            double finalAmount = cartAmount + deliveryCharge;

            System.out.println("Delivery charges apply for this order.");
            System.out.printf("Delivery Charges     : ₹%.2f%n", deliveryCharge);
            System.out.printf("Final Payable Amt    : ₹%.2f%n", finalAmount);
            System.out.printf("Add ₹%.2f more to get FREE delivery!%n", amountNeeded);

        }

        System.out.println("------------------------------------------");
        System.out.println("     Thank you for shopping with us!      ");
        System.out.println("------------------------------------------");
        
		sc.close();

	}
        	

}
