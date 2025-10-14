class PrincipalAmount2
{
	public static void main(String[] args)
	{
		int simpleInterest = 3600;
		int interest = 6;
		int time = 3;
		
		int principalAmount = (simpleInterest*100)/(interest*time);
		
		System.out.println("Simple Interest:"+" "+simpleInterest);
		System.out.println("Rate of Interest:"+" "+interest+" percentage");
		System.out.println("Time:"+" "+time+" years");
		System.out.println("Principal Amount:"+" "+principalAmount);
	}
}