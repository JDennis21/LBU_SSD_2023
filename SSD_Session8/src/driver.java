
public class driver {
	public static void main(String[] args) {
	
		census c = new census();
		
		Person p = new Person(20, 175, false);
		Person p1 = new Person(30, 120, false);
		Person p2 = new Person(15, 150, true);
		
		c.addPerson(p);
		c.addPerson(p1);
		c.addPerson(p2);
		System.out.println(c.toString());
		
		System.out.println(c.countFemales());
		System.out.println(c.countMales());
		System.out.println(c.countPeople());
		c.sortOnAge();
		System.out.println(c.toString());
		c.sortOnHeight();
		System.out.println(c.toString());
		c.sortOnGender();
		System.out.println(c.toString());
		System.out.println(c.removePerson(p));
		System.out.println(c.toString());
	}
}
