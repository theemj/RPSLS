import java.util.Random;


public class CompPlayer implements Player {

	@Override
	public Item choice() {
		Item[] items = new Item[]{new Rock(), new Paper(), new Scissors(), new Lizard(), new Spock()};
		Random r = new Random();
		
		return items[r.nextInt(items.length)];
	}
	
	

}
