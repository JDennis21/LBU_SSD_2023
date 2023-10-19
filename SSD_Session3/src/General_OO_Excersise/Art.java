package General_OO_Excersise;

public class Art extends Subject
{
	public Art(String name, String description, String tutor, String room) throws SubjectException
	{
		super(name, description, tutor, room);
	}

	@Override
	public int getCredit()
	{
		return 40;
	}
}
