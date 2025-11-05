class SecondMinimum
{
	public static void main(String[] args)
	{
		int ar[]={4,6,2,33,68,91,24};
		int firstMin=ar[0];
		int scndMin=firstMin;
		for(int i=1;i<ar.length;i++)
		{
			if((ar[i]<scndMin)&&(ar[i]>firstMin))
			{
				scndMin=ar[i];
			}
		}
		System.out.println("The Second Minimum Number is: "+scndMin);
	}
}