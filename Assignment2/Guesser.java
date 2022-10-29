import java.util.Scanner;

public class Guesser {
	int guessNum;
	
	int guessNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number");
		guessNum=sc.nextInt();
		boolean t=checkRange(guessNum);
		//System.out.println("t"+t);
		if(t)
			{
			//System.out.println("in true"+guessNum);
			return guessNum;
			}
		else
		{
			guessNumber();
			
		}
		return guessNum;
		
	}
	
	boolean checkRange(int guessNum)
	{
		if (guessNum>=10)
		{
			System.out.println("The number is not in range between o and 10 . Please enter another number");
			//guessNumber();
			return false;
		}
		else 
		{
			return true;
		}
		
		
	}

}
