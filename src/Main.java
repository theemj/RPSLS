
public class Main {

	public static void main(String[] args) {
		
		Player p1 = new CompPlayer();
		Player p2 = new HumanPlayer();
		
		RPSLSGame game = new RPSLSGame(p1, p2);
		
		game.run();

	}

}
