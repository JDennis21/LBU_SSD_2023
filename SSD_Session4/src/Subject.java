
public abstract class Subject implements Delivery
{
	private String name;
	private String description;
	
	private String tutor;
	private String room;
	
	public abstract int getCredit();
	
	public Subject(String name, String description, String tutor, String room) throws SubjectException
	{
		super();
		
		if(tutor == null || tutor.isEmpty() || tutor.isBlank()) {
			throw new NoTutorException("No tutor has been assigned");
		}else if(room == null || room.isEmpty() || room.isBlank()) {
			throw new NoRoomException("No room has been assigned");
		}else {
			this.setName(name);
			this.setDescription(description);
			this.setTutor(tutor);
			this.setRoom(room);
		}
	}
	
	public Subject(String name, String description)
	{
		super();
		this.setName(name);
		this.setDescription(description);
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
	public void setTutor(String tutor) throws SubjectException
	{
		if(tutor == null || tutor.isEmpty() || tutor.isBlank()) {
			throw new NoTutorException("Tutor cannot be set to null");
		}else {
			this.tutor = tutor;
		}
	}

	@Override
	public String getRoom()
	{
		return room;
	}

	@Override
	public void setRoom(String room) throws SubjectException
	{
		if(room == null || room.isEmpty() || room.isBlank()) {
			throw new NoRoomException("Room cannot be set to null");
		}else {
			this.room = room;
		}
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
