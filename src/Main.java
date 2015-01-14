
public class Main {

	public static void main(String[] args) {
		
		//Player set up; can also be 2 humans or 2 computers; adding option as part of gameplay at later date
		Player p1 = new CompPlayer();
		Player p2 = new HumanPlayer();
		
		RPSLSGame game = new RPSLSGame(p1, p2);
		
		game.run();

	}

}
