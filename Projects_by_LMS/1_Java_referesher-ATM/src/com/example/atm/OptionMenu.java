package com.example.atm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account{

	Scanner menuInput = new Scanner(System.in);
		DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
		
		HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
		
		public void getLogin() throws IOException {
			int x=1;
			do {
				try {
					data.put(123, 123);
					data.put(456, 456);
					System.out.println("Welcome to the ATM");
					System.out.println("Enter Account Number");
					setAccountNumber(menuInput.nextInt());
					
					System.out.println("Enter pin number");
					setPinNumber(menuInput.nextInt());
				}
				catch (Exception e) {
					System.out.println("\n" + "Invalid characters. Only numbers" + "\n" );
					x=2;	
				}
				
				int an =getAccountNumber();
				int pn = getPinNumber();
				if (data.containsKey(an) && data.get(an) == pn) {
					getAccountType();
				} else
					System.out.println("\n" + "Wrong Account Number or pin number" + "\n");
				
			} while (x==1);
		}
		
		public void getAccountType() {
			System.out.println("Select account you want to access:");
			System.out.println("Type 1 - Current Account");
			System.out.println("Type 2 - Saving Account");
			System.out.println("Type 3 - Exit");
			
			int selection = menuInput.nextInt();
			
			switch (selection) {
			case 1:
				getCurrent();
				break;
				
			case 2:
				getSaving();
				break;
				
			case 3:
				System.out.println("Thank you for using the ATM \n");
				break;
				
				default:
					System.out.println("\n" + "Invalid Choice" + "\n");
					getAccountType();
				
			}
		}
			
			
			
			 public void getCurrent() {
				 System.out.println("Current Account: ");
				 System.out.println("Type 1 - View Balance");
				 System.out.println("Type 2 - Withdraw Funds");
				 System.out.println("Type 3 - Deposit Funds");
				 System.out.println("Type 4 - Exit");
				 System.out.println("Choice: ");
				 
				 int selection1 = menuInput.nextInt();
				 
				 switch (selection1) {
				 case 1:
					 System.out.println("Checking Account Balance:" + moneyFormat.format(getCurrentBalance()));
					 getAccountType();
					 break;
					 
				 case 2:
					 getCurrentWithdrawInput();
					 getAccountType();
					 break;
					 
				 case 3:
					 getCurrentDepositInput();
					 getAccountType();
					 break;
				 case 4:
					 System.out.println("Thank you for using ATM");
					 break;
					 
					 default:
					 System.out.println("\n" + "Invalid Choice" + "\n");
					 getCurrent();
				 }
			 }
			 
			 
			 
			 public void getSaving() {
				 System.out.println("Saving Account: ");
				 System.out.println("Type 1 - View Balance");
				 System.out.println("Type 2 - Withdraw Funds");
				 System.out.println("Type 3 - Deposit Funds");
				 System.out.println("Type 4 - Exit");
				 System.out.println("Choice: ");
				 
				 int selection2 = menuInput.nextInt();
				 
				 switch (selection2) {
				 case 1:
					 System.out.println("Checking Account Balance:" + moneyFormat.format(getSavingBalance()));
					 getAccountType();
					 break;
					 
				 case 2:
					 getsavingWithdrawInput();
					 getAccountType();
					 break;
					 
				 case 3:
					 getSavingDepositInput();
					 getAccountType();
					 break;
				 case 4:
					 System.out.println("Thank you for using ATM");
					 break;
					 
				 default:
					 System.out.println("\n" + "Invalid Choice" + "\n");
					 getSaving();
						 
				 }
			 
			 }
}

