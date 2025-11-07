class SquareOfaNumber
{
	public static void main(String[] args)
	{
		int a=8;
		SquareOfaNumber s=new SquareOfaNumber();
		s.square(a);
	}
	int square(int a)
	{
		int b=a*a;
		System.out.println("The Square of a given Number is: "+b);
		return b;
	}
}