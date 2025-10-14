class PrincipalAmount
{
	public static void main(String[] args)
	{
		int simpleInterest = 2400;
		int interest = 8;
		int time = 4;
		
		int principalAmount = (simpleInterest*100)/(interest*time);
		
		System.out.println("Simple Interest:"+" "+simpleInterest);
		System.out.println("Rate of Interest:"+" "+interest+" percentage");
		System.out.println("Time:"+" "+time+" years");
		System.out.println("Principal Amount:"+principalAmount);
		
	}
}