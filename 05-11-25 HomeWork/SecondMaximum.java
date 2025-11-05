class SecondMaximum
{
	public static void main(String[] args)
	{
		int ar[]={8,16,39,7,25,23,2};
		int firstMax=39;
		int scndMax=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if((ar[i]>scndMax)&&(ar[i]<firstMax))
			{
				scndMax=ar[i];
			}
		}
		System.out.print("The Second Maximum Number is: "+scndMax);
	}
}