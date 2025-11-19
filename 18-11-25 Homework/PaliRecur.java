class PaliRecur
{
	public static void main(String[] args)
	{
		int num=9889;
		PaliFun af= new PaliFun();
		int res=af.pali(num,0);
		
		if(res==num)
		{
			System.out.println(res+" is a Palindrome Number");
		}
		else
		{
			System.out.println(res+" is not a Palindrome Number");
		}
	}
}