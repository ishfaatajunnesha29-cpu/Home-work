class MergeSortMain
{
	public static void main(String[] args)
	{
		int ar[]={38,27,43,3,9,82,10};
		
		System.out.println("*****Before Sorting*****");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+", ");
		}
		System.out.println();
		
		MergeSortFun ms=new MergeSortFun();
		int res[]=ms.divide(ar);
		
		System.out.println("*****After Sorting*****");
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+", ");
		}		
	}
}