package atm;

import java.util.Random;
import java.util.Scanner;

public class BankAccount {

	static Scanner sc=new Scanner(System.in);
	static Random random=new Random();
	
	static final long accountNumber=42461818554L;
	static final String ifsc="SBI00003346";
	static String name="Balaram";
	static long phoneNumber=9492858437L;
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
