package E17; 

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class StudentRegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 350);
        frame.setLocationRelativeTo(null);

        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 15, 15));
        panel.setBorder(new EmptyBorder(25, 25, 25, 25));
        panel.setBackground(new Color(240, 248, 255));

        Font font = new Font("Arial", Font.BOLD, 14);

        
        JLabel nameLabel = new JLabel("Student Name:");
        nameLabel.setFont(font);
        JTextField nameField = new JTextField();

        JLabel rollLabel = new JLabel("Roll Number:");
        rollLabel.setFont(font);
        JTextField rollField = new JTextField();

        JLabel courseLabel = new JLabel("Course:");
        courseLabel.setFont(font);
        JTextField courseField = new JTextField();

        JButton submitBtn = new JButton("Submit");
        submitBtn.setBackground(new Color(70, 130, 180));
        submitBtn.setForeground(Color.WHITE);
        submitBtn.setFont(font);
        submitBtn.setFocusPainted(false);

        JButton clearBtn = new JButton("Clear");
        clearBtn.setBackground(new Color(220, 53, 69));
        clearBtn.setForeground(Color.WHITE);
        clearBtn.setFont(font);
        clearBtn.setFocusPainted(false);


        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(rollLabel);
        panel.add(rollField);
        panel.add(courseLabel);
        panel.add(courseField);
        panel.add(submitBtn);
        panel.add(clearBtn);


        submitBtn.addActionListener(e -> {
            String msg = "Student Registered Successfully!\n\nName: " + nameField.getText() + 
                         "\nRoll No: " + rollField.getText() + 
                         "\nCourse: " + courseField.getText();
            JOptionPane.showMessageDialog(frame, msg, "Success", JOptionPane.INFORMATION_MESSAGE);
        });

        clearBtn.addActionListener(e -> {
            nameField.setText("");
            rollField.setText("");
            courseField.setText("");
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}