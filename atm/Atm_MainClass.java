package atm;

public class Atm_MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to ATM🙏🙏🙏");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		System.out.println("Insert your card...");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {}
		System.out.println("Don't remove your card your card is under process...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		User_Menu menu=new User_Menu();
		menu.menu();
	}
}
