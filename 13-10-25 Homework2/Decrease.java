class Decrease
{
	public static void main(String[] args)
	{
		int value = 1500;
		int percentage = 65;
		
		int decreaseValue = (percentage*value)/100;
		int finalValue = value-decreaseValue;
		
		System.out.println("The Decrease Value is:"+" "+decreaseValue);
		System.out.println("The Final Value is:"+" "+finalValue);
	}
}