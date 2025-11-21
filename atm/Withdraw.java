package atm;

public class Withdraw extends UserCheckIn{

	@Override
	public void withdraw() {
		boolean pin=new Pin_Verification().pinVerification();
		if(pin) {
		System.out.println("Enter Bank Account Type");
		System.out.println("1.Savings");
		System.out.println("2.Current");
		switch (sc.nextInt()) {
		case 1: {
		System.out.println("Enter amount in multiples of 100 only");
		double amount=sc.nextDouble();
		if(amount%100==0) {
			if(amount<=BankAccount.getAmount()) {
				amount=BankAccount.getAmount()-amount;
				BankAccount.setAmount(amount);
				System.out.println("Transaction is in process please wait...");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {}
				System.out.println("Withdraw Completed please take your cash...");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {}
				System.out.println("Enter 1 to check remaing balance");
				if(sc.nextInt()==1) {
					System.out.println("Remaining amount: "+BankAccount.getAmount());
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {}
					System.out.println("ThankYou Visit Again🙏🙏🙏");
				}
				else
					System.out.println("ThankYou Visit Again🙏🙏🙏");
				
			}else System.out.println("Insufficient Funds");
			
			}else System.out.println("Unable to dispatch amount");
		}break;
		case 2:{
			System.out.println("You Don't Have an Current Account");
			break;
		}
		default:
			System.out.println("Unexpected value: " + sc.nextInt());
		}
	}
	}
}
