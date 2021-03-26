import java.util.Random;

public class BankAccount {
	// create instance variables
	private double balance;
	private String accountNumber="1111";
	private Customer accountHolder;
	//private Customer name;

	
	public BankAccount(){
		accountNumber = new Random().nextInt(9999) + 1 + "";
		while (accountNumber.length() < 4) {
			accountNumber = '0' + accountNumber;
		
		}
	}	
	
	public BankAccount(BankAccount copy){
		accountNumber = copy.accountNumber;
		balance = copy.balance;
		accountHolder = copy.accountHolder;
		
	}
	public BankAccount(double b){
		if (b <= 0 || b >= 0)  {
		this.balance = b;
		}
	}
	public BankAccount(double b, String a) {
		if (b <= 0 || b >= 0)   {
			this.balance = b;
			this.accountNumber = a;
			}
		}
	public BankAccount(Customer c, double b) {
		this.accountHolder = c;
		this.balance = b;
	}
	
	
	// your code comes here
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double b) {
		balance = b;
		
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String aN) {
		this.accountNumber = aN;
	}
	
	public String toString() {
		return "("+ getAccountHolder()+")"+ " " + getAccountNumber() + ": " + getBalance();
	}
	public void deposit(double dep) {
		if (dep < 0) {
			System.out.println("Amount deposited is invalid");
		}
		else balance += dep;
	}
	public void withdraw(double with) {
		if (with > balance) {
			System.out.println("Too much taken out!!");
		}
		else if( with < 0) {
			System.out.println("Invalid");
		}
		else balance -= with;
	}

	public Customer getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(Customer aH) {
		this.accountHolder = aH;
	}
	public void transfer(double d,BankAccount a) {
		if ( this.balance >= d) {
			a.deposit(d);
			this.balance = balance - d;
		}
		
	}	
	

}
ss