
public class Menu {

	public void displayMenuOption(int opt) throws InvalidOptionException {
		
		if(1 <= opt && opt <= 3) {
			System.out.printf("Menu option %s selected\n", opt);
		} else throw new InvalidOptionException(opt + " is not between 1 and 3");
	}
}
