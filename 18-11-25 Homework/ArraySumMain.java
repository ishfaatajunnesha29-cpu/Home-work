class ArraySumMain
{
	public static void main(String[] args)
	{
		int ar[]={2,5,8,23,6,29,18,7};
		int sum=0;
		int i=0;
		
		ArraySumFun as=new ArraySumFun();
		int res=as.sumArray(ar,sum,i);
		System.out.println("Sum of the array is: "+res);
	}
}


