import javax.swing.JFrame;
import java.awt.Font;
import java.awt.*;
import javax.swing.JLabel;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    Main() {

        JLabel label = new JLabel();
        label.setText(" Welcome To My Portfolio! ");
        label.setFont(new Font("Arial", Font.BOLD, 25));
        this.add(label);

        // about me button
        JButton aboutmeButton = new JButton();
        aboutmeButton.setText("About Me");
        aboutmeButton.setFont(new Font("Calibri", Font.BOLD, 25));

        // Event handler for about me button
        EventHandler handler = new EventHandler();
        aboutmeButton.addActionListener(handler);
        this.add(aboutmeButton);

        // hobbies button
        JButton hobbiesButton = new JButton();
        hobbiesButton.setText("Hobbies");
        hobbiesButton.setFont(new Font("Calibri", Font.BOLD, 25));

        // event handler for hobbies button
        EventHandler1 handler1 = new EventHandler1();
        hobbiesButton.addActionListener(handler1);
        this.add(hobbiesButton);

        // works button
        JButton worksButton = new JButton();
        worksButton.setText("My Works");
        worksButton.setFont(new Font("Calibri", Font.BOLD, 25));

        // event handler for works button
        EventHandler2 handler2 = new EventHandler2();
        worksButton.addActionListener(handler2);
        this.add(worksButton);

        // contacts button
        JButton contactsButton = new JButton();
        contactsButton.setText("Contacts");
        contactsButton.setFont(new Font("Calibri", Font.BOLD, 25));

        // event handler for contacts button
        EventHandler3 handler3 = new EventHandler3();
        contactsButton.addActionListener(handler3);
        this.add(contactsButton);

        this.add(aboutmeButton);
        this.add(hobbiesButton);
        this.add(worksButton);
        this.add(contactsButton);

        // System layout
        this.setLayout(new FlowLayout());
        this.setTitle("Portfolio");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(null);
        this.setResizable(false);

    }

    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            // goes to about me frame
            new AboutMe();
            dispose(); // close the frame

        }
    }

    private class EventHandler1 implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            // goes to hobbies frame
            new Hobbies();
            dispose(); // close the frame
        }
    }

    private class EventHandler2 implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            // goes to works frame
            new Works();
            dispose(); // close the frame
        }
    }

    private class EventHandler3 implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            // goes to contacts frame
            new Contacts();
            dispose(); // close the frame
        }
    }
}
