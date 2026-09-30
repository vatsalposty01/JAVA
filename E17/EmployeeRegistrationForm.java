package E17;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class EmployeeRegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Employee Registration");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 400);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 15, 15));
        panel.setBorder(new EmptyBorder(25, 25, 25, 25));
        panel.setBackground(new Color(245, 245, 245));

        Font font = new Font("Segoe UI", Font.BOLD, 14);

        JLabel idLabel = new JLabel("Employee ID:");
        idLabel.setFont(font);
        JTextField idField = new JTextField();

        JLabel nameLabel = new JLabel("Employee Name:");
        nameLabel.setFont(font);
        JTextField nameField = new JTextField();

        JLabel deptLabel = new JLabel("Department:");
        deptLabel.setFont(font);
        JTextField deptField = new JTextField();

        JLabel salaryLabel = new JLabel("Salary:");
        salaryLabel.setFont(font);
        JTextField salaryField = new JTextField();

        JButton submitBtn = new JButton("Register");
        submitBtn.setBackground(new Color(40, 167, 69));
        submitBtn.setForeground(Color.WHITE);
        submitBtn.setFont(font);
        submitBtn.setFocusPainted(false);

        panel.add(idLabel);
        panel.add(idField);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(deptLabel);
        panel.add(deptField);
        panel.add(salaryLabel);
        panel.add(salaryField);
        panel.add(new JLabel(""));
        panel.add(submitBtn);

        submitBtn.addActionListener(e -> {
            String msg = "--- Employee Registration Successful ---\n\n" +
                         "Employee ID: " + idField.getText() + "\n" +
                         "Name: " + nameField.getText() + "\n" +
                         "Department: " + deptField.getText() + "\n" +
                         "Salary: " + salaryField.getText();
            JOptionPane.showMessageDialog(frame, msg, "Registration Info", JOptionPane.INFORMATION_MESSAGE);
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}