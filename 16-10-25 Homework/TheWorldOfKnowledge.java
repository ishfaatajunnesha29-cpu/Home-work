import java.util.Scanner;
class TheWorldOfKnowledge
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("We Welcomes You");
		System.out.println("Select your Option");
		System.out.println("1. Fiction");
		System.out.println("2. Fantasy");
		System.out.println("3. Business");
		System.out.println("4. Psychology");
		int option = Sc.nextInt();
		
		if(option==1)
		{
			System.out.println("Fiction");
			System.out.println("Select your Choice");
			System.out.println("1. RISE OF THE FALLEN: The Manwaan Series Book 1.");
			System.out.println("2. Shadows Rising");
			System.out.println("3. Kunex,It Ends with Us");
			int choice = Sc.nextInt();
			
			if(choice==1)
			{
				System.out.println("RISE OF THE FALLEN: The Manwaan Series Book 1.");
				System.out.println("Author: Abhishek Krishnan");
				System.out.println("Language: English");
				System.out.println("Rate: Rs.300");
			}
			else if(choice==2)
			{
				System.out.println("Shadows Rising");
				System.out.println("Author: Rohan Monterio");
				System.out.println("Language: English");
				System.out.println("Rate: Rs.250");
			}
			else if(choice==3)
			{
				System.out.println("Kunex,It Ends with Us");
				System.out.println("Author: Rohan Monterio");
				System.out.println("Language: English");
				System.out.println("Rate: Rs.350");
			}
			else
			{
				System.out.println("Invalid Book Details");
			}	
		}
		else if(option==2)
		{
			System.out.println("Fantasy");
			System.out.println("Select your Choice");
			System.out.println("1. Compass and Blade");
			System.out.println("2. Blood Metal Bone");
			System.out.println("3. The Shadows between Us");
			int choice = Sc.nextInt();
			
			if(choice==1)
			{
				System.out.println("Compass and Blade");
				System.out.println("Author: Rachel Greenlaw");
				System.out.println("Language: English");
				System.out.println("Rate: Rs.370");
			}
			else if(choice==2)
			{
				System.out.println("Blood Metal Bone");
				System.out.println("Author: Lindsay Cummings");
				System.out.println("Language: English");
				System.out.println("Rate: Rs.275");
			}
			else if(choice==3)
			{
				System.out.println("The Shadows between Us");
				System.out.println("Author: Tricia Leven-seller");
				System.out.println("Language: English");
				System.out.println("Rate: Rs.304");
			}
			else
			{
				System.out.println("Invalid Book Details");
			}
		}
		else if(option==3)
		{
			System.out.println("Business");
			System.out.println("Select your Choice");
			System.out.println("1. The Psychology of Money");
			System.out.println("2. Do It Today");
			System.out.println("3. Atomic Habits");
			int choice = Sc.nextInt();
			
			if(choice==1)
			{
				System.out.println("The Psychology of Money");
				System.out.println("Author: Morgan Housel");
				System.out.println("Language: English");
				System.out.println("Rate: Rs.300");
			}
			else if(choice==2)
			{
				System.out.println("Do It Today");
			    System.out.println("Author: Darius Foroux");
				System.out.println("Language: English");
				System.out.println("Rate: Rs.100");
		    }
		    else if(choice==3)
			{
				System.out.println("Atomic Habits");
			    System.out.println("Author: James Clear");
			    System.out.println("Language: English");
				System.out.println("Rate: Rs.350");
	        }
			else
			{
				System.out.println("Invalid Book Details");
			}
		}
		else if(option==4)
		{
			System.out.println("Psychology");
			System.out.println("Select your Choice");
			System.out.println("1. Dark Psychology Secrets & Manipulation");
			System.out.println("2. The Power of your Subconscious Mind Do it Today");
			System.out.println("3. The Courage To Be Disliked");
			int choice = Sc.nextInt();
			
			if(choice==1)
			{
				System.out.println("Dark Psychology Secrets & Manipulation");
			    System.out.println("Author: Amy Brown");
				System.out.println("Language: English");
				System.out.println("Rate: Rs.300");
			}
			else if(choice==2)
			{
				System.out.println("The Power of your Subconscious Mind Do it Today");
				System.out.println("Author: Joseph Murphy");
				System.out.println("Language: English");
				System.out.println("Rate: Rs.100");
			}
			else if(choice==3)
			{
				System.out.println("The Courage To Be Disliked");
				System.out.println("Author: Ichiro Kishimi and Fumitake Koga");
				System.out.println("Language: English");
				System.out.println("Rate: Rs.350");
			}
			else
			{
				System.out.println("Invalid Book Details");
			}
		}
		else
		{
			System.out.println("Invalid Book");
		}
	}
}