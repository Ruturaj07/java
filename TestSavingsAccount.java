class SavingsAccount{
	static double annualInterestRate=4;
	private double savingsBalance;
	SavingsAccount(double firstAmt){
		savingsBalance = firstAmt;	
	}
	public void calculateMonthlyInterest(){
		System.out.printf("Your Account Balance is %.2f\n",savingsBalance);
		double monthlyInterest = savingsBalance*annualInterestRate/12;
		System.out.printf("Your Monthly Interest is %.2f\n",monthlyInterest);
		savingsBalance=savingsBalance+monthlyInterest;
		System.out.printf("Your Updated Balance is %.2f\n",savingsBalance);
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

	SavingsAccount.modifyInterestRate(5);
	
	System.out.println("\nSaver 1:");
	saver1.calculateMonthlyInterest();
	System.out.println("\nSaver 2:");	
	saver2.calculateMonthlyInterest();
	}

}



