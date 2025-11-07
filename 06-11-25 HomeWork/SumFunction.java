class SumFunction
{
	public static void main(String[] args)
	{
		int a=5;
		int b= 15;
		SumFunction s=new SumFunction();
		s.add(a,b);
	}
	int add(int a,int b)
	{
		int c=a+b;
		System.out.println("The Sum of two numbers is: "+c);
		return c;
	}
}