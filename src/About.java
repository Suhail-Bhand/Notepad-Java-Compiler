import java.awt.Font;
import javax.swing.*;
  
public class About  extends JFrame {
    About(){
        setBounds(100, 100, 800, 400);
        setTitle("About Text Editor");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon image = new ImageIcon("src/s.jpg");
        setIconImage(image.getImage());
        image.setDescription(getName());
        setLayout(null);

        JLabel iconLabel = new JLabel(new ImageIcon(getClass().getResource("s.png")));
        iconLabel.setBounds(100, 80, 80, 80);
        add(iconLabel);
        ///iconLabel.setHorizontalTextPosition(SwingConstants.HORIZONTAL);

        JLabel texLabel = new JLabel( "<html> This program is free \n\n software you can edistribute it or modify it under the terms of the GNU  General Public License as published by the Free Software Foundation; either version 3 of the License, or at your option any later version This program is distributed in the hope that it will be useful,   You should have received a copy of the GNU General Public License along with this program. If not, see httpswww.gnu.orglicenses");
         texLabel.setBounds(230, -230,    550, 700);
         texLabel.setHorizontalAlignment(SwingConstants.HORIZONTAL);
         texLabel.setFont(new Font(Font.SANS_SERIF,Font.ITALIC,14));
         add(texLabel);

         this.setVisible(true);
    }
    public static void main(String args[]){
        new About();
    }
}
