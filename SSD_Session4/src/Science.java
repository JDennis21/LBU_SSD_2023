
public abstract class Science extends Subject
{	
	public Science(String name, String description, String tutor, String room)
	{
		super(name, description, tutor, room);
	}

	@Override
	public int getCredit()
	{
		return 100;
	}
}