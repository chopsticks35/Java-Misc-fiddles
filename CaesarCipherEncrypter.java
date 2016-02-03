package encrypt;

import java.util.Scanner;

public class CaesarCipherEncrypter {
	private String encryptedMessage;
	private String originalMessage;
	private int shift;

	// constructors
	CaesarCipherEncrypter() {
	}

	public CaesarCipherEncrypter(String message, int shift) {
		this.shift = shift;
		this.originalMessage = message.toUpperCase();
		encryptedMessage = encryptPhrase();
	}

	// methods
	String encryptPhrase() {
		StringBuilder b = new StringBuilder(originalMessage.length());
		String[] words = originalMessage.split(" ");
		for (String word : words) {
			String w = encryptWord(word);
			b.append(w + " ");
		}
		// remove last space
		b.deleteCharAt(b.length() - 1);
		return b.toString();
	}

	String encryptWord(String word) {
		char[] encodedWord = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			encodedWord[i] = encryptCharacter(word.charAt(i));
		}

		return new String(encodedWord);
	}

	char encryptCharacter(char originalChar) {
		int encodedChar = originalChar + shift;
		if (encodedChar > 'Z') {
			encodedChar = (encodedChar - 26);
			//encodedChar = (encodedChar - 'A') % 26 + 'A';
		}
		return (char) encodedChar;
	}

	// gets/sets
	String getEncryptedMessage() {
		return encryptedMessage;
	}
	
	int getShift() {
		return shift;
	}

	void setShift(int shift) {
		this.shift = shift;
	}

	String getOriginalMessage() {
		return originalMessage;
	}

	void setOriginalMessage(String originalMessage) {
		this.originalMessage = originalMessage;
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a message to encrypt:");
		String message = scanner.nextLine();

		System.out.println("Enter an integer between 0 and 26:");
		int shift = scanner.nextInt();

		scanner.close();

		CaesarCipherEncrypter e = new CaesarCipherEncrypter(message, shift);
		String encryptedMessage = e.getEncryptedMessage();
		System.out.println("E: " + encryptedMessage);
	}

}
