package com.demo.test;
import java.util.Scanner;
import com.demo.bean.Account;
import com.demo.service.AccountService;

public class TestAccountClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account[] acc = new Account[10];
		int choice = 0;
		String id = null;
		double money = 0;
		while(choice != 5) {
			System.out.println("Please select \n1. To create account");
			System.out.println("2. To withdraw amount");
			System.out.println("3. To deposit amount");
			System.out.println("4. To get account id");
			System.out.println("5. To Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				AccountService.getAccountData(acc);
				break;
			case 2:
				System.out.println("Enter acc id from which you want to withdraw\n");
				id = sc.next();
				System.out.println("Enter how much money you want to withdraw\n");
				money = sc.nextDouble();
				double balance = AccountService.withdrawAmt(id, money, acc);
				if(balance != -1)
					System.out.println("Updated account balance is:" + balance);
				else
					System.out.println("Your account has insufficient balance\n");
				break;
			case 3:
				System.out.println("Enter acc id to which you want to deposit\n");
				id = sc.next();
				System.out.println("Enter how much money you want to deposit\n");
				money = sc.nextDouble();
			    balance = AccountService.depositAmt(id, money, acc);
				System.out.println("Updated account balance is:" + balance);
				break;
			case 4:
				System.out.println("Enter your name\n");
				String name = sc.next();
				AccountService.displayAccId(acc, name);
				break;
			case 5:
				break;
			default:
				System.out.println("Please enter valid choice\n");	
			}
			
		}
		
		System.out.println("byee thank you!!");
			
	}
	

}
