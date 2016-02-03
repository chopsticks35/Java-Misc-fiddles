package homework;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CaeserFrame extends JFrame {
	
	private JTextField messageTextField;
	private JTextField shiftTextField;
	private JTextField resultsTextField;
	
	private JButton encryptbutton;
	private JButton decryptbutton;
	private JButton closebutton;
	
	public CaseserFame() {
		super("CaeserCipher");
		addComponents();
		addEventHandlers();
	}
	

	private void addComponents() {
		messageTextField = new JTextField();
		chiftTextField = new JTextField();
		resultsTextField = new JTextField();
		
	}
	

}
