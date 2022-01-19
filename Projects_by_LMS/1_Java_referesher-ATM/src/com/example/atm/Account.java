package com.example.atm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account
{
private double currentBalance =  10000;		      
private double savingBalance =  12000;
private int accountNumber;
private int pinNumber;

Scanner input = new Scanner(System.in);
DecimalFormat moneyFormat = new DecimalFormat("'$' ###,##0.00");

public int setAccountNumber(int accountNumber) {
this.accountNumber = accountNumber;
return accountNumber;
}

public int getAccountNumber() {
	return accountNumber;
	
}

public int setPinNumber(int pinNumber) {
	this.pinNumber = pinNumber;
	return pinNumber;
}
public int getPinNumber() {
	return pinNumber;	
}

public double getCurrentBalance() {
	return currentBalance;
}

public double getSavingBalance() {
	return savingBalance;
}

public double calcCurrentWithdraw(double amount) {
	currentBalance = (currentBalance - amount);
	return currentBalance;
}
public double calcSavingWithdraw(double amount) {
	savingBalance = (savingBalance - amount);
	return savingBalance;
}
public double calcCurrentDeposit(double amount) {
	currentBalance = (currentBalance + amount);
	return currentBalance;
}

public double calcSavingDeposit(double amount) {
	savingBalance = (savingBalance + amount);
	return savingBalance;
}

public void getCurrentWithdrawInput() {
	System.out.println("Current Account Balance:" + moneyFormat.format(currentBalance));
	System.out.println("Amount you want to withdraw from Current Account:");
	double amount = input.nextDouble();
	
	if ((currentBalance - amount) >=0) {
		calcCurrentWithdraw(amount);
		System.out.println("New Current Account Balance:" + moneyFormat.format(currentBalance));
		
	}
	else {
		System.out.println("Balance cannot be Negative." +"\n");
	}
}

public void getsavingWithdrawInput() {
	System.out.println("Saving Account Balance:" + moneyFormat.format(savingBalance));
	System.out.println("Amount you want to withdraw from Saving Account:");
	double amount = input.nextDouble();
	
	if ((savingBalance - amount) >=0) {
		calcSavingWithdraw(amount);
		System.out.println("New Savings Account Balance:" + moneyFormat.format(savingBalance));
		
	}
	else {
		System.out.println("Balance cannot be Negative." +"\n");
	}
}

public void getCurrentDepositInput() {
	System.out.println("Current Account Balance:" + moneyFormat.format(currentBalance));
	System.out.println("Amount you want to Deposite from Current Account:");
	double amount = input.nextDouble();
	
	if ((currentBalance + amount) >=0) {
		calcCurrentDeposit(amount);
		System.out.println("New Current Account Balance:" + moneyFormat.format(currentBalance));
		
	}
	else {
		System.out.println("Balance cannot be Negatrive." +"\n");
	}
}

public void getSavingDepositInput() {
	System.out.println("Saving Account Balance:" + moneyFormat.format(savingBalance));
	System.out.println("Amount you want to Deposite from Saving Account:");
	double amount = input.nextDouble();
	
	if ((savingBalance + amount) >=0) {
		calcSavingDeposit(amount);
		System.out.println("New Saving Account Balance:" + moneyFormat.format(savingBalance));
		
	}
	else {
		System.out.println("Balance cannot be Negatrive." +"\n");
	}
}

} 