class SavingsAccount{
	static double annualInterestRate=0.04;
	private double savingsBalance;
	SavingsAccount(double firstAmt){
		savingsBalance = firstAmt;	
	}
	public void calculateMonthlyInterest(){
		System.out.println("Your Account Balance is "+savingsBalance);
		double monthlyInterest = savingsBalance*annualInterestRate/12;
		System.out.println("Your Monthly Interest is "+monthlyInterest);
		savingsBalance=savingsBalance+monthlyInterest;
		System.out.println("Your Updated Balance is "+savingsBalance);
	}
	public static void modifyInterestRate(double newRate){
		annualInterestRate = newRate;
	}
	
}

class TestSavingsAccount{
	public static void main(String a[]){
	SavingsAccount saver1 = new SavingsAccount(5000);
	SavingsAccount saver2 = new SavingsAccount(4000);
	
	System.out.println("***********************\n*Welcome to World Bank*\n***********************");
	
	System.out.println("\nSaver 1:");
	saver1.calculateMonthlyInterest();
	System.out.println("\nSaver 2:");
	saver2.calculateMonthlyInterest();

	SavingsAccount.modifyInterestRate(0.05);
	
	System.out.println("\nSaver 1:");
	saver1.calculateMonthlyInterest();
	System.out.println("\nSaver 2:");	
	saver2.calculateMonthlyInterest();
	}

}



