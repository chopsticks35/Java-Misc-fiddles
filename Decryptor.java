package homework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Decryptor implements Callable<String> {
	public String call(){
//		String decryptedMessage = getDecryptedMessage();
//		System.out.println(" : " + decryptedMessage);
		
		return getDecryptedMessage();
	}
	
	private String decryptedMessage;
	private String originalMessage;
	private int shift;
	private Thread theThread = null;
//	private static int i;
	
	
	// constructors
//	Decryptor() {
//	}
	public Decryptor(String message, int shift) {
		this.shift = shift;
		this.originalMessage = message.toUpperCase();
		decryptedMessage = decryptPhrase();
		
		
	}

	// methods
	String decryptPhrase() {
		StringBuilder b = new StringBuilder(originalMessage.length());
		String[] words = originalMessage.split(" ");
		for (String word : words) {
			String w = decryptWord(word);
			b.append(w + " ");
		}
		// remove last space
		b.deleteCharAt(b.length() - 1);
		return b.toString();
	}

	String decryptWord(String word) {
		char[] decodedWord = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			decodedWord[i] = decryptCharacter(word.charAt(i));
		}

		return new String(decodedWord);
	}

	char decryptCharacter(char originalChar) {
		int decodedChar = originalChar - shift;
		if (decodedChar < 'A') {
			decodedChar = decodedChar + 26;
			//decodedChar = (decodedChar + 'A') % 26 + 'A';
		}
		return (char) decodedChar;
	}

	// gets/sets
	String getOriginalMessage() {
		return originalMessage;
	}

	void setOriginalMessage(String originalMessage) {
		this.originalMessage = originalMessage;
	}

	int getShift() {
		return shift;
	}

	void setShift(int shift) {
		this.shift = shift;
	}

	public String getDecryptedMessage() {
		return decryptedMessage;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService pool = Executors.newFixedThreadPool(25);
		
		
		
		for (int i = 1; i < 26; i++){
			Future<String> result = pool.submit(new Decryptor("CHUR", i));
			String s = result.get();
			System.out.println(s);
			
		}
		pool.shutdown();
	}

	

}
