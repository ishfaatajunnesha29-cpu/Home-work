class Decrease
{
	public static void main(String[] args)
	{
		float value = 1500;
		float percentage = 65;
		
		float decrease = (percentage/100)*1500;
		float newValue = value-decrease;
		
		System.out.println("Given Value:"+" "+value);
		System.out.println("Given Percentage:"+" "+percentage);
		System.out.println("New Value:"+" "+newValue);
	}
}