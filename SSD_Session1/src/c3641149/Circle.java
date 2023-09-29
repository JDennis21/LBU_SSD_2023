package c3641149;

public class Circle extends Shape{

	private int length;
	private String name;

	Circle() {
		super(1);
	}
	
	public String toString() {
		return "Name: " + getName() + "\nLength: " + getLength() + "\nArea: " + getArea() + "\nRadius: " 
				+ getRadius() + "\nSides: " + getSides();
	}

	@Override
	public int getArea() {
		return (int)(((length/Math.PI)/2)*((length/Math.PI)/2)/Math.PI);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getRadius(){
		return (length/Math.PI)/2;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}
}
