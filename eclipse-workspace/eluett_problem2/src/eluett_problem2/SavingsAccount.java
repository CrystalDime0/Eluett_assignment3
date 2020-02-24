package eluett_problem2;

public class SavingsAccount {
	private static double  annualInterestRate;
	private double savingsBalance;
	public SavingsAccount(int startingbalance){
		savingsBalance = startingbalance;
	}
	public double calculateMonthlyInterest() {
		double interest =  (savingsBalance * annualInterestRate)/12;
		savingsBalance += interest;
		return interest;
	}
    public void modifyInterestRate(double rate) {
    	annualInterestRate = rate;
    }
}
