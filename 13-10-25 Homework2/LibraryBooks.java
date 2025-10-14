class LibraryBooks
{
	public static void main(String[] args)
	{
		int totalBooks = 1800;
		float mathsBooksPercentage = 40;
		float englishBooksPercentage = 20;
		float scienceBooksPercentage = 30;
		float socialBooksPercentage = 10;
		
		float mathsBooks = totalBooks*(mathsBooksPercentage/100);
		float englishBooks = totalBooks*(englishBooksPercentage/100);
		float scienceBooks = totalBooks*(scienceBooksPercentage/100);
		float socialBooks = totalBooks*(socialBooksPercentage/100);
		
		System.out.println("Total Number of books in Library:"+" "+totalBooks);
		System.out.println("Number of Maths Books:"+" "+mathsBooks);
		System.out.println("Number of English Books:"+" "+englishBooks);
		System.out.println("Number of Science Books:"+" "+scienceBooks);
		System.out.println("Number of Social Books:"+" "+socialBooks);
	}
}