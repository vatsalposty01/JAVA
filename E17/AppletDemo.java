package E17;

import java.lang.*;
import java.applet.Applet;
import java.awt.*;

public class AppletDemo extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, this is my first applet!", 50, 50);
    }

    public static void main(String[] args) {
        Frame frame = new Frame("Applet Demo");
        AppletDemo applet = new AppletDemo();
        frame.add(applet);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}