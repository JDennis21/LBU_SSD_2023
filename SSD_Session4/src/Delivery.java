
public interface Delivery
{
	String getTutor();
	void setTutor(String tutor) throws SubjectException;
	
	String getRoom();
	void setRoom(String room) throws SubjectException;
}
