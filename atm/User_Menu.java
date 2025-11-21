package atm;

public class User_Menu extends BankAccount {

	public void menu() {
		System.out.println("Select One Option");
		System.out.println("1.Withdraw");
		System.out.println("2.Check Balance");
		System.out.println("3.Deposit");
		System.out.println("4.Reset Pin");
		System.out.println("5.UPI Payments");
		System.out.print("\nchoice: ");
		int key=sc.nextInt();
		atm_interface atm=new CheckBalance();
		switch (key) {
		case 1: {
			atm.withdraw();
			break; 
		}
		case 2:{
			atm.checkBalance();
			break;
		}
		case 3:{
			atm.deposit();
			break;
		}
		case 4:{
			atm.resetPin();
			break;
		}
		case 5:{
			atm.upay();
			break;
		}
		default:
			System.out.println("Unexpected value: " + key);
		}
	}
}
