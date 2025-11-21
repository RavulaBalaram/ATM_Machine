package atm;

public class ResetPin extends Deposit{

	@Override
	public void resetPin() {
		System.out.println("Generate Pin Here...");
		 int attempts=0;
		 do {
			 System.out.println("Enter Your Bank Account Number");
		 long accountNumber=(sc.nextLong());
		if(accountNumber==BankAccount.accountNumber) {
			int Otp=1000+random.nextInt(8999);
			do {
			System.out.println("Enter Otp sent to your registered mobile number  "+Otp);
			int otpResponse=sc.nextInt();
			if(Otp==otpResponse) {
				do {
				 System.out.println("Enter New 4 Digit pin...");
				 int newPin=sc.nextInt();
				 String pinNumber=Integer.toString(newPin);
				 int count=0;
				 for(int i=0;i<pinNumber.length();i++) {
					 char ch=pinNumber.charAt(i);
					 if(Character.isDigit(ch)) {
						 count++;
					 }
				 }
				 int pinNum=Integer.parseInt(pinNumber);
				 if(count==4 && count==pinNumber.length()) {
					 
				do {
				System.out.println("Conform Pin...");
				 if(pinNum==sc.nextInt()) {
					BankAccount.setPinNumber(pinNum);
					System.out.println("Pin Generated Succesfully...");
					break;
				 }else System.out.println("Pin Miss Match");
				}while(true);break;
				 }
				 else
					 System.out.println("InValid Pin Number");
				}while(true);
				break; 
			}
			else {
				System.out.println("Incorrect Otp");
			}
			}while(true);break;
			
		}
		else
			System.out.println("InCorrect Account Number");
		attempts++;
		}while(attempts<3);
	}
}
