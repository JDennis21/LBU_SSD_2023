import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = keyboard.nextLine();
		keyboard.close();
		
		Counter WordProcessor =  new WordProcessor();
		System.out.println("No. words = " + WordProcessor.countWords(sentence));
		System.out.println("No. length = " + WordProcessor.countLetters(sentence));
		System.out.println("Total length = " + WordProcessor.getLength(sentence));

	}
}
