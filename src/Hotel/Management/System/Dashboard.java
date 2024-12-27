package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    JButton add, rec;

    // Constructor
    Dashboard() {
        // Load the image
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));
        Image i2 = i11.getImage().getScaledInstance(200, 195, Image.SCALE_DEFAULT); // Scale the image
        ImageIcon scaledIcon11 = new ImageIcon(i2); // Convert back to ImageIcon

        // Add the scaled image to a JLabel
        JLabel label1 = new JLabel(scaledIcon11);
        label1.setBounds(850, 300, 200, 195); // Set label bounds
        add(label1);

        // Load the image
        ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icon/Reception.png"));
        Image i22 = i111.getImage().getScaledInstance(200, 195, Image.SCALE_DEFAULT); // Scale the image
        ImageIcon scaledIcon111 = new ImageIcon(i22); // Convert back to ImageIcon

        // Add the scaled image to a JLabel
        JLabel label11 = new JLabel(scaledIcon111);
        label11.setBounds(400, 300, 200, 195); // Set label bounds
        add(label11);

        // Load the image
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard.gif"));
        Image scaledImage = imageIcon.getImage().getScaledInstance(1950, 1090, Image.SCALE_DEFAULT); // Scale the image
        ImageIcon scaledIcon = new ImageIcon(scaledImage); // Convert back to ImageIcon

        // Add the scaled image to a JLabel
        JLabel label = new JLabel(scaledIcon);
        label.setBounds(0, 0, 1950, 1090); // Set label bounds
        add(label);

        // Initialize the "RECEPTION" button
        rec = new JButton("RECEPTION");
        rec.setBounds(425, 510, 140, 30);
        rec.setFont(new Font("Tahoma", Font.BOLD, 15));
        rec.setBackground(new Color(255, 98, 0));
        rec.setForeground(Color.WHITE);
        rec.addActionListener(this);
        label.add(rec); // Add the button to the label, not directly to the frame

        // Initialize the "ADMIN" button
        add = new JButton("ADMIN");
        add.setBounds(880, 510, 140, 30);
        add.setFont(new Font("Tahoma", Font.BOLD, 15));
        add.setBackground(new Color(255, 98, 0));
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        label.add(add); // Add the button to the label, not directly to the frame



        // Set the layout of the JFrame
        setLayout(null);

        // Set the size of the JFrame
        setSize(1950, 1090);

        // Set the title of the JFrame
        setTitle("HOTEL MANAGEMENT SYSTEM");

        // Ensure the application terminates when the window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set visibility of the JFrame
        setVisible(true);
    }

    @Override
    public  void actionPerformed(ActionEvent e) {
        if(e.getSource()==rec){
            new Reception();
            setVisible(false);
        }else {
            new Login2();
            setVisible(false);

        }

    }

    // Main method
    public static void main(String[] args) {
        new Dashboard();
    }
}
