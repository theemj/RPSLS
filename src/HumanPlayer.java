import java.util.Scanner;


public class HumanPlayer implements Player {

	@Override
	public Item choice() {
		Item[] items = new Item[]{new Rock(), new Paper(), new Scissors(), new Lizard(), new Spock()};
		for (int i=0; i<items.length; i++)
		{
			System.out.println((i+1)+" - "+items[i].getName());
		}
		System.out.print("Choose your item! ");
		Scanner input = new Scanner(System.in);
		Item userChoice = items[input.nextInt()-1];
		return userChoice;
	}

	
}
