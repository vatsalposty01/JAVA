package E18;

import javax.swing.*;
import java.awt.*;

public class ButtonEventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Event Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(245, 245, 245));

        JPanel innerPanel = new JPanel();
        innerPanel.setLayout(new GridLayout(2, 1, 10, 20));
        innerPanel.setOpaque(false); 

        JLabel label = new JLabel("Waiting for click...", SwingConstants.CENTER);
        label.setFont(new Font("Segoe UI", Font.ITALIC, 16));
        label.setForeground(Color.DARK_GRAY);

        JButton button = new JButton("Click Me");
        button.setFont(new Font("Segoe UI", Font.BOLD, 16));
        button.setBackground(new Color(70, 130, 180)); // Steel Blue
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setPreferredSize(new Dimension(150, 40));

        button.addActionListener(e -> {
            label.setText("Button Clicked!");
            label.setForeground(new Color(40, 167, 69));
            label.setFont(new Font("Segoe UI", Font.BOLD, 18));
        });

        innerPanel.add(button);
        innerPanel.add(label);
        panel.add(innerPanel);
        
        frame.add(panel);
        frame.setVisible(true);
    }
}