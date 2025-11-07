class PositiveNegativeArray
{
	public static void main(String [] args)
	{
	  int[] ar={12, 18, -2, -36, 45, -21, 1};
	  PositiveNegativeArray pos=new PositiveNegativeArray();
	  int p=pos.num(ar);
	  
	}
	int num(int[] ar)
	{   
	  for (int i = 0; i < ar.length; i++)  
		if(ar[i]>0)
		{
			System.out.println("The given Number "+ar[i]+" is Positive");
		}
		else if(ar[i]<0)
		{
			System.out.println("The given Number "+ar[i]+" is Negative");
			
		}
		else
		{
			System.out.println("the given Number "+ar[i]+" is Zero");
			
		}return 0;
	}
	
}