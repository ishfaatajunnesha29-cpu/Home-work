class UpdateValue
{
	public static void main(String[] args)
	{
		int ar[]={2,4,6,8,10};
		int value=99;
		int pos=3;
		int i=0;
		
		System.out.println("*****Before Updation*****");
		for(i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+", ");
		}
		System.out.println();
		
		UpdationFun uf=new UpdationFun();
		uf.update(ar,value,pos,i);
		
		System.out.println("*****After Updation*****");
		for(i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+", ");
		}		
	}
}