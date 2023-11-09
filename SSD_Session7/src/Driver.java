
public class Driver {

	public static void main(String[] args) {
		
		EmailStore em = new EmailStore();
		
		System.out.println(em.addEmail("J.dennis@leedsbeckett.ac.uk"));
		System.out.println(em.addEmail("p.brooke@leedsbeckett.ac.uk"));
		System.out.println(em.addEmail("J.dennis@leedsbeckett.ac.uk"));
		System.out.println(em.addEmail("L.Smith@leedsbeckett.ac.uk"));
		
		System.out.println("");
		
		System.out.println(em.hasEmail("J.dennis@leedsbeckett.ac.uk"));
		System.out.println(em.hasEmail("not.real@leedsbeckett.ac.uk"));
		
		System.out.println("");
		
		em.displayEmails();
		
		System.out.println("");
		
		WordCounter wc = new WordCounter();
		
		wc.addSentence("this sentence has the word has in it twice");
		wc.outputResults();
	}
}
