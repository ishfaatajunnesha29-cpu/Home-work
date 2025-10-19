import java.util.Scanner;
class GradeEvaluation
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter your grade");
		char ch=Sc.next().charAt(0);
		
		switch(ch)
		{
		case 'A':
		System.out.println("Very Good");
		break;
		
		case 'B':
		System.out.println("Good");
		break;
		
		case 'C':
		System.out.println("Satisfactory");
		break;
		
		case 'D':
		System.out.println("Needs Improvement");
		break;
		
		case 'F':
		System.out.println("Poor");
		break;
		
		default:
		System.out.println("You Entered a Wrong Grade");
		}
    }
}