class InsertEndFun
{
	public int[] end(int ar[],int element,int br[])
	{
		for(int i=0;i<ar.length;i++)
		{
			br[i]=ar[i];
		}
		br[ar.length]=element;
		return br;
	}
}