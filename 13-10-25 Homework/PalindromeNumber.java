class PalindromeNumber
{
	public static void main(String[] args)
	{
		int a = 12321;
		int b = a;
		
		int c = a%10;
		int d = a/10;
		int e = d%10;
		int f = d/10;
		int g = f%10;
		int h = f/10;
		int i = h%10;
		int j = h/10;
		
		int k = (c*10000)+(e*1000)+(g*100)+(i*10)+(j*1);
		
		boolean l = (k==b);
		
		System.out.println(l);
	}	
}