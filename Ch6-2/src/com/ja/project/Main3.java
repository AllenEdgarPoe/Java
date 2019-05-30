
package com.ja.project;
import java.util.Scanner;

//Account manageable project
public class Main3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("***Welcome to the Account Program***");
		
		Account ac = new Account(10000);	
		ac.deposit(5000);
	
	}

}

class Account{
	private int balance; //information conceal 
	
	public Account(int balance){
		this.balance = balance;
	}
	
	private boolean confirmBalance(int value) {
		if (value>balance) return false;
		return true;
	}
	
	public void deposit(int value) {
		if(! confirmBalance(value)) System.out.println("There is not enough balance");
		balance += value;
	}
	
	public void withdraw(int value) {
		if(! confirmBalance(value)) System.out.println("There is not enough balance");
		balance -= value;
	}
	
	public void checkBalance() {
		System.out.println("Balance: "+ balance);
		
	}
	
}
