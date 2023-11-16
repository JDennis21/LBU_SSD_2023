import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class census {
	
	private List<Person> people = new ArrayList<Person>();
	
	public void addPerson(Person person) {
		people.add(person);
	}

	public boolean removePerson(Person person) {
		if(people.remove(person)) {
			return true;
		} else return false;
	}
	
	public int countPeople() {
		return people.size();
	}
	
	public int countMales() {
		int i = 0;
		for(Person person : people) {
			if(person.getGender()) {
				i++;
			}
		}
		return i;
	}
	
	int countFemales() {
		int i = 0;
		for(Person person : people) {
			if(!person.getGender()) {
				i++;
			}
		}
		return i;
	}

	@Override
	public String toString() {
		return "census [people=" + people + "]";
	}
	
	public void sortOnAge() {
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return Integer.compare(p1.getAge(), p2.getAge());
			}
		}
		);
	}
	
	public void sortOnHeight() {
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return Integer.compare(p1.getHeight(), p2.getHeight());
			}
		}
		);
	}
	
	public void sortOnGender() {
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return Boolean.compare(p1.getGender(), p2.getGender());
			}
		}
		);
	}
}
