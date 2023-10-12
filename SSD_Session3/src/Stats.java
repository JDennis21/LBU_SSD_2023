import java.util.Arrays;

/**
 * @author	Josh Dennis
 */
public class Stats {

	private int[] numbers;	
	private int count;		

	/**
	 * Iterates through the integer array one time when called and allows for the element to be overwritten
	 * 
	 * @param value	The value that will be assigned in the numbers array.
	 */
	public void addValue(int value) {
		numbers[count] = value;
		count++;
	}

	/**
	 * Counts the total amount of values in the numbers array.
	 * 
	 * @return The total amount of values in the numbers array.
	 */
	public int getCount() {
		return numbers.length;
	}

	/**
	 * Returns the highest value in the numbers array.
	 * 
	 * @return The highest number in the numbers array.
	 */
	public int getMax() {

		int max = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max)
				max = numbers[i];
		}

		return max;
	}

	/**
	 * Returns the lowest value in the numbers array.
	 * 
	 * @return The lowest number in the numbers array.
	 */
	public int getMin() {
		int min = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min)
				min = numbers[i];
		}

		return min;
	}

	/**
	 * Returns the total value of all the generated numbers in the numbers array added together.
	 * 
	 * @return Total value of all elements in the numbers array added together.
	 */
	public int getTotal() {
		int total = 0;

		// total all values within the array
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}

	/**
	 * Returns the average of all the values in the numbers array.
	 * 
	 * @return Average of all the values in the numbers array.
	 */
	public double getAverage() {
		int x = 0;

		for (int i = 0; i < numbers.length; i++) {
			x += numbers[i];
		}

		double y = x / (double) numbers.length;
		return y;
	}

	/**
	 * Returns all values of the object to console.
	 * 
	 * @return All values attached to the stats object
	 */
	@Override
	public String toString() {
		return Arrays.toString(numbers);
	}

	/**
	 * Constructor for the Stats.java class
	 * 
	 * @param capacity	The amount of values that will be generated.
	 */
	public Stats(int capacity) {
		numbers = new int[capacity];
	}
}
