
public class Calculator {

	public int divide(int numerator, int denominator) {
		if (denominator == 0)
			return 0;
		return (numerator / denominator);
	}

/////////////////////////////////////////////
	public int multiply(int firstnumber, int secondnumber) {
		return (firstnumber * secondnumber);
	}

/////////////////////////////////////////////	
	public int subtract(int firstnumber, int secondnumber) {
		return (firstnumber - secondnumber);
	}

/////////////////////////////////////////////
	public int addition(int firstnumber, int secondnumber) {
		int sum = 0;

		sum = firstnumber + secondnumber;
		return (sum);
	}

}