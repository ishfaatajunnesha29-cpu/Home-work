class InsertElementFun
{
	public int[] insert(int ar[],int element,int pos,int br[])
	{
		for(int i=0;i<pos-1;i++)
		{
				br[i]=ar[i];
		}
		br[pos-1]=element;
		for(int i=pos;i<br.length;i++)
		{
			br[i]=ar[i-1];
		}
		return br;
	}
}