class OddNumber
{
	public static void main(String[] args)
	{
		int num = 35;
		
		if(num%2==1)
		{
			System.out.println(num+" is an Odd number");
		}
		else if(num%2==0)
		{
			System.out.println(num+" is an Even number");
		}
		else
		{
			System.out.println("You are entered a wrong number");
		}
	}
}