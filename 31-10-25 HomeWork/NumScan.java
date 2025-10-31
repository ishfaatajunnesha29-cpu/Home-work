import java.util.Scanner;
class NumScan
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the Length of an Array: ");
		int len = Sc.nextInt();
		
		
		int ar[] = new int [len];
		
		for(int i=0;i<ar.length;i++)
			{
				System.out.print("Enter the index value "+i+" :");
				ar[i] = Sc.nextInt();
			}
			System.out.println(" ");
		
		for(int i=0;i<ar.length;i++)
		
			{
				System.out.println("The "+i+" index value of Array is : "+ar[i]);
			}
			
		
		
	}
}