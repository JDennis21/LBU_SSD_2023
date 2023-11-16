
public class Person {
	
	private int age;
	private int height;
	private boolean	gender;

	public Person(int age, int height, boolean gender) {
		super();
		this.age = age;
		this.height = height;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean getGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", height=" + height + ", gender=" + gender + "]";
	}

}
