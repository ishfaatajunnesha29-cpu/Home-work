class MinMain
{
	public static void main(String[] args)
	{
		int ar[]={25,41,82,6,11,8,23,18};
		int min=ar[0];
		int i=0;
	
	    MinFun mf=new MinFun();
	    System.out.println("Minimum Number in the given array is: "+mf.findMin(ar,min,++i));
	}
}

