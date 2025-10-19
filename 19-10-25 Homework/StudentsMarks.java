import java.util.Scanner;
class StudentsMarks
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Your Mark");
		int mark = Sc.nextInt();
		if(mark>90)
		{
			System.out.println("Your grade is A");
		}
		else if(mark>70&&mark<=90)
		{	
		    System.out.println("Your grade is B"); 
		}
		else if(mark>50&&mark<=70)
		{
			System.out.println("Your grade is C");
		}
		else if(mark>=25&&mark<=50)
		{
			System.out.println("Your grade is D");
		}
		else if(mark<25)
		{
			System.out.println("You are Fail");
		}
		else
		{
			System.out.println("You Entered a wrong mark");
		}
	}
}