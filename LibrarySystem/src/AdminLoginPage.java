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

public class AdminLoginPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton clearButton = new JButton("Clear");
	JTextField adminIDField = new JTextField();
	JPasswordField adminPasswordField = new JPasswordField();
	JLabel adminIDLabel = new JLabel("Admin ID: ");
	JLabel adminPasswordLabel = new JLabel("Admin Pass: ");
	JLabel messageLabel = new JLabel();
	
	
	HashMap<String,String> adminlogininfo = new HashMap<String,String>();
	
	AdminLoginPage(HashMap<String,String> adminloginInfoOriginal) {
		
		adminlogininfo = adminloginInfoOriginal;
		
		//admin user and pass text
		adminIDLabel.setBounds(30,100,75,20);
		adminPasswordLabel.setBounds(30,100,75,125);
		
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		// Text field
		adminIDField.setBounds(125,100,200,25);
		adminPasswordField.setBounds(125,150,200,25);
		//2,north south 3,width 4,height
		
		//login button
		loginButton.setBounds(125,200,100,25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		//clear button
		clearButton.setBounds(225,200,100,25);
		clearButton.setFocusable(false);
		clearButton.addActionListener(this);
		
		// Frame
		frame.add(adminIDLabel);
		frame.add(adminPasswordLabel);
		frame.add(messageLabel);
		frame.add(adminIDField);
		frame.add(adminPasswordField);
		frame.add(loginButton);
		frame.add(clearButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==clearButton) {
			adminIDField.setText("");
			adminPasswordField.setText("");
		}
		
		if(e.getSource()==loginButton) {
			
			String adminID = adminIDField.getText();
			String password = String.valueOf(adminPasswordField.getPassword());
			
			if(adminlogininfo.containsKey(adminID)) {
				if(adminlogininfo.get(adminID).equals(password)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login Successful!");
//		        	new WelcomePage();

		        	frame.dispose();
					WelcomePage welcomePage = new WelcomePage(adminID);
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


