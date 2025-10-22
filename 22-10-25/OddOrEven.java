import java.util.Scanner;
class OddOrEven
{
	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int num=Sc.nextInt();
		
	    if(num%2==1)
		{
            System.out.println("The given number is Odd");
		}
        else if(num%2==0)
		{
			System.out.println("The given number is Even");
		}			
		else
		{
			System.out.println("You are Entered a wrong Number");
		}
	}
}