class Increase
{
	public static void main(String[] args)
	{
		double value = 670;
		double percentage = 30;
		
		double increase = (percentage/100)*value;
		double newValue = value+increase;
		
		System.out.println("Given Value:"+" "+value);
		System.out.println("Given Percentage:"+" "+percentage);
		System.out.println("New Value:"+" "+newValue);
		
	}
}