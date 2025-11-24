class InsertElement
{
	public static void main(String[] args)
	{
		int ar[]={10,20,30,40,50};
		int element=99;
		int pos=2;
		
		int br[]=new int[ar.length+1];
		
		System.out.println("*****Before Insertion*****");
		for(int i=0;i<ar.length;i++)
		{
		    System.out.print(ar[i]+", ");
		}
		System.out.println();
		
		InsertElementFun ie=new InsertElementFun();
		int res[]=ie.insert(ar,element,pos,br);
		
		System.out.println("*****After Insertion*****");
		for(int i=0;i<res.length;i++)
		{
		    System.out.print(res[i]+", ");
		}
	}
}