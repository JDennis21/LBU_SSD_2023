
public class Languages extends Social
{
	public Languages(String name, String description, String tutor, String room)
	{
		super(name, description, tutor, room);
	}

	@Override
	public int getCredit()
	{
		return 80;
	}
}
