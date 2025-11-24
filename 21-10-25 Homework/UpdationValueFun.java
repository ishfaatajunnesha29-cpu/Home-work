class UpdationValueFun
{
	public void update(int ar[],int oldValue,int newValue)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==oldValue)
			{
			ar[i]=newValue;
			}
		}
		
	}
}