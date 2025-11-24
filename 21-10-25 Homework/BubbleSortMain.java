class BubbleSortMain
{
	public static void main(String[] args)
	{
		int ar[]={64,34,25,12,22,11,90};
		
		System.out.println("*****Before process*****");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+", ");
		}
		System.out.println();
		
		BubbleSortFun bs=new BubbleSortFun();
		bs.bubble(ar);
		
		System.out.println("*****After process*****");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+", ");
		}		
	}
}