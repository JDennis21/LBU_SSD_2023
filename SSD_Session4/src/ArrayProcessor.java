
public class ArrayProcessor {

	public int getArrayLength(Object [] a){
		
		int count = 0;
		
		try {
			while (true) {
			Object obj = a[count];
			count++;
			}
		} catch(Exception e) {
			return count;
		}
	} 
}
