import java.util.Stack;

/**
 * 
 * @author c3641149
 *
 */
public class NumberSorter {

	/**
	 * Takes an array of integers and sorts them based ascending or descending
	 * 
	 * @param numbers		Int array of numbers to be sorted using stack
	 * @param ascending		Boolean value that determines if the list should be sorted in ascending or descending order		
	 */
	public void sort(int [] numbers, boolean ascending) {
		// The source stack, from which the numbers are popped
		Stack<Integer> srcStack = new Stack<Integer>();
		
		// The destination stack, to which the numbers are pushed
		Stack<Integer> destStack = new Stack<Integer>();
		
		// Add the initial array of numbers to the source stack
		for (int number : numbers) {
				srcStack.push(number);
		}
		
		// If ascending is true sort the srcStack in ascending order
		if(ascending) {
			while(!srcStack.isEmpty()) {

		        int srcTopVal = (int) srcStack.pop();

		        while(!destStack.isEmpty() && (destStack.peek() > srcTopVal)) {
		            srcStack.push(destStack.pop());
		        }
		        destStack.push(srcTopVal);
			}
		} 
		
		// If ascending is false sort the srcStack in descending order
		else if(!ascending) {
			while(!srcStack.isEmpty()) {

		        int srcTopVal = (int) srcStack.pop();

		        while(!destStack.isEmpty() && (destStack.peek() < srcTopVal)) {
		            srcStack.push(destStack.pop());
		        }
		        destStack.push(srcTopVal);
			}
		}

		System.out.println(destStack.toString());
	}	
}
