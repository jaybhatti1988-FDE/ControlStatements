package com.java.fde.basiccontrol.staments.examples.four;

import java.util.Scanner;

public class LoanEligibilityCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║      BANK LOAN ELIGIBILITY CHECK SYSTEM    ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // --- Input ---
       
        System.out.print("Enter Loan Account Number        :- ");
        String loanAccNo = sc.nextLine();

        System.out.print("Enter your Loan Amount you want   :- ");
        int LoanAmt = sc.nextInt();

        System.out.print("Enter your Credit Score   :- ");
        int CrdScr = sc.nextInt();
        
       

        System.out.println("\n------------------------------------------");
        System.out.println("             LOAN ELIGIBILITY VERIFICATION               ");
        System.out.println("------------------------------------------");
           System.out.println("Loan Account Number   : " + loanAccNo);
           System.out.println("Loan Amount    : " + LoanAmt);
           System.out.println("Loan Credit Score    : " + CrdScr);
           System.out.println("------------------------------------------");

        // --- Validation ---
        
        if (CrdScr <= 400) {
        	
        	System.out.println("WARNING: Credit Score Low...! You are not eligible for Loan .");
            
           
        }else if(CrdScr<=0 ||CrdScr>1000)
        	System.out.println("Entered PIN should be poitive and not Zer .");

        else {
        	System.out.println("Your Credit Score of Loan Account "+ loanAccNo +" User your Credit Score" + CrdScr +" is Good you eligible for Loan");
        }
              

        System.out.println("------------------------------------------");
        System.out.println("  Thank you for Finance Banking with us!  ");
        System.out.println("------------------------------------------");

        sc.close();

	}

}
