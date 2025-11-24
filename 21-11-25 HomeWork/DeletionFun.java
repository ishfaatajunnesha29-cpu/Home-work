class DeletionFun
{
	public void delete(int ar[],int pos)
	{
		for(int i=pos-1;i<ar.length-1;i++)
		{
			ar[pos-1]=ar[i+1];
		}
	}
}