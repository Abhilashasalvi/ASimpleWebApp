import java.util.Scanner;
class FoodMenu
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		boolean flag=true;
		int qty,total=0;
		while(flag)
		{
			System.out.println("------Food menu------");
			System.out.println("1.Dosa ---Rs 50");
			System.out.println("2.Samosa---Rs 20");
			System.out.println("3.Idli---Rs 50");
			System.out.println("4.Rice---Rs 50");
			System.out.println("5.Generate Bill");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1 : System.out.println("Enter the Quantity");
					qty=sc.nextInt();
					total+=qty*50;
					break;
				case 2 : System.out.println("Enter the Quantity");
					qty=sc.nextInt();
					total+=qty*20;
					break;
				case 3 : System.out.println("Enter the Quantity");
					qty=sc.nextInt();
					total+=qty*50;
					break;
				case 4 : System.out.println("Enter the Quantity");
					qty=sc.nextInt();
					total+=qty*50;
					break;
				case 5 : System.out.println("Total Bill="+total);
					flag=false;
					break;
				default : System.out.println("-----invalid choice----");
					break;
				
				}
			}
		sc.close();

	}
}