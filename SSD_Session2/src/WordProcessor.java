
public class WordProcessor implements Counter{

	private String text = "this is default text";
	
	@Override
	public int countWords(String sentence) {
		if(sentence.isEmpty()) {
			sentence = text;
		}
		return sentence.split(" ").length;
	}

	@Override
	public int countLetters(String sentence) {
		if(sentence.isEmpty()) {
			sentence = text;
		}
		int letters = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if ( Character.isLetter(sentence.charAt(i))) {
				letters++;
			}
		}
		return letters;
	}

	@Override
	public int getLength(String sentence) {
		if(sentence.isEmpty()) {
			sentence = text;
		}
		return sentence.length();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
