import java.awt.Color;
import java.awt.*;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contacts extends JFrame{

    
    Contacts(){

        JLabel imageLabel = new JLabel();
        ImageIcon contactsImage = new ImageIcon("Contacts.png");
        imageLabel.setIcon(contactsImage);
        this.add(imageLabel);

        JButton homeButton = new JButton();
        ImageIcon homeB = new ImageIcon("Back to Home.png");
        homeButton.setIcon(homeB);
        homeButton.setBounds(100, 500, 230, 40 );

        EventHandler handler= new EventHandler();
        homeButton.addActionListener(handler);


        imageLabel.add(homeButton);
       
       this.setLayout(new FlowLayout());
       this.setTitle("My Portfolio");
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setSize(1000,600);
       this.setVisible(true);
       this.setLocationRelativeTo(null);
       this.getContentPane().setBackground(Color.MAGENTA);
       this.setResizable(false);
   }

private class EventHandler implements ActionListener{

    public void actionPerformed(ActionEvent event) {

        //goes to game frame
        new Main();
        dispose();
    
}
}
}