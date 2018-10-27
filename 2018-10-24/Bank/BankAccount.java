package Bank;

public class BankAccount {
	// ----------Properties---------------
	private String accountName;
	private String accountNum;
	private double balance;
	private boolean isOverDraftAllowd;
	private double overDraftSum;

	// ----------CTORs---------------
	// -------default CTOR----------
	public BankAccount() {
		this.accountName = "Account";
		this.accountNum = "000001";
		this.balance = 0;
		this.isOverDraftAllowd = false;
		this.overDraftSum = 0;

	}

	// -------user CTOR----------
	public BankAccount(String accountName, String accountNum, double balance, boolean isOverDraftAllowd,
			double overDraftSum) {
		this.accountName = accountName;
		this.accountNum = accountNum;
		this.balance = balance;
		this.isOverDraftAllowd = isOverDraftAllowd;
		this.overDraftSum = (isOverDraftAllowd) ? overDraftSum : 0;
	}

	// ----------G&S's---------------
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isOverDraftAllowd() {
		return isOverDraftAllowd;
	}

	public void setOverDraftAllowd(boolean isOverDraftAllowd) {
		this.isOverDraftAllowd = isOverDraftAllowd;
	}

	public double getOverDraftSum() {
		return overDraftSum;
	}

	public void setOverDraftSum(double overDraftSum) {
		this.overDraftSum = overDraftSum;
	}

	// ----------------METHODs---------------

	public void deposit(double depositAmount) {
		if (depositAmount > 0) {
			System.out.println("------NEW ACTION-----\n" + toString());
			balance += depositAmount;
			System.out.println("Deposited: " + depositAmount + "\nNew Balance: " + getBalance());
		} else {
			System.out.println("Sorry, you can only deposit more than 0");

		}

	}

	public double withdrawlOption() {

		return balance + getOverDraftSum();
	}

	public double withdrawl(double withdrawlRequest) {
		System.out.println("------NEW ACTION-----\n" + toString());
		if (withdrawlRequest <= withdrawlOption()) {
			balance -= withdrawlRequest;
			System.out.println("Withdrawled: " + withdrawlRequest + "\nNew Balance: " + getBalance());
			return withdrawlRequest;
		} else {
			System.out.println("You aske to withdrawl: " + withdrawlRequest + " but you can only overdraft: "+ overDraftSum);
			System.out.println("Withdrawled: " + withdrawlOption());
			balance -= withdrawlOption();
			System.out.println("\nNew Balance: " + getBalance());
			return withdrawlOption();
		}
	}

	@Override
	public String toString() {
		return "Account Name: " + accountName + ", Account Number: " + accountNum + ", Account overdraft option: " + overDraftSum + ", Balance: " + balance;

	}
}
