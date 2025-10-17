import java.util.Scanner;

class SpotifyWelcomesYou
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Your Options are");
		System.out.println("1. A.R.Rahman");
	    System.out.println("2. Anirudh");
		System.out.println("3. Harish Jeyaraj");
		System.out.println("4. Illaiyaraja");
		System.out.println("5. U1");
		System.out.println("Select Your Options");
		int options = Sc.nextInt();
		
		if(options==1)
		{
			System.out.println("A.R.Rahman List");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Motivational Song");
			System.out.println("4. Sad");
			System.out.println("Select your Favourite");
			int favourite = Sc.nextInt();
			
			if(favourite==1)
			{
				System.out.println("Select the Song");
				System.out.println("1. Netru illadha Matram");
				System.out.println("2. Enna Solla pogirai");
				System.out.println("3. Ennavale Adi Ennavale");
				System.out.println("4. Malargale Malargale");
				int song= Sc.nextInt();
			}
				
				else if(favourite==2)
				{
					System.out.println("Select the Song");
				    System.out.println("1. Thaiya Thaiya");
					System.out.println("2. Mukkala Mukkabala");
					System.out.println("3. Urvashi Urvashi");
					System.out.println("4. Aathichudi");
					int song= Sc.nextInt();
				}
					
					else if(favourite==3)
					{
						System.out.println("Select the Song");
					    System.out.println("1. Vande Mataram");
						System.out.println("2. Oruvan Oruvan Mudhalali");
						System.out.println("3. Shakthi Kodu");
						System.out.println("4. Kappal yeari Poyachu");
						int song = Sc.nextInt();
					}
						
						else if(favourite==4)
						{
							System.out.println("Select the Song");
						    System.out.println("1. Poongatrile");
							System.out.println("2. Marudani");
							System.out.println("3. Minnalea En Vazhvin");
							System.out.println("4. Rasathi");
							System.out.println("5. Oru poiyavadhu Sol");
							int song= Sc.nextInt();
						}
						
						    else
							{
								System.out.println("Sorry, You are Entered a wrong number");
							}
			
		}
		else if(options==2)
		{
			System.out.println("Anirudh List");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Motivational Song");
			System.out.println("4. Sad");
			System.out.println("Select your Favourite");
			int favourite= Sc.nextInt();
			
			if(favourite==1)
			{
				System.out.println("Select the Song");
				System.out.println("1. Neeum Naanum Anbe");
				System.out.println("2. Velicha Poove");
				System.out.println("3. Po Indru Neeyaga");
				System.out.println("4. Nee partha vizhigal");
				int song= Sc.nextInt();	
			}
			
			    else if(favourite==2)
				{
			        System.out.println("Select the Song");
			        System.out.println("1. Vathi Raid");
			        System.out.println("2. Naa Ready");
			        System.out.println("3. Badass");
			        System.out.println("4. Vandha Edam");
					int song = Sc.nextInt();
			    }
				
				    else if(favourite==3)
					{
						System.out.println("Select the Song");
						System.out.println("1. Velai Illa Pattadhari");
						System.out.println("2. Boomi Enna Suthudhe");
						System.out.println("3. Ethir Neechal");
						System.out.println("4. Surviva");
						int song = Sc.nextInt();
					}
					
					    else if(favourite==4)
						{
							System.out.println("Select the Song");
							System.out.println("1. Porkanda Singam");
							System.out.println("2. Kanave Kanave");
							System.out.println("3. Kannana Kanne");
							System.out.println("4. Jodi Nilave");
							int song = Sc.nextInt();
						}
						
						    else
							{
								System.out.println("Sorry, Yor are Entered a wrong number");
							}
		}
		
		else if(options==3)
		 {
				 System.out.println("Harish Jeyaraj List");
				 System.out.println("1. Melody");
				 System.out.println("2. Kuthu");
				 System.out.println("3. Sad");
				 System.out.println("Select your favourite");
				 int favourite= Sc.nextInt();
			 
			 
			 if(favourite==1)
			 {
				 System.out.println("Select the Song");
				 System.out.println("1. Unnale");
				 System.out.println("2. Annul Maele");
				 System.out.println("3. Yedho Ondru");
				 System.out.println("4. Vaseegara");
				 System.out.println("5. Partha Mudhal");
				 int song = Sc.nextInt();
			 }
			 
			    else if(favourite==2)
				{
					System.out.println("Select the Song");
				    System.out.println("1. Tirunelveli Halwa Da");
					System.out.println("2. Aradi Katre");
					System.out.println("3. Soda Bottle");
					System.out.println("4. Aruva Meesai");
					int song = Sc.nextInt();
				}
				
				    else if(favourite==3)
					{
						System.out.println("Select the Song");
						System.out.println("1. Venmathiye");
						System.out.println("2. Oh Manamey");
						System.out.println("3. Yamma Yamma");
						System.out.println("4. Othayile");
						int song = Sc.nextInt();
					}
					
					    else 
						{
							System.out.println("Sorry, You are Entered a wrong Number");
						}
						
		}			
		else if(options==4)
        {
			System.out.println("Illaiyaraja List");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Sad");
			System.out.println("Select your favourite");
			int favourite = Sc.nextInt();
			
			if(favourite==1)
			{
				System.out.println("Select the Song");
				System.out.println("1. Oru Kili Urugudhu");
				System.out.println("2. Kuzhaloodhum Kannanukku");
				System.out.println("3. Ennai Thottu");
				System.out.println("4. Raja Raja Cholan");
				int song = Sc.nextInt();
			}
			
			   else if(favourite==2)
			   {
				   System.out.println("Select the Song");
				   System.out.println("1. Ooruvittu Ooruvandhu");
				   System.out.println("2. Nooru Varusham");
				   System.out.println("3. Aasai Nooruvagai");
				   System.out.println("4. Aasai Adhigam Vachu");
				   int song = Sc.nextInt();
			   }
			   
			       else if(favourite==3)
				   {
					   System.out.println("Select the Song");
					   System.out.println("1. Kanne Kalaimane");
					   System.out.println("2. Thene Thenpaandi Neeye");
					   System.out.println("3. Paadi Parandha Killi");
					   System.out.println("4. Nilave Vaa");
					   int song = Sc.nextInt();
				   }
				   
				       else
					   {
						   System.out.println("Sorry, You are Entered a wrong number");
					   }
		}	

		else if(options==5)
		{
			System.out.println("U1 List");
			System.out.println("1. Melody");
			System.out.println("2. Kuthu");
			System.out.println("3. Motivational Song");
			System.out.println("4. Sad");
			System.out.println("Select your favourite");
			int favourite = Sc.nextInt();
			
			if(favourite==1)
			{
				System.out.println("Select the Song");
				System.out.println("1. Aathadi Manasudhan");
				System.out.println("2. Chinna Sirisu");
				System.out.println("3. Venmeggam");
				System.out.println("4. Iayyayyo");
				int song = Sc.nextInt();
			}
			
			    else if(favourite==2)
				{
					System.out.println("Select the Song");
					System.out.println("1. Machi Open the Bottle");
					System.out.println("2. Saroja Saman Nikalo");
					System.out.println("3. No Money No Honey");
					System.out.println("4. Vilaiyadu Mangatha");
					int song = Sc.nextInt();
				}
				
				    else if(favourite==3)
					{
						System.out.println("Select the Song");
						System.out.println("1. Edhirthu Nill");
						System.out.println("2. Oru Nalil");
						System.out.println("3. Nimirnthu Nil");
						System.out.println("4. Ungakkule Mirugam");
						int song = Sc.nextInt();
					}
					
					    else if(favourite==4)
						{
							System.out.println("Select the Song");
							System.out.println("1. Kadhal Valarthen");
							System.out.println("2. Yedho Ondru Ennai");
							System.out.println("3. Pogadhe");
							System.out.println("4. Ninaithu Ninaithu");
							int song = Sc.nextInt();
						}
						
						    else
							{
								System.out.println("Sorry, You are Entered a wrong number");
							}
		}
		else
        {
			System.out.println("Sorry there was not a Particular Song List");
		}			
	}
}