class Palindrome
{
	public static void main(String[] args)
	{
		int a = 1331;
		int b = a;
		
		int c = a%10;
        int d = a/10;
		int e = d%10;
		int f = d/10;
		int g = f%10;
		int h = f/10;
		
		int i = (c*1000)+(e*100)+(g*10)+(h*1);
		boolean j = (i==b);

        System.out.println(j);		
	}
}