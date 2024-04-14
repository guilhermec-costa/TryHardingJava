import javax.swing.JFrame;

public class WindowInitializer {
    
    public static JFrame init() {
        return new JFrame();
    }
    
    public static JFrame init(String title) {
        return new JFrame(title);
    }

}
