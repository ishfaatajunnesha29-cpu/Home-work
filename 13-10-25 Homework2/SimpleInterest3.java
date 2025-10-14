class SimpleInterest3
{
	public static void main(String[] args)
	{
		int principalAmount = 10000;
		int interest = 5;
		int time = 3;
		
		int simpleInterest = (principalAmount*interest*time)/100;
		
		System.out.println("Principal Amount:"+" "+principalAmount);
		System.out.println("Rate of Interest:"+" "+interest);
		System.out.println("Time:"+" "+time+" years");
		System.out.println("Simple Interest:"+" "+simpleInterest);
	}
}
