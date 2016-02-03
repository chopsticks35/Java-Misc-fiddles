package homework;

import java.util.Scanner;

public class CipherDecryptSingleWord {
	private static String decryptThis;
	private static int shiftCount;
	private static char[] wordCharacters;
	private static int i;
	static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		TakeInputDecryptWordAndPrint();
		
	}
	
	public static void TakeInputDecryptWordAndPrint() {
		System.out.println("Please enter a word to decrypt: (all CAPS and no punctuation)");
		decryptThis = keyboard.next();
		System.out.println("Please enter how many times you want to shift the letters of the word:");
		shiftCount = keyboard.nextInt();
		
		DecryptAndPrintWord();
	}
	
	public static void DecryptAndPrintWord() {
		char wordCharacters [] = new char[decryptThis.length()];

			for (i= 0; i < wordCharacters.length; i++){
		
				wordCharacters[i] = (char)((decryptThis.charAt(i)) - shiftCount);

				if ((wordCharacters[i] - shiftCount) < 65){ 
					wordCharacters[i] =(char)(91 + ((wordCharacters[i] - 65) - shiftCount));
				}
				System.out.print(wordCharacters[i]);
		}
	}		
	
}

