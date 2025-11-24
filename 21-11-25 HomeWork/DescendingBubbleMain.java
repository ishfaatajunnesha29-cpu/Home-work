class DescendingBubbleMain
{
	public static void main(String[] args)
	{
		int ar[]={5,1,4,2,8};
		
		System.out.println("*****Before process*****");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+", ");
		}
		System.out.println();
		
		DescendingBubbleFun db=new DescendingBubbleFun();
		db.descending(ar);
		
		System.out.println("*****After process*****");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+", ");
		}		
	}
}