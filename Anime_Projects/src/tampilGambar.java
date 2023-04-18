package Main;

import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import javax.swing.JFileChooser.*;

class tampilGambar extends JLabel{
	void atur(String tempat, int x, int y){
		try {
			// JFileChooser chooser = new JFileChooser("C:/");
			// Image img = ImageIO.read(chooser.getSelectedFile());
			// Image resizedImage = img.getScaledInstance(gambar.getWidth(), gambar.getHeight(),230);
			// gambar.setIcon(new ImageIcon(resizedImage));

			ImageIcon imageIcon = new ImageIcon(tempat); // load the image to a imageIcon
			Image image = imageIcon.getImage(); // transform it 
			Image newimg = image.getScaledInstance(x, y,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
			imageIcon = new ImageIcon(newimg);  // transform it back
			setIcon(imageIcon);
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
	}
}