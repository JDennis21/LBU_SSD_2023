package c3641149;

public class Circle extends Shape{

	private int length;
	
	Circle() {
		super(1);
	}

	@Override
	public int getArea() {
		return 0;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}
