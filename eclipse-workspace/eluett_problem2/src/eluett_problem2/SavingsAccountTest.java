package eluett_problem2;

public class SavingsAccountTest {
       
	  public static void main(String[] args) {
		  
		  SavingsAccount saver1 = new SavingsAccount(2000);
		  SavingsAccount saver2 = new SavingsAccount(3000);
		  saver1.modifyInterestRate(0.04);
		  saver2.modifyInterestRate(0.04);
		  double balanceone = 2000;
		  double balancetwo = 3000;
		  for (int i = 0; i < 12; i++) {
			  System.out.println("Month " + i + ":");
			  double interestone = saver1.calculateMonthlyInterest();
			  double interesttwo = saver2.calculateMonthlyInterest();
			  balanceone += interestone;
			  balancetwo += interesttwo;
			  System.out.println("    Account 1: Interest - " + interestone + " Balance - " + balanceone);
			  System.out.println("    Account 2: Interest - " + interesttwo + " Balance - " + balancetwo);		  
		  }
		  System.out.println("Month after interest switch");
		  saver1.modifyInterestRate(0.05);
		  saver2.modifyInterestRate(0.05);
		  double interestone = saver1.calculateMonthlyInterest();
		  double interesttwo = saver2.calculateMonthlyInterest();
		  balanceone += interestone;
		  balancetwo += interesttwo;
		  System.out.println("    Account 1: Interest - " + interestone + " Balance - " + balanceone);
		  System.out.println("    Account 2: Interest - " + interesttwo + " Balance - " + balancetwo);		  

	  }
}