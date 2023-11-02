import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author c3641149
 *
 */
public class NameManager {
	
	// String ArrayList containing names
	List<String> namesArray = new ArrayList<String>();	
	
	/**
	 * Adds a name to the namesArray
	 * 
	 * @param name	The name that will be added to the names array
	 */
	public void addName(String name) {
		namesArray.add(name);
	}
	
	/**
	 * Prints all the names in the namesArray as a string
	 */
	public void printNames() {
		for(int i = 0; i < namesArray.size(); i++) {
			System.out.println("Array index " + i + " = " + namesArray.get(i));
		}
	}
	
	/**
	 * Removes all names over 15 characters from the namesArray
	 */
	public void removeLongNames() {
		for(int i = 0; i < namesArray.size(); i++) {
			if(namesArray.get(i).length() > 15) {
				namesArray.remove(i);
			}
		}
	}
}
