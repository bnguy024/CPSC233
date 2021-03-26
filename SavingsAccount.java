
public class SavingsAccount extends BankAccount{
	
	private double annualInterestRate = 0.05;
	private double minimumBalance = 0.0;
	public SavingsAccount() {
	}
	public SavingsAccount(double annualinterestRate) {
		this.annualInterestRate = annualinterestRate;
	}
	public SavingsAccount(double b, double i) {
		setAnnualInterestRate(i);
		deposit(b);
	}
	public SavingsAccount(Customer accountHolder, double balance, double annualinterestRate) {
		super (balance);
		super.setAccountHolder(accountHolder);
		this.annualInterestRate = annualinterestRate;
		
	}
	public SavingsAccount(Customer accountHolder, double balance) {
		super(balance);
		super.setAccountHolder(accountHolder);
		
	}
	
	public SavingsAccount(SavingsAccount a) {
		annualInterestRate = a.getAnnualInterestRate(); 
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double i) {
		if(i>= 0 && i<= 1) {
		annualInterestRate = i;
		}
	}

	public void withdraw(double amount) {
		if((super.getBalance() - amount ) >= minimumBalance ) {
		super.withdraw(amount);
	}
		}
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double m) {
		minimumBalance = m;
	}
	public void depositMonthlyInterest(){
		double interest = 0;
		double temp = getBalance();
		interest = (temp * getAnnualInterestRate())/12;
		
		super.deposit(interest);
		
		
	}
	


}
