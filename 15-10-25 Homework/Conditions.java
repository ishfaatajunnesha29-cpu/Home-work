import java.util.Scanner;

class Conditions
{
	public static void main(String[] args)
	{
		Scanner grade = new Scanner(System.in);
		System.out.println("Enter your Mark:");
		
		int mark = grade.nextInt();
		
		
		if(mark>=91&&mark<=100)
		{
			System.out.println("Your grade is A");
		}
		
		else if(mark>=71&&mark<=90)
		{
			System.out.println("Your grade is B");
		}	
		
		else if(mark>=51&&mark<=70)
		{
			System.out.println("Your grade is C");
		}
		
		else if(mark<=50)
		{
			System.out.println("Your grade is D");
		}
		
		else
		{
			System.out.println("You are entered a wrong Mark");
		}
	}
}