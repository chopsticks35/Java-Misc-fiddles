package homework;

public class CaeserCipher {
	private static String encryptThis;
	private static String decryptThis;
	private static int shiftCount;
	private static int i;
	
	public static void main(String[] args) {
		String encryptThis = "ZERO";
		int shiftCount = 3;
		//System.out.println(encryptThis.equals(CaeserCipher.encryptWords(encryptThis, shiftCount)));
	
		
	}
	public static String encryptWords(String encryptThis, int shiftCount) {
		encryptThis = encryptThis.toUpperCase();
	
		String encryptedMessage = "";
		
		if (shiftCount < 0 || shiftCount > 24){
			shiftCount = 1;
		}

		for (i= 0; i < encryptThis.length(); i++){
			if (encryptThis.charAt(i) == 32){
					encryptedMessage += " ";
				}
				
			else if ((encryptThis.charAt(i) + shiftCount) > 90){
				encryptedMessage += (char) ((64 - (90 - encryptThis.charAt(i))) + shiftCount);
			}
			else {
				encryptedMessage += (char) (encryptThis.charAt(i) + shiftCount);
			}
		}
		return encryptedMessage;
	}	
	
	public static String decryptThis(String encryptThis, int shiftCount){
		decryptThis = decryptThis.toUpperCase();
		String decryptedMessage = "";
		if (shiftCount < 0 || shiftCount> 24){
			shiftCount = 1;
		}
		for (i= 0; i < decryptThis.length(); i++){
			if (decryptThis.charAt(i) == 32){
					decryptedMessage += " ";
				}
				
			else if ((decryptThis.charAt(i) + shiftCount) < 65){
				decryptedMessage += (char) ((91 + (encryptThis.charAt(i)) - 65) - shiftCount);
			}
			else {
				decryptedMessage += (char) (encryptThis.charAt(i) - shiftCount);
			}
		}
		return decryptedMessage;
	}
	
}

