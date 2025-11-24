class DeleteFun
{
	public int[] del(int ar[],int value,int pos)
	{
		for(int i=pos-1;i<ar.length-1;i++)
		{
			ar[i]=ar[i+1];
		}
		return ar;
	}
}