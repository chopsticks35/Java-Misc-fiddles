package homework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CaesarCipherDecrypter implements Runnable {
	private String decryptedMessage;
	private String originalMessage;
	private int shift;
	private Thread theThread = null;
//	private static int i;
	
	
	// constructors
//	CaesarCipherDecrypter() {
//	}
	public CaesarCipherDecrypter(String message, int shift) {
		this.shift = shift;
		this.originalMessage = message.toUpperCase();
		decryptedMessage = decryptPhrase();
		theThread = new Thread(this);
		
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

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(25);
		
		for (int i = 1; i < 26; i++){
			pool.execute(new CaesarCipherDecrypter("CHUR", i));
//		CaesarCipherDecrypter decrypt = new CaesarCipherDecrypter("CHUR", i);
//		decrypt.startThread();
		}
	}

	@Override
	public void run() {
		String decryptedMessage = getDecryptedMessage();
		System.out.println(" : " + decryptedMessage);
		
	}
	
	public void startThread(){
		theThread.start();
	}
}
