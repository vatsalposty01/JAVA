package E18;

import java.lang.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class BankBalanceCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bank Balance Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 15, 15));
        panel.setBorder(new EmptyBorder(20, 25, 20, 25));
        panel.setBackground(new Color(230, 240, 250));

        Font font = new Font("Arial", Font.BOLD, 14);

        JLabel balLabel = new JLabel("Current Balance (₹):");
        balLabel.setFont(font);
        JTextField balField = new JTextField("0.00");

        JLabel transLabel = new JLabel("Transaction Amt (₹):");
        transLabel.setFont(font);
        JTextField transField = new JTextField();

        // Styled Buttons
        JButton depositBtn = new JButton("Deposit");
        depositBtn.setBackground(new Color(30, 144, 255));
        depositBtn.setForeground(Color.WHITE);
        depositBtn.setFont(font);
        depositBtn.setFocusPainted(false);

        JButton withdrawBtn = new JButton("Withdraw");
        withdrawBtn.setBackground(new Color(255, 140, 0));
        withdrawBtn.setForeground(Color.WHITE);
        withdrawBtn.setFont(font);
        withdrawBtn.setFocusPainted(false);

        // Status Label
        JLabel statusLabel = new JLabel("Status: Ready", SwingConstants.RIGHT);
        statusLabel.setForeground(Color.GRAY);

        panel.add(balLabel);
        panel.add(balField);
        panel.add(transLabel);
        panel.add(transField);
        panel.add(depositBtn);
        panel.add(withdrawBtn);
        panel.add(new JLabel(""));
        panel.add(statusLabel);

        depositBtn.addActionListener(e -> {
            try {
                double bal = Double.parseDouble(balField.getText());
                double trans = Double.parseDouble(transField.getText());
                bal += trans;
                
                balField.setText(String.format("%.2f", bal));
                transField.setText(""); 
                statusLabel.setText("Status: Deposited!");
                statusLabel.setForeground(new Color(40, 167, 69));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid amount entered.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });


        withdrawBtn.addActionListener(e -> {
            try {
                double bal = Double.parseDouble(balField.getText());
                double trans = Double.parseDouble(transField.getText());
                
                if (trans > bal) {
                    JOptionPane.showMessageDialog(frame, "Insufficient Balance!", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    bal -= trans;
                    balField.setText(String.format("%.2f", bal));
                    transField.setText("");
                    statusLabel.setText("Status: Withdrawn!");
                    statusLabel.setForeground(new Color(220, 53, 69));
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid amount entered.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}