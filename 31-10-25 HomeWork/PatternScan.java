import java.util.Scanner;
class PatternScan
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the Row: ");
		int row = Sc.nextInt();
		System.out.print("Enter the Column: ");
		int column = Sc.nextInt();
		
		int ar[][] = new int [row][column];
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print("Enter the index value "+i+" "+j+" : ");
			    ar[i][j] = Sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}