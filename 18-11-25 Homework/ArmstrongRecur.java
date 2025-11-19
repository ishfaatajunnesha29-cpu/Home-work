class ArmstrongRecur
{
	public static void main(String[] args)
	{
		int num=1634;
		ArmsFun af= new ArmsFun();
		int res=af.arms(num,0);
		
		if(res==num)
		{
			System.out.println(res+" is an Armstrong Number");
		}
		else
		{
			System.out.println(res+" is not an Armstrong Number");
		}
	}
}