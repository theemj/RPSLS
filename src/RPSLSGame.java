
public class RPSLSGame {
	
	private Player p1;
	
	private Player p2; 
	
	public RPSLSGame (Player p1, Player p2)
	{
		this.p1 = p1;
		this.p2 = p2;
		
	}

	public void run ()
	{
		Item item1 = p1.choice();
		Item item2 = p2.choice();
		System.out.println("Player 1 chose "+item1.getName()+" and Player 2 chose "+item2.getName()+".");
		int score = item1.winner(item2);
		if (score == -1)
			System.out.println("Player 2 wins!!");
		else if (score == 0)
			System.out.println("It's a tie!!");
		else
			System.out.println("Player 1 wins!!");
	}
}
