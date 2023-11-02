
/**
 * 
 * @author c3641149
 *
 */
public class Driver {

	/**
	 * Driver class that tests the NameManager and NumberSorter classes function correctly
	 */
	public static void main(String[] args) {
	
		// Tests the NameManager class
		NameManager manager = new NameManager();
		
		manager.addName("M.Mickleson");
		manager.addName ("Johnua Taylor Biggs");
		manager.addName ("P.Smith");
		manager.addName ("Peter Jonathan Smythton");
		manager.addName ("P.Thompson");
		
		manager.printNames();
		
		manager.removeLongNames();
		System.out.println();
		
		manager.printNames();
		System.out.println();
		
		// Tests the NumberSorter class
		NumberSorter sorter = new NumberSorter();
		
		sorter.sort(new int [] {1,9,2,3,10,8,12,1, 99, 2, 43, 68, 109, 0}, true);
		sorter.sort(new int [] {1,2,3,4}, false);
		sorter.sort(new int [] {4,3,2,1}, true);
	}
}
