class MaxMain
{
	public static void main(String[] args)
	{
		int ar[]={24,32,55,2,67,9,8,13};
		int max=ar[0];
		int i=0;
		
		MaxFun mf=new MaxFun();
		System.out.println(mf.findMax(ar,max,i));
		
	}
}

