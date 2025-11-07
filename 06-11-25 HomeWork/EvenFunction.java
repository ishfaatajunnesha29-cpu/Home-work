class EvenFunction
{
	public static void main(String[] args)
	{
		int a = 156;
		EvenFunction e = new EvenFunction();
		e.even(a);	
	}
	int even(int a)
	{
		if(a%2==0)
		{
			System.out.println("The given Number "+a+" is a even number");
		}
		else 
		{
			System.out.println("The given Number "+a+" is a odd number");
		}
		return a;
	}
}