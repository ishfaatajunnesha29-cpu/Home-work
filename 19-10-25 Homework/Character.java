import java.util.Scanner;
class Character
{
	public static void main(String[] args)
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter any Character");
		char var = Sc.next().charAt(0);
		
		if(var>='a'&&var<='z')
		{
			System.out.println(var+" "+"is an Alphabet");
		}
		else if(var>='A'&&var<='Z')
		{
			System.out.println(var+" "+"is an Alphabet");
		}
		else
		{
			System.out.println(var+" "+"is not an Alphabet");
		}
	}
}