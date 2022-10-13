package in.ineuron.main;

public class Assignment5 {

	public static void main(String[] args) {
	
		for(int i=1;i<8;i++)
		{
			for (int j=1;j<=8;j++)
			{
				if ( i==1&&j>=i )
				{
					System.out.print("*");
				}
				if(i>1&&i+j<=8)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print("");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=8;i++)
		{
			for (int j=1;j<=8;j++)
			{
				if ( i==1 && j<=2 )
				{
					System.out.print("*");
				}
				else if(i==2&&j<=3)
				{
					System.out.print("*");
				}
				else if((i==3||i==4||i==5)&&j<=i+1)
				{
					System.out.print("*");
				}
				if ( i==5&&j<i-1 )
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print("");
				}
				
			}
			System.out.println();
		}
		
		

	}

}
