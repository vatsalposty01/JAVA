package E18;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 15));
        panel.setBorder(new EmptyBorder(20, 20, 20, 20));
        panel.setBackground(new Color(250, 240, 230)); 

        Font font = new Font("SansSerif", Font.BOLD, 14);


        JLabel num1Label = new JLabel("Number 1:");
        num1Label.setFont(font);
        JTextField num1Field = new JTextField();

        JLabel num2Label = new JLabel("Number 2:");
        num2Label.setFont(font);
        JTextField num2Field = new JTextField();

        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        resultLabel.setForeground(new Color(0, 102, 204));


        JButton addBtn = new JButton("Add (+)");
        addBtn.setBackground(new Color(40, 167, 69)); 
        addBtn.setForeground(Color.WHITE);
        addBtn.setFocusPainted(false);

        JButton subBtn = new JButton("Subtract (-)");
        subBtn.setBackground(new Color(220, 53, 69));
        subBtn.setForeground(Color.WHITE);
        subBtn.setFocusPainted(false);


        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(addBtn);
        panel.add(subBtn);
        panel.add(new JLabel(""));
        panel.add(resultLabel);


        addBtn.addActionListener(e -> {
            try {
                double n1 = Double.parseDouble(num1Field.getText());
                double n2 = Double.parseDouble(num2Field.getText());
                resultLabel.setText("Result: " + (n1 + n2));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        subBtn.addActionListener(e -> {
            try {
                double n1 = Double.parseDouble(num1Field.getText());
                double n2 = Double.parseDouble(num2Field.getText());
                resultLabel.setText("Result: " + (n1 - n2));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}