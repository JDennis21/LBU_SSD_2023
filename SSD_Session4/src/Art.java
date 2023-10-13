
public class Art extends Subject
{
	public Art(String name, String description)
	{
		super(name, description);
	}

	@Override
	public int getCredit()
	{
		return 40;
	}
}
