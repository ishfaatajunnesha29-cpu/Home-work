class Deletion
{
	public static void main(String[] args)
	{
		int ar[]={1,2,3,4,5};
		int pos=2;
		
		System.out.println("*****Before Deletion*****");
		for(int i=0;i<ar.length;i++)
		{
		    System.out.print(ar[i]+", ");	
		}
		System.out.println();
		
		DeletionFun df= new DeletionFun();
		df.delete(ar,pos);
		
		System.out.println("*****After Deletion*****");
		for(int i=0;i<ar.length-1;i++)
		{
		System.out.print(ar[i]+", ");	
		}		
	}
}