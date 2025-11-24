class DeleteMain
{
	public static void main(String[] args)
	{
		int ar[]={7,14,21,28,35};
		int value=21;
		int pos=3;
		
		System.out.println("*****Before Deletion*****");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+", ");
		}
		System.out.println();
		
		DeleteFun df=new DeleteFun();
		int res[]=df.del(ar,value,pos);
		
		System.out.println("*****After Deletion*****");
		for(int i=0;i<res.length-1;i++)
		{
			System.out.print(res[i]+", ");
		}		
	}
}