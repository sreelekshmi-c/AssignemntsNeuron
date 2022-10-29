
public class Umpire {

	int numfromGuesser;
	int numfromPlayer1;
	
	int numfromPlayer2;
	int numfromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numfromGuesser=g.guessNumber();
		
		
		
	}
	void CollectNumFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numfromPlayer1=p1.guessNumber();
		numfromPlayer2=p2.guessNumber();
		numfromPlayer3=p3.guessNumber();
		
	}
	void compare()
	{
		//System.out.println("numberfromGu"+numfromGuesser);
		if(numfromGuesser==numfromPlayer1)
		{
			if(numfromGuesser==numfromPlayer2&&numfromGuesser==numfromPlayer3)
			{
				System.out.println("Game tied all three players gessed correctly");
			}
			else if(numfromGuesser==numfromPlayer2)
			{
				System.out.println("Player 2 and Player1 won");
			}
			else if (numfromGuesser==numfromPlayer3)
			{
				System.out.println("Player 1  and Player 3 won the game");
			}
			
			else
			{
			
			System.out.println("Player1 won the game");
			}
		}
		else if(numfromGuesser==numfromPlayer2)
		{
			if (numfromGuesser==numfromPlayer3)
			{
				System.out.println("Player 2 and Player 3 won the game");
			}
			else 
			{
			System.out.println("Player2 won the game");
			}
		}
		else if(numfromGuesser==numfromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else 
		{
			System.out.println("All lose the game");
		}
		
	}
}
