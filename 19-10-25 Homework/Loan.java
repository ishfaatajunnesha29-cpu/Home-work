import java.util.Scanner;
class Loan
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter your Age");
		int num1= Sc.nextInt();
		System.out.println("Enter your Monthly Income");
		long num2= Sc.nextLong();
		
		if(num1>21&&num2>25000)
		{
			System.out.println("You are eligible for a loan");
		}
		else
		{
			System.out.println("You are not eligible for a loan");
		}
	}
}