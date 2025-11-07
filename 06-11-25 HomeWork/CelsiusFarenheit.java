class CelsiusFarenheit
{
	public static void main(String [] args)
	{
		CelsiusFarenheit cel=new CelsiusFarenheit();
		double celsius = 37.0;
		double farenheit = cel.faren(celsius);
		System.out.println(celsius + "°C = " + farenheit + "°F");
	}
	double faren(double celsius)
	{
		double farenheit = (celsius * 9 / 5) + 32;
        return farenheit;
	}
}