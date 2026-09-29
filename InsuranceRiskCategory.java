package com.java.fde.basiccontrol.staments.examples.twenty;

import java.util.Scanner;

public class InsuranceRiskCategory {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      VEHICLE INSURANCE RISK CATEGORY     ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // --- Input ---
        System.out.print("Enter your Vehicle Age   :- "); 
        while (!sc.hasNextDouble()) {
			System.out.println("Invalid Number. Enter age Again:- ");
			sc.next();
		}
        int vehicleAge=sc.nextInt();
        
        System.out.println("\n------------------------------------------");
        System.out.println("            PREMIUM DETAILS                ");
        System.out.println("------------------------------------------");
        System.out.println("Customer Age       : " + vehicleAge + " Year(s)");
        System.out.println("------------------------------------------");
        
        
                
        if (vehicleAge <=0) {
        	System.out.println("Zero or negative values are not allowed.");
		} 
        else if (vehicleAge <= 3) {
      
			  System.out.println("Risk Category   : LOW RISK");
	          System.out.println("Newer vehicles are generally more reliable and safer.");

        } else if (vehicleAge <= 7) {
            
      			  System.out.println("Risk Category   : Medium RISK");
      	          System.out.println("Moderate wear and tear increases claim likelihood.");

        } else {
        
       	 System.out.println("Risk Category   : Higher RISK");
         System.out.println("Older vehicles have higher chances of breakdown and claims.");

        }
        
        System.out.println("------------------------------------------");
        System.out.println("     Thank you for choosing our Insurance!  ");
        System.out.println("------------------------------------------");

        sc.close();
        
	}
        	

}
