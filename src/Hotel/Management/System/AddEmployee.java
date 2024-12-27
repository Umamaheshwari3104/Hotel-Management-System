package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEmployee extends JFrame implements ActionListener {

    JTextField nameText, ageText, salaryText, phoneText, aadharText, emailText;
    JRadioButton radioButtonM, radioButtonF;
    JComboBox<String> comboBox;
    JButton add, back;

    AddEmployee() {
        // Panel configuration
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 890, 498);
        panel.setLayout(null);
        panel.setBackground(new Color(118, 62, 145, 224));
        add(panel);

        // Name label and text field
        JLabel name = new JLabel("NAME");
        name.setBounds(60, 30, 150, 27);
        name.setFont(new Font("serif", Font.BOLD, 17));
        name.setForeground(Color.WHITE);
        panel.add(name);

        nameText = new JTextField();
        nameText.setBounds(200, 30, 150, 27);
        nameText.setBackground(new Color(118, 62, 145, 224));
        nameText.setFont(new Font("Tahoma", Font.BOLD, 14));
        nameText.setForeground(Color.WHITE);
        panel.add(nameText);

        // Age label and text field
        JLabel age = new JLabel("AGE");
        age.setBounds(60, 80, 150, 27);
        age.setFont(new Font("serif", Font.BOLD, 17));
        age.setForeground(Color.WHITE);
        panel.add(age);

        ageText = new JTextField();
        ageText.setBounds(200, 80, 150, 27);
        ageText.setBackground(new Color(118, 62, 145, 224));
        ageText.setFont(new Font("Tahoma", Font.BOLD, 14));
        ageText.setForeground(Color.WHITE);
        panel.add(ageText);

        // Gender label and radio buttons
        JLabel gender = new JLabel("GENDER");
        gender.setBounds(60, 130, 150, 27);
        gender.setFont(new Font("serif", Font.BOLD, 17));
        gender.setForeground(Color.WHITE);
        panel.add(gender);

        radioButtonM = new JRadioButton("MALE");
        radioButtonM.setBounds(200, 130, 70, 27);
        radioButtonM.setBackground(new Color(118, 62, 145, 224));
        radioButtonM.setFont(new Font("Tahoma", Font.BOLD, 14));
        radioButtonM.setForeground(Color.WHITE);
        panel.add(radioButtonM);

        radioButtonF = new JRadioButton("FEMALE");
        radioButtonF.setBounds(280, 130, 90, 27);
        radioButtonF.setBackground(new Color(118, 62, 145, 224));
        radioButtonF.setFont(new Font("Tahoma", Font.BOLD, 14));
        radioButtonF.setForeground(Color.WHITE);
        panel.add(radioButtonF);

        // Grouping radio buttons
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(radioButtonM);
        genderGroup.add(radioButtonF);

        // Job label and combo box
        JLabel job = new JLabel("JOB");
        job.setBounds(60, 170, 150, 27);
        job.setFont(new Font("serif", Font.BOLD, 17));
        job.setForeground(Color.WHITE);
        panel.add(job);

        comboBox = new JComboBox<>(new String[]{"Front Desk", "HouseKeeping", "Kitchen Staff", "Room Service", "Manager", "Accountant", "Chef"});
        comboBox.setBackground(new Color(118, 62, 145, 224));
        comboBox.setBounds(200, 170, 150, 30);
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
        comboBox.setForeground(Color.WHITE);
        panel.add(comboBox);

        // Salary label and text field
        JLabel salary = new JLabel("SALARY");
        salary.setBounds(60, 220, 150, 27);
        salary.setFont(new Font("serif", Font.BOLD, 17));
        salary.setForeground(Color.WHITE);
        panel.add(salary);

        salaryText = new JTextField();
        salaryText.setBounds(200, 220, 150, 27);
        salaryText.setBackground(new Color(118, 62, 145, 224));
        salaryText.setFont(new Font("Tahoma", Font.BOLD, 14));
        salaryText.setForeground(Color.WHITE);
        panel.add(salaryText);

        // Phone label and text field
        JLabel phone = new JLabel("PHONE");
        phone.setBounds(60, 270, 150, 27);
        phone.setFont(new Font("serif", Font.BOLD, 17));
        phone.setForeground(Color.WHITE);
        panel.add(phone);

        phoneText = new JTextField();
        phoneText.setBounds(200, 270, 150, 27);
        phoneText.setBackground(new Color(118, 62, 145, 224));
        phoneText.setFont(new Font("Tahoma", Font.BOLD, 14));
        phoneText.setForeground(Color.WHITE);
        panel.add(phoneText);

        // Aadhar label and text field
        JLabel aadhar = new JLabel("AADHAR");
        aadhar.setBounds(60, 320, 150, 27);
        aadhar.setFont(new Font("serif", Font.BOLD, 17));
        aadhar.setForeground(Color.WHITE);
        panel.add(aadhar);

        aadharText = new JTextField();
        aadharText.setBounds(200, 320, 150, 27);
        aadharText.setBackground(new Color(118, 62, 145, 224));
        aadharText.setFont(new Font("Tahoma", Font.BOLD, 14));
        aadharText.setForeground(Color.WHITE);
        panel.add(aadharText);

        // Email label and text field
        JLabel email = new JLabel("EMAIL");
        email.setBounds(60, 370, 150, 27);
        email.setFont(new Font("serif", Font.BOLD, 17));
        email.setForeground(Color.WHITE);
        panel.add(email);

        emailText = new JTextField();
        emailText.setBounds(200, 370, 150, 27);
        emailText.setBackground(new Color(118, 62, 145, 224));
        emailText.setFont(new Font("Tahoma", Font.BOLD, 14));
        emailText.setForeground(Color.WHITE);
        panel.add(emailText);

        // Add button
        add = new JButton("ADD");
        add.setBounds(80, 420, 100, 30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        // Back button
        back = new JButton("BACK");
        back.setBounds(200, 420, 100, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        // Adding an image to the panel
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/addemp.png"));
        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(image);
        JLabel label = new JLabel(scaledIcon);
        label.setBounds(500, 100, 300, 300);
        panel.add(label);

        // JFrame settings
        setUndecorated(true);
        setTitle("Add Employee");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(60, 160);
        setLayout(null);
        setSize(900, 500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            // Getting input values
            String name = nameText.getText();
            String age = ageText.getText();
            String salary = salaryText.getText();
            String phone = phoneText.getText();
            String email = emailText.getText();
            String aadhar = aadharText.getText();
            String job = (String) comboBox.getSelectedItem();
            String gender = null;

            if (radioButtonM.isSelected()) {
                gender = "Male";
            } else if (radioButtonF.isSelected()) {
                gender = "Female";
            }

            // Input validation
            if (name.isEmpty() || age.isEmpty() || salary.isEmpty() || phone.isEmpty() || email.isEmpty() || aadhar.isEmpty() || gender == null || job == null) {
                JOptionPane.showMessageDialog(null, "All fields are required");
                return;
            }

            try {
                // Database connection
                Con c = new Con();
                String query = "INSERT INTO employee VALUES('" + name + "', '" + age + "', '" + gender + "', '" + job + "', '" + salary + "', '" + phone + "', '" + email + "', '" + aadhar + "')";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Employee Added Successfully");
                setVisible(false);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}
