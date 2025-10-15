import java.util.Scanner;

class Operations
{
	public static void main(String[] args)
	{
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the First number:");
		int num1 = value.nextInt();
		
		System.out.println("Enter the Second number: ");
		int num2 = value.nextInt();
		
		int num3 = num1 + num2;
		System.out.println(num1+"+"+num2+"="+num3);
		
		int num4 = num1 - num2;
		System.out.println(num1+"-"+num2+"="+num4);
		
		int num5 = num1 * num2;
		System.out.println(num1+"*"+num2+"="+num5);
		
		int num6 = num1 / num2;
		System.out.println(num1+"/"+num2+"="+num6);
		
		int num7 = num1 % num2;
		System.out.println(num1+"%"+num2+"="+num7);
		
	}
}