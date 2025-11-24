class InsertEndElement
{
	public static void main(String[] args)
	{
		int ar[]={5,10,15,20};
		int element=25;
		
		int br[]=new int[ar.length+1];
		
		System.out.println("*****Before Insertion*****");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+", ");
		}
		System.out.println();
		
		InsertEndFun ie=new InsertEndFun();
		int res[]=ie.end(ar,element,br);
		
		System.out.println("*****After Insertion*****");
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+", ");
		}
	}
}