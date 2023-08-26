import javax.swing.UIManager;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

public class Main {
       public static void main(String[] args) throws Exception {
        // UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
             UIManager.setLookAndFeel(new FlatMacDarkLaf());

        new MyNotepad();

    }
}