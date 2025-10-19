import java.util.Scanner;
class RailwayTicketClass
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Select the Class");
		System.out.println("1. General");
		System.out.println("2. Sleeper Class");
		System.out.println("3. AC3-Tier");
		System.out.println("4. AC2-Tier");
		System.out.println("5. First Class");
		int num = Sc.nextInt();
		
		switch(num)
		{
			case 1:
			System.out.println("General(Second Class)-50 Rupees");
			break;
			
			case 2:
			System.out.println("First Class-100 Rupees");
			break;
			
			case 3:
			System.out.println("Sleeper Class-200 Rupees");
			break;
			
			case 4:
		    System.out.println("AC3-Tier-300 Rupees");
			break;
			
			case 5:
			System.out.println("AC2-Tier-300 Rupees");
			break;

			
			default:
			System.out.println("Invalid class");
		}
	}
}