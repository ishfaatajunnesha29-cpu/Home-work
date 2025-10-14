class SimpleInterest4
{
	public static void main(String[] args)
	{
		int pricipalAmount = 25000;
		int interest = 7;
		int time = 4;
		
		int simpleInterest = (pricipalAmount*interest*time)/100;
		int totalBalance = simpleInterest+pricipalAmount;
		
		System.out.println("Principal Amount:"+" "+pricipalAmount);
		System.out.println("Rate of Interest:"+" "+interest+" percentage");
		System.out.println("Time:"+" "+time+" years");
		System.out.println("Simple Interest:"+" "+simpleInterest);
		System.out.println("Total Balance after 4 years:"+" "+totalBalance);
	}
}