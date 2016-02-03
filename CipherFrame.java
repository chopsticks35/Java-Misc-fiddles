package homework;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import examples.Notepad8;

public class CipherFrame extends JFrame {
	private JButton closeButton;
	private JButton encryptButton;
	private JButton decryptButton;
	private JLabel label;
	private JTextField textField;
	
	public CipherFrame() {
        super("Caeser Cipher");
        addComponents();
        addEventHandlers();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setVisible(true);
    }
	
	 private void addComponents(){
		 closeButton = new JButton("Close");
		 encryptButton = new JButton("Encrypt");
		 encryptButton = new JButton("Decrypt");
		 label = new JLabel("Word");
	     textField = new JTextField("<Enter word here>");
		 
		 this.add(closeButton);
		 this.add(label);
		 this.add(textField);
		 this.add(encryptButton);
		 //this.add(decryptButton);
		 
	 }
	 
	 private void addEventHandlers() {
	        class CloseListener implements ActionListener {
	            public void actionPerformed(ActionEvent e) {
	                dispose();
	            }
	        }
	        ActionListener closeListener = new CloseListener();
	        closeButton.addActionListener(closeListener);
	        
	        class EncryptListener implements ActionListener {
	            public void actionPerformed(ActionEvent e) {
	            	try{
	                	FileReader fileIn = new FileReader(textField.getText());
	                	char[] readBuffer = new char[(int)textField.getText().length()];
	                	fileIn.read(readBuffer);
	                	encryptThis(textField.getText(), 2);
	                	
	                }
	                catch (IOException ioe){
	                	System.err.println("read error");	
	                }
	            }
	        }
	        ActionListener EncryptWord = new EncryptListener();
	        
	        
	        public String encryptThis(String inputWord, int shiftCount){
	        	inputWord = textField.getText().toUpperCase();
	        	String encryptedPhrase = "";
	        	if (shiftCount < 0 || shiftCount > 24){
	        		shiftCount = 1;
	        	}
	        	for (int i = 0; i < inputWord.length(); i++){
	        		if inputWord.charAt(i) == 32) {
	        			encryptedPhrase
	        		}
	        	}
	        		
	        	}
	        	
	        }
	        	
	        
	        
	 
	
	public static void main(String[] args) {
		new CipherFrame();
	}

}
