
public abstract class Subject implements Delivery
{
	private String tutor;
	private String room;
	
	private String name;
	private String description;
	
	public abstract int getCredit();
	
	public Subject(String name, String description)
	{
		this.setName(name);
		this.setDescription(description);
	}

	@Override
	public String getTutor()
	{
		return tutor;
	}

	@Override
	public void setTutor(String tutor)
	{
		this.tutor = tutor;
	}

	@Override
	public String getRoom()
	{
		return room;
	}

	@Override
	public void setRoom(String room)
	{
		this.room = room;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}
}
