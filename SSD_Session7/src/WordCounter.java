import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @author c3641149
 *
 */
public class WordCounter {
	
	/**
	 * Maps words to their occurrence count.
	 */
	private final Map<String, Integer> wordMap = new HashMap<String, Integer>();
	
 /**
  * Adds a word to a HashMap and keeps track of the occurrences
  * 
  * @param Word	Word to be added to the HashMap
  */
	public void addWord(String Word) {
		
		if(!wordMap.containsKey(Word)) {
			wordMap.put(Word, 1);
		} else {
			wordMap.put(Word, wordMap.get(Word) + 1);
		}	
	}
	
	/**
	 * Adds a sentence to the HashMap by splitting the String into a string array and iterating through it. Then calls @addWord() on each element
	 * 
	 * @param sentence	The sentence to be added to the HashMap
	 */
	public void addSentence(String sentence) {
		
		String[] sentSplit = sentence.split(" ");
		for(int i=0; i < sentSplit.length; i++) {
			addWord(sentSplit[i]);
		}
	}
	
	/**
	 * Outputs the key and value for each word in the HashMap
	 */
	public void outputResults() {
		
		 for(Entry<String, Integer> set : wordMap.entrySet()) {
			 System.out.println(set.getKey() + " : " + set.getValue());
		 }
	}
}
