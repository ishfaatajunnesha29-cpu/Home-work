import java.util.Scanner;
class TrafficSignal
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Select the Option");
		System.out.println("Red");
		System.out.println("Yellow");
		System.out.println("Green");
		String ch = Sc.nextLine();
		
		switch (ch)
		{
			case "Red":
			System.out.println("Stop");
			break;
			
			case "Yellow":
			System.out.println("Get Ready");
			break;
			
			case "Green":
			System.out.println("Go");
			break;
			
			default:
			System.out.println("Invalid Signal Light");
			
		}
	}
}