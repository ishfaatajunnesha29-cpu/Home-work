class FindMax
{
	public static void main(String[] args)
	{
		int a=23;
		int b=29;
		FindMax f=new FindMax();
		int res=f.max(a,b);
		System.out.println("The larger number is: "+res);
	}
	int max(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
}