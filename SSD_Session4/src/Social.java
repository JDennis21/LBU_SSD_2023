
public abstract class Social extends Subject
{	
	public Social(String name, String description, String tutor, String room) throws SubjectException
	{
		super(name, description, tutor, room);
	}

	@Override
	public int getCredit()
	{
		return 80; 
	}
}
