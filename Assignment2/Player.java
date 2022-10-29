import java.util.Scanner;

public class Player {
int guessNum;

int guessNumber()
{
	System.out.println("Please guess a number player");
	Scanner sc=new Scanner(System.in);
	guessNum=sc.nextInt();
	return guessNum;
}
}
