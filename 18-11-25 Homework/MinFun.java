class MinFun
{
	int findMin(int ar[],int min,int i)
	{
		if(i<ar.length)
		{
			if(min>ar[i])
			{
				min=ar[i];
			}
			return findMin(ar,min,++i);
		}
		return min;
	}
}