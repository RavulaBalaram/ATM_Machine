package atm;

import java.util.Random;
import java.util.Scanner;

public class BankAccount {

	static Scanner sc=new Scanner(System.in);
	static Random random=new Random();
	
	static final long accountNumber=123456789L;
	static final String ifsc="BANK000123";
	static String name="Professor";
	static long phoneNumber=9876543210L;
	private static double amount=50000;
	
	private static int pinNumber=1729;
	
	public static int getPinNumber() {
		return pinNumber;
	}
	public  static void setPinNumber(int pinNum) {
		pinNumber = pinNum;
	}
	public static double getAmount() {
		return amount;
	}
	public static void setAmount(double amount) {
		BankAccount.amount = amount;
	}
}
