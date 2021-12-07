package org.bank;

import java.util.Scanner;

public class Bankaccount {
	public static void main(String[] args) {
		Bankacc ob = new Bankacc("ajith","1234");
		ob.showmenu();

	}
}
 class Bankacc {

	int BALANCE;
	int PREVIOUS_TRANSACTION;
	String CUSTOMERNAME;
	String CUSTOMERID;

	Bankacc(String cname, String cid){
		CUSTOMERNAME = cname;
		CUSTOMERID = cid;
	}

	public void deposit(int amount) {
		if (amount != 0) {
			BALANCE = BALANCE + amount;
			System.out.println("BALANCE :" + BALANCE);
			PREVIOUS_TRANSACTION = amount;

		}

	}

	public void withdraw(int amount) {
		if (amount != 0) {
			BALANCE = BALANCE - amount;
			PREVIOUS_TRANSACTION = -amount;
		}
	}

	public void getpretran() {
		if (PREVIOUS_TRANSACTION > 0) {
			System.out.println("DEPOSITED:" + PREVIOUS_TRANSACTION);
		} else if (PREVIOUS_TRANSACTION < 0) {
			System.out.println("WITHDRAWN:" + PREVIOUS_TRANSACTION);
		} else
			;
		System.out.println("NO TRANSACTION OCCURED");

	}

	public void showmenu() {
		
		char option = '\0';
		Scanner s = new Scanner(System.in);
		
		System.out.println("customername:" + CUSTOMERNAME);
		System.out.println("CUSTOMERID:" + CUSTOMERID );
		System.out.println("\n");
		System.out.println("A.CHECK BALANCE:");
		System.out.println("B.DEPOSIT:");
		System.out.println("C.WITHDRAW:");
		System.out.println("D.PREVIOUSTRANCACTION:");
		System.out.println("E.EXIT: ");
		
		do {
			System.out.println("==================================================================================================================");
			System.out.println("ENTER AN OPTION:");
			option = s.next().charAt(0);
			System.out.println("-------------------------------------------------------------------------------------------------------------------");
			System.out.println("\n");
			
			switch( option ) {
			
			case 'A':
				System.out.println("---------------------------------------------------------------------------------------------------------------");
				System.out.println("BALANCE: " + BALANCE);
				System.out.println("===============================================================================================================");
				System.out.println("\n");
				break;
			
			case 'B':
				System.out.println("==========================================================================================================");
				System.out.println("ENTER AN AMOUNT TO DEPOSIT:");
				System.out.println("----------------------------------------------------------------------------------------------------------");
				int ni = s.nextInt();
				deposit(ni);
				System.out.println("\n");
				break;
				
			case 'c':
				System.out.println("==========================================================================================================");
				System.out.println("enter an amount to withdrawn:");
				System.out.println("----------------------------------------------------------------------------------------------");
				int ni1 = s.nextInt();
				withdraw(ni1);
				System.out.println("\n");
				break;
 				
			case 'D':
				System.out.println("===============================================================================================================");
				getpretran();
				System.out.println("---------------------------------------------------------------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("********************************************************************************************************************");
				break;
				
			default:
				System.out.println("INVALID OPTION PLEASE ENTER AGAIN:");
				break;
				
			
			}
			
			
		}while(option != 'E');
		System.out.println("thankyou for using our service");
		
		
    }

}
