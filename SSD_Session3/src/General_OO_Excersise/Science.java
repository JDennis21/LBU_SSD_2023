package General_OO_Excersise;

public abstract class Science extends Subject
{	
	public Science(String name, String description, String tutor, String room) throws SubjectException
	{
		super(name, description, tutor, room);
	}

	@Override
	public int getCredit()
	{
		return 100;
	}
}
