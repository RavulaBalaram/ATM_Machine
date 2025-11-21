package atm;

public class Deposit extends Withdraw{

	@Override
	public void deposit(){
		boolean pin=new Pin_Verification().pinVerification();
		if(pin) {
		System.out.println("Enter Bank Account Type");
		System.out.println("1.Savings");
		System.out.println("2.Current");
		switch (sc.nextInt()) {
		case 1: {
			System.out.println("Enter amount");
			double amount=sc.nextDouble();
			amount=BankAccount.getAmount()+amount;
			BankAccount.setAmount(amount);
			
			System.out.println("Amount added succesfully...");
			System.out.println("Do you want to check your balance if yes enter 1");
			if(sc.nextInt()==1)
				System.out.println(BankAccount.getAmount());
			break;
		}
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
