import java.util.Scanner;

class AgeOfCitizen
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Please Enter your Age");
		int num = Sc.nextInt();
		
		if(num>=60)
		{
			System.out.println("Senior Citizen");
		}
		else
		{
			System.out.println("Not a Senior Citizen");
		}
		
	}
}