import java.util.Scanner;
class DoubleArg
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		if(sc.hasNextInt())
		{
			int a=sc.nextInt();
			if(sc.hasNextInt())
			{
				System.out.println("Enter second number");
				int b=sc.nextInt();
				System.out.println("a="+a+"  b="+b);
				System.out.println("Average="+((a+b)/2));
			}
			
		}
		else if(sc.hasNextDouble())
		{
			double c=sc.nextDouble();
			if(sc.hasNextDouble())
			{
				Double d=sc.nextDouble();
				System.out.println("Value is Double type");
				System.out.println("c="+c+"  d="+d);
				
			}
		}

		else
		{	
			System.out.println("value is not double type");
		}
		sc.close();


	}
}