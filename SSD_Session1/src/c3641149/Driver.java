package c3641149;

public class Driver {

	public static void main(String[] args) {
	
		Rectangle rectangle1 = new Rectangle();
		rectangle1.setWidth(10);
		rectangle1.setHeight(20);
		System.out.println(rectangle1.getArea());
		
		Rectangle rectangle2 = new Rectangle();
		rectangle2.setWidth(30);
		rectangle2.setHeight(15);
		System.out.println(rectangle2.getArea());
		
		Rectangle rectangle3 = new Rectangle();
		rectangle3.setWidth(50);
		rectangle3.setHeight(25);
		System.out.println(rectangle3.getArea());
		
		System.out.println(rectangle1);
		
		Circle circle1 = new Circle();
		circle1.setLength(10);
		circle1.setName("Jeff");
		System.out.println(circle1);
	}
}
