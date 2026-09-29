package com.java.fde.basiccontrol.staments.examples.eleven;

import java.util.Scanner;

public class ProductDiscountPrice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      ITEM DISCOUNT PRICE CHECK SYSTEM    ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // --- Input ---
        System.out.print("Enter your Product Price   :- "); 
        while (!sc.hasNextDouble()) {
			System.out.println("Invalid Number. Enter prdPrice Again:- ");
			sc.next();
		}
        double prdPrice=sc.nextDouble();
                
        if (prdPrice<=0) {
        	System.out.println("Zero or negative values are not allowed.");
		}
        else {
        	double prdPriceDisc = 0;
        	if(prdPrice<=4000 ){
    			System.out.printf("you do not need to pay any prdPriceDisc" );
    		}else if(prdPrice<=8000 ){
    			 prdPriceDisc =5;
    			System.out.printf("you  need to pay ₹%.2f%n" , prdPriceDisc );
    		}else if(prdPrice<=12000 ){
    			 prdPriceDisc =10;
    			System.out.printf("you need to pay ₹%.2f%n" , prdPriceDisc );
    		}else if(prdPrice<=16000 ){
    			 prdPriceDisc =15;
    			System.out.printf("you need to pay ₹%.2f%n" , prdPriceDisc );
    		}else if(prdPrice<=20000 ){
    			 prdPriceDisc =20;
    			System.out.printf("you need to pay ₹%.2f%n" , prdPriceDisc );
    		}else if(prdPrice<=24000 ){
    			 prdPriceDisc =25;
    			System.out.printf("you need to pay ₹%.2f%n" , prdPriceDisc );
    		}else {
    			 prdPriceDisc =30;
    			System.out.printf("you need to pay ₹%.2f%n" , prdPriceDisc );
    		}
            double discAmt=(prdPrice*prdPriceDisc)/100;
            double finalPrice=prdPrice-discAmt;
            System.out.println("\n------------------------------------------");
            System.out.println("            DISCOUNT DETAILS                ");
            System.out.println("--------------------------------------------");
            System.out.printf("Product Price     : ₹%.2f%n", prdPrice);
            System.out.printf("Discount Applied  : %.0f%%%n", prdPriceDisc);
            System.out.printf("Discount Amount   : ₹%.2f%n", discAmt);
            System.out.printf("Final Payable Amt : ₹%.2f%n", finalPrice);
            System.out.println("------------------------------------------");
        }
        sc.close();
        
	}
        	

}
