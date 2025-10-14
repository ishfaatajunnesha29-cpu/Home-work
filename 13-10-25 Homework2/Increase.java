class Increase
{
	public static void main(String[] args)
	{
		float value = 670;
		float percentage = 30;
		
		float increaseValue = (percentage/100)*value;
		float finalValue = value+increaseValue;
		
		System.out.println("The Increase value is:"+" "+increaseValue);
		System.out.println("The Final Value is:"+" "+finalValue);
	}
}