package fonts;

import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ExternalFonts {

    public static Font getJetBrainsFont(float fontSize) {
        try {
            return FontUIResource.createFont(Font.TRUETYPE_FONT,
                    new File("src/fonts/JetBrainsMono.ttf")).deriveFont(fontSize);
        }

        catch (FontFormatException e) {}
        catch (IOException e) {}

        return null;
    }
}
