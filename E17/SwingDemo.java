import javax.swing.*;

public class SwingDemo {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Swing Demo");
        
        JLabel label = new JLabel("Welcome to Swing!", SwingConstants.CENTER);

        frame.add(label);

        frame.setSize(400, 300);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}