package atm;

public class Pin_Verification extends BankAccount{

	public boolean pinVerification() {
		boolean verified=false;
		int chance=1;
		do {
		System.out.println("Enter Pin");
		int pin=sc.nextInt();
		
		if(pin==BankAccount.getPinNumber()) {
			verified=true;
			break;
		}
		else{
			System.out.println("Entered wrong Pin!!!");
			chance++;
		}
		if(chance==4)
			System.out.println("Daily Attemps Reached\nTry again after 24hrs");
		}while(chance<=3);
		
		return verified;
	}
}
