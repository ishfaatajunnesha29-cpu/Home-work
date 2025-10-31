import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
        System.out.print("Enter any Number between 1 to 30 : ");
		int num = Sc.nextInt();
		boolean prime = true;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				 prime = false;
				 break;
			}
		}
		     System.out.println(num+" is a prime Number : "+prime);
	}
}