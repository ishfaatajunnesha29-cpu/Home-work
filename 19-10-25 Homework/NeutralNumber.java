class NeutralNumber
{
	public static void main(String[] args)
	{
		int num = 0;
		
		if(num>0)
		{
			System.out.println("The given number"+" "+num+" "+"is a positive number");
		}
		else if(num<0)
		{
			System.out.println("The given number"+" "+num+" "+"is a negative number");
		}
		else if(num==0)
		{
			System.out.println("The given number"+" "+num+" "+"is a neutral number");
		}
		else
		{
			System.out.println("You are Entered a wrong number");
		}
		
	}
}