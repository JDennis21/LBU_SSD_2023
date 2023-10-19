
public class Driver {

	public static void main(String[] args) {
		
		ArrayProcessor ap = new ArrayProcessor();
		Menu menu = new Menu();
		String[]  strArray= {"one", "two", "three"};
		
		System.out.println("Array length is " + ap.getArrayLength(strArray));
		
		try {
			menu.displayMenuOption(0);
		} catch(InvalidOptionException e) {
			e.printStackTrace();
		}
		
		try {
			menu.displayMenuOption(1);
		} catch(InvalidOptionException e) {
			e.printStackTrace();
		}
		
		try {
			menu.displayMenuOption(3);
		} catch(InvalidOptionException e) {
			e.printStackTrace();
		}
		
		try {
			menu.displayMenuOption(4);
		} catch(InvalidOptionException e) {
			e.printStackTrace();
		}
	}

}
