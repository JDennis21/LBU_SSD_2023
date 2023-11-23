import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1, "JJ. Jognson", 38));
		students.add(new Student(2, "P. Tibbs", 48));
		students.add(new Student(3, "W. Major", 28));
		students.add(new Student(4, "P. Turner", 60));
		students.add(new Student(5, "A. Ball", 20));
		students.add(new Student(6, "B. Smithy", 90));
		students.add(new Student(7, "R. Jules", 71));
		students.add(new Student(8, "T. Verne", 97));

		
		// create your Stream solutions here
		System.out.println("\nPart 1 All students in the List");
		students.stream().forEach(System.out::println);
		
		System.out.println("\nPart 2 Only students with grade over 70%");
		students.stream().filter((student) -> student.getGrade() > 70).forEach(System.out::println);
		
		System.out.println("\nPart3 Names changed to uppercase, then sorted");
		Object [] studentArray = (students.stream().map((student) -> student.getName().toUpperCase()).sorted().toArray());
		System.out.println(Arrays.toString(studentArray));
		
		System.out.println("\nPart4 Average grade for all students");
		double aveGrade = students.stream().mapToDouble((student) -> student.getGrade()).average().getAsDouble();
		System.out.println(aveGrade);
		
		System.out.println("\nPart5 Cube numbers between 90 and 100");
		IntStream.range(90, 100).map((num) -> num*num*num).forEach(System.out::println);
		
		System.out.println("\nPart6 Infinite stream of random numbers");
		List<Integer> numList = Stream.generate(Math::random).map(n -> (int)(n * 5 + 1)).limit(10).distinct().toList();
		
		for(int next : numList)
			System.out.println("Next value is : " + next);
		
	}
}
