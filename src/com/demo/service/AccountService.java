package com.demo.service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.demo.bean.Account;

public class AccountService {
	
	static Scanner sc = new Scanner(System.in);
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	
	//Add account details
	public static void getAccountData(Account acc[]) {
			System.out.println("Enter name :");
			String name = sc.next();
			System.out.println("Enter Account type :");
			String accType = sc.next();
			System.out.println("Enter balance");
			double balance = sc.nextDouble();
			System.out.println("Enter date of opening :");
			String date = sc.next();
			try {
				Date dOpen = sdf.parse(date);
				acc[0] = new Account(name, dOpen, accType, balance);
			} 
			catch (ParseException e) {
				e.printStackTrace();
			}
	}
	
	//Gives index of the object given account id
	public static int searchById(String id, Account acc[]) {
		int index = 0;
		for(int i=0;i<acc.length;i++) {
			if(id.equals(acc[i].getAccId())) {
				return index;
			}
		}
		return -1;	
	}
	
	//Withdraw money
	public static double withdrawAmt(String id, double amount, Account acc[]) {
		int index = searchById(id, acc);
		double balance = acc[index].withdraw(amount);
		return balance;
	}
	
	//Deposit money
	public static double depositAmt(String id, double amount, Account acc[]) {
		int index = searchById(id, acc);
		double balance = acc[index].deposit(amount);
		return balance;
	}
	
	//Display account id given name
	public static void displayAccId(Account acc[], String name) {
		int index = 0;
		for(int i=0;i<acc.length;i++) {
			if(name.equals(acc[i].getAccName())) {
				index = i;
				break;
			}
		}
		System.out.println("Your account id is :" + acc[index].getAccId());
	}
	
	//Displays all account details
	public static void displayDetails(Account acc[]) {
		for(int i=0;i<acc.length;i++) {
			System.out.println(acc[i]);
		}
	}

}
