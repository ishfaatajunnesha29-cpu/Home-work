class SimpleInterest2
{
	public static void main(String[] args)
	{
		int depositAmount = 50000;
		int interest = 6;
		int time = 5;
		
		int simpleInterest = (depositAmount*interest*time)/100;
		int totalBalance = depositAmount+simpleInterest;
		
		System.out.println("Deposit Amount:"+" "+depositAmount);
		System.out.println("Arun's earned Interest:"+" "+simpleInterest);
		System.out.println("Arun's total balance after 5 years:"+" "+totalBalance);
		
	}
}