class PaliFun
{
	int pali(int num,int sum)
	{
		if(num==0)
		{
			return sum;
		}
		int rem=num%10;
		return pali(num/10,sum*10+rem);
	}
}