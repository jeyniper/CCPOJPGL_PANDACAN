import javax.swing.JFrame;
import java.awt.Font;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame{
	
    Main() {

        JLabel label = new JLabel();
        label.setText("Choose System Login: "); 
        label.setFont(new Font("Calibri", Font.BOLD, 25));
        this.add(label);

        // Admin button 
        JButton adminButton = new JButton();
        adminButton.setText("Admin Login");
        adminButton.setFont(new Font("Arial", Font.BOLD, 25));

        
        // Event handler for admin button
        EventHandler handler = new EventHandler();
        adminButton.addActionListener(handler); 
        this.add(adminButton);
        
        // Librarian button
        JButton librarianButton = new JButton();
        librarianButton.setText("Librarian Login");
        librarianButton.setFont(new Font("Calibri", Font.BOLD, 25));
        
        // event handler for librarian button
        EventHandler1 handler1= new EventHandler1();
        librarianButton.addActionListener(handler1);
    
        this.add(adminButton);
        this.add(librarianButton);
        
        // System layout
        this.setLayout(new FlowLayout());
        this.setTitle("Library System Log In");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(null);
        this.setResizable(false);

    
    }
    private class EventHandler implements ActionListener {
        
        public void actionPerformed(ActionEvent event) {
            
        	//goes to admin login
            new AdminLoginPage(null);
            dispose(); //close the frame


}
    }
    private class EventHandler1 implements ActionListener {
    	
        public void actionPerformed(ActionEvent event) {
        	
        	// goes to librarian login
        	new LibrarianLoginPage(null);
            dispose(); //close the frame
        }
    }
    }