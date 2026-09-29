package com.java.fde.basiccontrol.staments.examples.twele;

import java.util.Scanner;

public class ProductCategoryPrice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      CATEGORY OFFERS MENU SYSTEM         ║");
        System.out.println("╚══════════════════════════════════════════╝");

        System.out.println("\n========= SELECT CATEGORY =========");
        System.out.println(" 1. Electronics");
        System.out.println(" 2. Clothing");
        System.out.println(" 3. Grocery");
        System.out.println("====================================");
        System.out.print("Enter Your Choice :- ");
        
        while (!sc.hasNextDouble()) {
			System.out.println("Invalid Number. Enter prdPrice Again:- ");
			sc.next();
		}
        int choice=sc.nextInt();
        
        String category,offrDetails;
        double discntpercent;
        
        switch (choice) {
		case 1:
			category="Electronics";
			offrDetails="Flat discount on Mobiles, Laptops & Accessories";
			discntpercent=10;
			break;
			
		case 2:
			category="Clothing";
			offrDetails="Buy 2 Get 1 Free on select Apparel brands";
			discntpercent=20;
			break;
			
		case 3:
			category="Grocery";
			offrDetails="Cashback on Daily Essentials & Staples";
			discntpercent=30;
			break;	
		
		default:
			category="Unknown";
			offrDetails="No Offers";
			discntpercent=0;
			
		}
         
        System.out.println("\n------------------------------------------");
        System.out.println("           CATEGORY DETAILS                ");
        System.out.println("------------------------------------------");
        System.out.println("Selected Category : " + category);
        System.out.println("Offer Details     : " + offrDetails);
        
        if (choice<1 || choice>3) {
			System.out.println("Invalid Category Entered....!");
		} else {
			 System.out.printf("Discount Offered  : %.0f%%%n", discntpercent);
		}
        System.out.println("------------------------------------------");
        System.out.println("     Thank you for shopping with us!      ");
        System.out.println("------------------------------------------");
        
		sc.close();

        
	}
        	

}
