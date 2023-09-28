package c3641149;

public class Rectangle extends Shape {
	
	private int width;
	private int height;
	
	Rectangle() {
		super(2);
	}
	
	@Override
	public int getArea() {
		return width * height;	
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public String toString() {
		return "Height: " + getHeight() + "\nWidth: " + getWidth() + "\nArea: " + getArea();
	}
}
