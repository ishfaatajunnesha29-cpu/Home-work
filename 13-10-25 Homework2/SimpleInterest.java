class SimpleInterest
{
	public static void main(String[] args)
	{
		int principalAmount = 5000;
		int rateOfInterest = 5;
		int time = 2;
		
		int simpleInterest = (principalAmount*rateOfInterest*time)/100;
		
		System.out.println("Principal Amount:"+" "+principalAmount);
		System.out.println("Percentage of Interest:"+" "+rateOfInterest);
		System.out.println("Time:"+" "+time+"years");
		System.out.println("SI ="+" "+simpleInterest);
	}
}