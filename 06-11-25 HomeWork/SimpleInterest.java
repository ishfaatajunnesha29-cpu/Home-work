class SimpleInterest
{
	public static void main(String [] args)
	{
		SimpleInterest s=new SimpleInterest();
		double principal = 10000;  
        double rate = 5;           
        double days = 60;         

        double SI =s.simple(principal, rate, days);

        System.out.println("Principal Amount is: " + principal);
        System.out.println("Rate of Interest is: "+rate+" % per annum");
        System.out.println("Number of Days: " + days);
        System.out.println("Simple Interest = "+SI);
	}
	double simple(double principal, double rate, double days)
	{
		double years = days/365;  
        double simple = (principal*rate*years)/100;
        return simple;
	}

}
