
public abstract class Item {

	private String[] beats;
	
	public Item (String[] beats)
	{
		this.beats = beats;
	}
	
	public int winner (Item other)
	{
		if (other.getName().equals(this.getName())) {
			return 0; }
		for (int i=0; i<beats.length; i++)
		{
			if (other.getName().equals(beats[i])){
				return 1; }
		}
		return -1; 
		
	}
	
	public String getName ()
	{
		return this.getClass().getSimpleName();
	}
}
