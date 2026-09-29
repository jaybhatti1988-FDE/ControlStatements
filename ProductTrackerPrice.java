package com.java.fde.basiccontrol.staments.examples.therteen;

import java.util.Scanner;

public class ProductTrackerPrice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      ORDER STATUS TRACKER SYSTEM         ║");
        System.out.println("╚══════════════════════════════════════════╝");

        System.out.println("\n========= SELECT CATEGORY =========");
        System.out.println(" 1. Placed");
        System.out.println(" 2. Shipped");
        System.out.println(" 3. Delivered");
        System.out.println("====================================");
        System.out.print("Enter Your Choice :- ");
        
        while (!sc.hasNextDouble()) {
			System.out.println("Invalid Number. Enter Order Status Again:- ");
			sc.next();
		}
        int choice=sc.nextInt();
        

        
        switch (choice) {
		case 1:
			System.out.println(" Order Status : Placed");
            System.out.println("Your order has been placed successfully.");
			break;
			
		case 2:
			   System.out.println(" Order Status : Shipped");
               System.out.println("Your order is on its way.");
			break;
			
		case 3:
			   System.out.println(" Order Status : Delivered");
               System.out.println("Your order has been delivered successfully.");
			break;	
		
		default:
			System.out.println(" Invalid Status Code: " + choice);
            System.out.println("   Please enter 1, 2, or 3.");
			
		}
                
        System.out.println("------------------------------------------");
        System.out.println("     Thank you for shopping with us!      ");
        System.out.println("------------------------------------------");
        
		sc.close();

        
	}
        	

}
