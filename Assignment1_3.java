package in.ineuron.main;

public class Assignment1_3 {

	public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5-i+1;j++)
		{
			System.out.print("*");
		}
	
	for (int k=1;k<=2*i-2;k++)
	{
		System.out.print(" ");
	}
	for (int j=1;j<=5-i+1;j++)
	{
		System.out.print("*");
	}
	System.out.println();

	}
	for(int i=1;i<=5;i++)
	{
		for (int j=1;j<=10;j++)
		{
			
			 
			 if(i>=1&&j==1)
			 {
				 System.out.print("*");
			 }
			 else if(i==5 &&j<=10)
			 {
				 System.out.print("*");
			 }
			 else if (i>=1 &&j==10)
			 {
				 System.out.print("*");
			 }
			 else 
			 {
				 System.out.print(" ");
			 }
			 
			
		}
		System.out.println();
			 
			
			
			
		}
			
		System.out.println();
		}
		
	
	}



