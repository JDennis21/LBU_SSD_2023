
public abstract class Social extends Subject
{
	public Social(String name, String description)
	{
		super(name, description);
	}
	
	@Override
	public int getCredit()
	{
		return 80; 
	}
}
