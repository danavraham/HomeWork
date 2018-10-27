package Bank;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount[]bankAccounts= new BankAccount[3];
		bankAccounts[0]= new BankAccount();
		bankAccounts[1]= new BankAccount("Dikla", "02564", 100, false, 100);
		bankAccounts[2]= new BankAccount("Dan", "00054", 800, true, 200);
		
		
		for(BankAccount account: bankAccounts) {
			System.out.println(account.toString());
			
		}
		
		
		bankAccounts[0].withdrawl(50);
		bankAccounts[1].withdrawl(110);
		bankAccounts[2].withdrawl(1200);
		bankAccounts[0].deposit(50);
	
	
	}
}
