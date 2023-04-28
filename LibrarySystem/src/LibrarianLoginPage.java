import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class LibrarianLoginPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton clearButton = new JButton("Clear");
	JTextField librarianIDField = new JTextField();
	JPasswordField librarianPasswordField = new JPasswordField();
	JLabel librarianIDLabel = new JLabel("Librarian ID: ");
	JLabel librarianPasswordLabel = new JLabel("Librarian Pass: ");
	JLabel messageLabel = new JLabel();
	
	
	HashMap<String,String> librarianlogininfo = new HashMap<String,String>();
	
	LibrarianLoginPage(HashMap<String,String> librarianloginInfoOriginal) {
        
		
		librarianlogininfo = librarianloginInfoOriginal;
		
		//lib user and pass text
		librarianIDLabel.setBounds(30,100,75,20);
		librarianPasswordLabel.setBounds(30,100,75,125);
		
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		librarianIDField.setBounds(125,100,200,25);
		librarianPasswordField.setBounds(125,150,200,25);
		//2,north south 3,width 4,height
		
		//login button
		loginButton.setBounds(125,200,100,25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		//clear button
		clearButton.setBounds(225,200,100,25);
		clearButton.setFocusable(false);
		clearButton.addActionListener(this);
	
		// frame 
		frame.add(librarianIDLabel);
		frame.add(librarianPasswordLabel);
		frame.add(messageLabel);
		frame.add(librarianIDField);
		frame.add(librarianPasswordField);
		frame.add(loginButton);
		frame.add(clearButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 
		//clear button 
		if(e.getSource()==clearButton) {
			librarianIDField.setText("");
			librarianPasswordField.setText("");
		}
		
		// login button / not working so far
		if(e.getSource()==loginButton) {
			
			String librarianID = librarianIDField.getText();
			String password = String.valueOf(librarianPasswordField.getPassword());
			
		if(librarianlogininfo.containsKey(librarianID)) {
				if(librarianlogininfo.get(librarianID).equals(password)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login Successful!");
//		        	new WelcomePage();

		        	frame.dispose();
					WelcomePage welcomePage = new WelcomePage(librarianID);
	}
		else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Wrong Password");
			}
		
		
	}
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("User Not Found");
				
	      }
		}
	}
}
	



