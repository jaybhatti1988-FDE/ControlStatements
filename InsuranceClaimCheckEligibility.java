package com.java.fde.basiccontrol.staments.examples.eighteen;

import java.util.Scanner;

public class InsuranceClaimCheckEligibility {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      INSURANCE CLAIM ELIGIBILTY CHECK    ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // --- Input ---
        System.out.print("Enter your Policy Duration   :- "); 
        while (!sc.hasNextDouble()) {
			System.out.println("Invalid Number. Enter age Again:- ");
			sc.next();
		}
        int poliyDuration=sc.nextInt();
        
        System.out.print("Enter Claim Amount (₹)              :- ");
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid Number. Enter Claim Amount Again :- ");
            sc.next();
        }
        double claimAmount = sc.nextDouble();

        System.out.print("Enter Minimum Required Duration (Yrs) :- ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid Number. Enter Minimum Duration Again :- ");
            sc.next();
        }
        int minPolicyDuration = sc.nextInt();

        
        System.out.println("\n------------------------------------------");
        System.out.println("           CLAIM ELIGIBILITY                ");
        System.out.println("------------------------------------------");
        System.out.println("Policy Duration    : " + poliyDuration + " Year(s)");
        System.out.printf("Claim Amount       : ₹%.2f%n", claimAmount);
        System.out.println("Minimum Required   : " + minPolicyDuration + " Year(s)");
        System.out.println("------------------------------------------");
        
        
                
        if (poliyDuration  <=0 ||claimAmount<=0||minPolicyDuration<=0) {
        	System.out.println("Zero or negative values are not allowed.");
        	 System.out.printf("and claim amount must be greater than zero.");
        } 
        else if (poliyDuration < minPolicyDuration) {
      
        	System.out.println("CLAIM NOT ALLOWED: Policy duration is below the minimum requirement.");
            System.out.printf("Wait %d more year(s) before you can file a claim.%n", minPolicyDuration - poliyDuration);

        }  else {
        
       	 System.out.println("CLAIM ALLOWED: Policy duration meets the minimum requirement.");
       	 System.out.printf("Claim of ₹%.2f can be processed.%n", claimAmount);

        }
        
        System.out.println("------------------------------------------");
        System.out.println("     Thank you for choosing our Insurance!  ");
        System.out.println("------------------------------------------");

        sc.close();
        
	}
        	

}
