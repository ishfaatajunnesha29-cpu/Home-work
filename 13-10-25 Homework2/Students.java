class Students
{
	public static void main(String[] args)
	{
		float students = 50;
		float percentageOfGirls = 40;
		
		float girls = (percentageOfGirls/100)*students;
		float boys = students-girls;
		
		System.out.println("Total Number of Students in Class:"+" "+students);
		System.out.println("Number of boys in class:"+" "+boys);
		System.out.println("Number of girls in class:"+" "+girls);
		
	}
}