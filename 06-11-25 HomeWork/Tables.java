class Tables
{
	public static void main(String [] args)
	{
		Tables t=new Tables();
		t.tab();
	}
	int tab()
	{
		for (int i=1;i<=16;i++) 
		{
            System.out.println(i+(" Table"));
            for (int j=1;j<=10;j++) 
			{
                System.out.println(i+" x "+j+" = "+(i*j));
            }
            System.out.println();
		}return 0;	
	}
}
