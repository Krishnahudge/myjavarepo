package com.demo.bean;
import java.util.Date;

public class Account {
	
	static {
		counter = 0;
	}
	
	public static int counter;
	private String accId;
	private String accName;
	private Date dOpen;
	private String accType;
	private double balance;
	
	//Default constructor
	public Account() {
		accId = null;
		accName = null;
		dOpen = null;
		accType = null;
		balance = 0;
	}
	
	//Parameterized constructor
	public Account(String accName, Date dOpen, String accType, double balance) {
		this.accId = Integer.toString(++counter) + accName.charAt(0);
		this.accName = accName;
		this.dOpen = dOpen;
		this.accType = accType;
		this.balance = balance;
	}
	
	//Overrided tostring method of object class
	public String toString() {
		return "accId : " + accId + " accName : " + accName + " dOpen : " + dOpen + " accType : " + accType + " balance : " + balance;
		
	}
	
	//Getters and setters
	public String getAccId() {
		return accId;
	}
	
	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public Date getdOpen() {
		return dOpen;
	}

	public void setdOpen(Date dOpen) {
		this.dOpen = dOpen;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	//Withdraw amount
	public double withdraw(double amount) {
		if(balance - 5000 >= amount) {
			balance -= amount;
			return balance;
		}
		else {
			return -1;
		}	
	}
	
	//Deposit amount
	public double deposit(double amount) {
		balance += amount;
		return balance;
	}
}
