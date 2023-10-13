
public abstract class Subject implements Delivery
{
	private String name;
	private String description;
	
	private String tutor;
	private String room;
	
	public abstract int getCredit();
	
	public Subject(String name, String description, String tutor, String room)
	{
		super();
		this.setName(name);
		this.setDescription(description);
		this.setTutor(tutor);
		this.setRoom(room);
	}

	@Override
	public String toString()
	{
		return "Subject: " + name + ", Description: " + description + ", Tutor: " + tutor + ", Room: " + room;
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
