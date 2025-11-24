class Mobile
{
	public static void main(String[] args)
	{
		MobileModel m1=new MobileModel();
		
		m1.mobileName="Note 8 Pro";
		m1.mobileBrandName="MI";
		m1.mobileAmount=25000;
		m1.quantity=1;
		
		MobileModel m2=new MobileModel();
		
		m2.mobileName="16 Pro";
		m2.mobileBrandName="APPLE";
		m2.mobileAmount=100000;
		m2.quantity=1;

		MobileModel m3=new MobileModel();
		
		m3.mobileName="16 Pro";
		m3.mobileBrandName="APPLE";
		m3.mobileAmount=100000;
		m3.quantity=1;
		
		MobileModel m4=new MobileModel();
		
		m4.mobileName="PHONE 2";
		m4.mobileBrandName="Nothing";
		m4.mobileAmount=40000;		
		m4.quantity=1;
		
		m1.mobiles();
		m2.mobiles();
		m3.mobiles();
		m4.mobiles();
	}
}