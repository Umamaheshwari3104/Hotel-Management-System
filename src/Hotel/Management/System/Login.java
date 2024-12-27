package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JTextField textField1;
    JPasswordField passwordField;
    JButton loginButton, cancelButton; // Added buttons as class members

    // Constructor
    Login() {
        // Add a label for "Username"
        JLabel label1 = new JLabel("Username");
        label1.setBounds(40, 20, 100, 30); // Set position and size
        label1.setFont(new Font("Tahoma", Font.BOLD, 16));
        label1.setForeground(Color.WHITE);
        add(label1);

        // Add a label for "Password"
        JLabel label2 = new JLabel("Password");
        label2.setBounds(40, 70, 100, 30); // Set position and size
        label2.setFont(new Font("Tahoma", Font.BOLD, 16));
        label2.setForeground(Color.WHITE);
        add(label2);

        // Add a text field for "Username"
        textField1 = new JTextField();
        textField1.setBounds(150, 20, 150, 30); // Set position and size
        textField1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(textField1);

        // Add a password field for "Password"
        passwordField = new JPasswordField();
        passwordField.setBounds(150, 70, 150, 30); // Set position and size
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(passwordField);

        // Add a login button
        loginButton = new JButton("Login");
        loginButton.setBounds(40, 150, 120, 30);
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);
        loginButton.addActionListener(this); // Register action listener
        add(loginButton);

        // Add a cancel button
        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(180, 150, 120, 30);
        cancelButton.setBackground(Color.BLACK);
        cancelButton.setForeground(Color.WHITE);
        cancelButton.addActionListener(this); // Register action listener
        add(cancelButton);

        // Add an image to the frame
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(315, -30, 255, 300);
        add(imageLabel);

        // Set the background color of the JFrame
        getContentPane().setBackground(new Color(118, 62, 145, 224));

        // JFrame setup
        setLayout(null);
        setLocation(400, 270);
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) { // Check for login button click
            try {
                Con c = new Con();
                String user = textField1.getText();
                String pass = new String(passwordField.getPassword()); // Use getPassword for JPasswordField

                String q = "SELECT * FROM login WHERE username = '" + user + "' AND password = '" + pass + "'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()) {
                    new Dashboard();
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    setVisible(false);
                    // Proceed to the next screen or operation
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == cancelButton) { // Check for cancel button click
            System.exit(102);
        }
    }

    // Main method
    public static void main(String[] args) {
        new Login(); // Create and display the JFrame
    }
}
