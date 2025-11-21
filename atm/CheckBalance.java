package atm;

public class CheckBalance extends ResetPin{

	@Override
	public void checkBalance() {
		boolean pin=new Pin_Verification().pinVerification();
		if(pin) {
		System.out.println(BankAccount.getAmount());
		}
	}
}
