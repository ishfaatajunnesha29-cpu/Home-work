import java.util.Scanner;

class WeekDays
{
	public static void main(String[] args)
	{
		Scanner week = new Scanner(System.in);
		System.out.println("Enter a Week Days between 1 to 7");
		
		int num = week.nextInt();
		
		switch (num)
		{
			case 1:
			System.out.println("SUNDAY");
			break;
			
			case 2:
			System.out.println("MONDAY");
			break;
			
			case 3:
			System.out.println("TUESDAY");
			break;
			
			case 4:
			System.out.println("WEDNESDAY");
			break;
			
			case 5:
			System.out.println("THURSDAY");
			break;
			
			case 6:
			System.out.println("FRIDAY");
			break;
	
			case 7:
			System.out.println("SATURDAY");
			break;
			
			default:
			System.out.println("You are Entered the wrong number");
		} 
	}
}