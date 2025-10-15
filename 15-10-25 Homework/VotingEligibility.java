import java.util.Scanner;

class VotingEligibility
{
	public static void main(String[] args)
	{
		Scanner list = new Scanner(System.in);
		System.out.println("Enter your age");
		
		int age = list.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are Eligible for voting");
		}
		
		else 
		{
			System.out.println("You are not Eligible for voting");
		}
			
	}
}