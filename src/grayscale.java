
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cacing
 */
public class grayscale {
    static Image image;
    static Dimension size;
    static BufferedImage prosesImage;
    static Graphics g;
    static ctrl Gambar;
    
    public static BufferedImage rgb_to_gs_avg(BufferedImage gs,String pcd_gs){
        image = new ImageIcon(pcd_gs).getImage();
        size = new Dimension();
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        //setPreferredSize(size);  
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);

        for (int x = 0; x < size.width; x++) {
            for (int y = 0; y < size.height; y++) {
                int RGB = prosesImage.getRGB(x, y);
                int alpha = (RGB << 24) & 0xFF;
                int red = (RGB >> 16) & 0xFF;
                int green = (RGB >> 8) & 0xFF;
                int blue = (RGB >>0) & 0xFF;
                int avg = (red + green + blue)/3;
                int gray = alpha | avg << 16 | avg << 8 | avg;
                prosesImage.setRGB(x, y, gray);
                //static_size();
            }
        }
        return gs = prosesImage;
    }
}
