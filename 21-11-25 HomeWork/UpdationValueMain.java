class UpdationValueMain
{
	public static void main(String[] args)
	{
		int ar[]={11,22,33,44,55};
		int oldValue=33;
		int newValue=333;
		
		System.out.println("*****Before Updation*****");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+", ");
		}
		System.out.println();
		
		UpdationValueFun uv=new UpdationValueFun();
		uv.update(ar,oldValue,newValue);
		
		System.out.println("*****After Updation*****");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+", ");
		}		
	}
}