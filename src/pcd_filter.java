
import com.sun.glass.ui.Size;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
//import static pcd_home.prosesImage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cacing
 */
public class pcd_filter {
    static Image image = new ImageIcon(pcd_ctrl.getGambar()).getImage();
    static Dimension size = new Dimension();
    static int pixel_pic[][] = null;
    static BufferedImage prosesImage;
    static Graphics g;
    static pcd_ctrl Gambar;
    
    public static int[][] read_pixel_citra(){
        return pixel_pic ;
    }
    
    public static BufferedImage rgb_to_gs(double rd, double gr, double bl){
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);

        for (int i = 0; i < size.width; i++) {
            for (int j = 0; j < size.height; j++) {
                int RGB = prosesImage.getRGB(i, j);
                int alpha = (RGB << 24) & 0xFF;
                int red = (RGB >> 16) & 0xFF;
                int green = (RGB >> 8) & 0xFF;
                int blue = (RGB >>0) & 0xFF;
                int avg = (int) ((red*rd) + (green * gr) + (blue * bl));
                int gray = alpha | avg << 16 | avg << 8 | avg;
                prosesImage.setRGB(i, j, gray);
                //pixel_pic = 
                //static_size();
            }
        }
        return prosesImage;
    }
    
    public static BufferedImage rgb_to_gs_avg(){
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        g = prosesImage.getGraphics();
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
                //pixel_pic = 
                //static_size();
            }
        }
        return prosesImage;
    }
    
    public static BufferedImage noise_uniform(){
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);
        for (int x = 0; x < size.width; x++) {
            for (int y = 0; y < size.height; y++) {
                int RGB = prosesImage.getRGB(x, y);
                    int alpha = (RGB << 24) & 0xFF;
                    int red = (RGB >> 16) & 0xFF;
                    int green = (RGB >> 8) & 0xFF;
                    int blue = (RGB >> 0) & 0xFF;
                    int avg = (red + green + blue) / 3;
                    double r = Math.random();
                    double p = pcd_ctrl.getNoise();
                    avg = (int) (avg + r * 256 * p);
                    if (avg > 256){
                        avg = 255;
                    }
                    int gray = alpha | avg << 16 | avg << 8 | avg;
                    prosesImage.setRGB(x, y, gray);
                }       
            }
        return prosesImage;
    }
    
    public static BufferedImage noise_salt_papper(){
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);
        for (int x = 0; x < size.width; x++) {
            for (int y = 0; y < size.height; y++) {
                int RGB = prosesImage.getRGB(x, y);
                    int alpha = (RGB << 24) & 0xFF;
                    int red = (RGB >> 16) & 0xFF;
                    int green = (RGB >> 8) & 0xFF;
                    int blue = (RGB >> 0) & 0xFF;
                    int avg = (red + green + blue) / 3;
                    double r = Math.random();
                    double p = pcd_ctrl.getNoise();
                    //avg = (int) (avg + r * 256 * p);
                    if (r < p){
                        avg = 255;
                    }
                    int gray = alpha | avg << 16 | avg << 8 | avg;
                    prosesImage.setRGB(x, y, gray);
                }       
            }
        return prosesImage;
    }
    
    public static BufferedImage noise_speckel(){
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);
        for (int x = 0; x < size.width; x++) {
            for (int y = 0; y < size.height; y++) {
                int RGB = prosesImage.getRGB(x, y);
                int alpha = (RGB << 24) & 0xFF;
                int red = (RGB >> 16) & 0xFF;
                int green = (RGB >> 8) & 0xFF;
                int blue = (RGB >> 0) & 0xFF;
                int avg = (red + green + blue) / 3;
                double r = Math.random();
                double p = pcd_ctrl.getNoise();
                //avg = (int) (avg + r * 256 * p);
                if (r < p){
                    avg = 0;
                }
                int gray = alpha | avg << 16 | avg << 8 | avg;
                prosesImage.setRGB(x, y, gray);
            }       
        }
        return prosesImage;
    }
}
