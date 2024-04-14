import javax.swing.JFrame;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        JFrame window = WindowInitializer.init("Swing Introduction");
        window.setSize(500, 500);
        window.setVisible(true);
        window.getContentPane().setBackground(Color.CYAN);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
