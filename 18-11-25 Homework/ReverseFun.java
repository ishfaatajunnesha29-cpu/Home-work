class ReverseFun
{
	int reverse(int ar[],int i)
	{
		if(i<=0)
		{
			return 0;
		}
		System.out.print(ar[i]+", ");
	    return reverse(ar,--i);
	}
}