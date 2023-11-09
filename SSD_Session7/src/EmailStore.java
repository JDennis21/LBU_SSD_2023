import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author c3641149
 *
 */
public class EmailStore {

	Set<String> emailAddresses = new HashSet<String>();
	
	/**
	 * Adds an email in the form of a String to the emailAddresses set
	 * 
	 * @param email	Email that is to be added to the set
	 * @return Returns true if email was not a duplicate
	 */
	public boolean addEmail(String email) {
		return emailAddresses.add(email);
	}
	
	/**
	 * Checks if an email is already present within the set
	 * 
	 * @param email	Email that is checked
	 * @return Returns true if the email is within the set
	 */
	public boolean hasEmail(String email) {
		return emailAddresses.contains(email);
	}
	
	/**
	 * Displays each element of the emailAddresses set using println()
	 */
	public void displayEmails() {
		for (String name : emailAddresses) {
		    System.out.println(name);
		}
	}
}
