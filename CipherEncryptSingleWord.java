package homework;

import java.util.Scanner;

public class CipherEncryptSingleWord {
	private static String encryptThis;
	private static int shiftCount;
	private static char[] wordCharacters;
	private static int i;
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		TakeInputEncrptWordAndPrint();
		
	}
	
	public static void TakeInputEncrptWordAndPrint() {
		System.out.println("Please enter a word to encrypt: (all CAPS and no punctuation)");
		encryptThis = keyboard.next();
		System.out.println("Please enter how many times you want to shift the letters of the word:");
		shiftCount = keyboard.nextInt();
		
		EncryptAndPrintWord();
	}
	
	public static void EncryptAndPrintWord() {
		char wordCharacters [] = new char[encryptThis.length()];

			for (i= 0; i < wordCharacters.length; i++){
		
				wordCharacters[i] = (char)((encryptThis.charAt(i)) + shiftCount);

				if (wordCharacters[i] >= 90){ 
					wordCharacters[i] =(char)((wordCharacters[i] - 26));
				}
				System.out.print(wordCharacters[i]);
		}
	}		
	
}

