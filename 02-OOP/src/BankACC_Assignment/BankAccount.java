package BankACC_Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccount {
	int accountNo;
	String holderName;
	int pinNo;
	String password;
	double balance;
	
	public BankAccount() {
		super();
		this.accountNo = 0000;
		this.holderName = "Unknown";
		this.pinNo = 0;
		this.password = "0";
		this.balance = 0;
	}

	public BankAccount(int accountNo, String holderName, int pinNo, String password, double balance) {
		super();
		this.accountNo = accountNo;
		this.holderName = holderName;
		this.pinNo = pinNo;
		this.password = password;
		this.balance = balance;
	}
	
	double deposit(double balance, Scanner sc) {
		System.out.print("Enter The Deposit Amount(Minimum 5000 ks) : ");
		balance = sc.nextDouble();
		if(balance >= 5000) {
			System.out.println(">>>" + balance + " ks is added to Your Account");
			this.balance += balance;
		}else if(balance < 5000) {
			while(true) {
				System.err.println("\nYour Deposit Amount must be more than 5000 ks.");
				System.out.print("Enter The Deposit Amount(Minimum 5000 ks) : ");
				balance = sc.nextDouble();
				if(balance >= 5000) {
					System.out.println(">>>" + balance + " ks is added to Your Account");
					this.balance += balance;
					break;
				}
			}
		}
		showInfo();
		return balance;
	}
	
	double withdraw(double balance, Scanner sc){
		System.out.print("Enter The Withdraw Amount(Minimum 5000 ks) : ");
		balance = sc.nextDouble();
		if(balance > this.balance) {
			System.err.println("Your Withdraw Amount is more than your balance!");
		}
		if(balance <= this.balance) {
			if(balance >= 5000) {
				System.out.println("<<<" + balance + " ks is withdrawed from Your Account");
				this.balance -= balance;
			}else if(balance < 5000) {
				while(true) {
					System.err.println("\nYour Withdraw Amount must be more than 5000 ks.");
					System.out.print("Enter The Withdraw Amount(Minimum 5000 ks) : ");
					balance = sc.nextDouble();
					if(balance >= 5000) {
						System.out.println("<<<" + balance + " ks is withdrawed from Your Account");
						this.balance -= balance;
						break;
					}
				}
			}
		}
		showInfo();
		return balance;
	}
	
	int changePassword(int pinNo, Scanner sc) {
		try {
			System.out.print("Enter Your PIN to change Your Password : ");
			pinNo = sc.nextInt();
			if(pinNo == this.pinNo) {
				System.out.print("Enter Your New Password : ");
				this.password = sc.next();
			}
			if(pinNo != this.pinNo) {
				System.err.println("Invalid PIN!");
			}
		} catch (InputMismatchException e) {
			System.err.println("Invalid PIN!");
		}
		showInfo();
		return pinNo;
	}
	
	void showInfo() {
		System.out.println("\n---------------------------- Your Account Information ----------------------------\n");
		System.out.println("\t\t\tAccount Number       : " + accountNo);
		System.out.println("\t\t\tHolder Name          : " + holderName);
		System.out.println("\t\t\tAccount Balance      : " + balance + " ks");
		System.out.println("\t\t\tAccount Password     : " + password);
		System.out.println("\t\t\tPIN                  : " + pinNo);
		System.out.println("\n--------------------------------- Thank You --------------------------------------\n");
	}
}
