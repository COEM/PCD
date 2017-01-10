
import com.sun.glass.ui.Size;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author cacing
 */
public class pcd_filter {
    static Image image = new ImageIcon(pcd_ctrl.getGambar()).getImage();
    //static Image image2 = new ImageIcon(pcd_ctrl.getGambar2()).getImage();
    static Dimension size = new Dimension();
    static int pixel_pic[][] = null;
    static BufferedImage prosesImage, prosesImage2, prosesImage3;
    static Graphics g;
    static pcd_ctrl Gambar;
    static double snr,snr2;
    
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
            }
        }
        return prosesImage;
    }
    
    public static BufferedImage rgb_gs_auto(){
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        prosesImage3 = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);
         for (int x = 0; x < size.width; x++) {
            for (int y = 0; y < size.height; y++) {
                int RGB = prosesImage.getRGB(x, y);
                int alpha = (RGB << 24) & 0xFF;
                int red = (RGB >> 16) >> 0xFF;
                int green = (RGB >> 8) & 0xFF;
                int blue = (RGB >>0) & 0xFF;
                int avg = (red + green + blue) / 3;
                int gray = alpha | avg << 16 | avg << 8 | avg;
                prosesImage.setRGB(x, y, gray);
            }
        }
        return prosesImage;
    }
    
    public static BufferedImage rgb_to_inv(){
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        prosesImage3 = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);
         for (int x = 0; x < size.width; x++) {
            for (int y = 0; y < size.height; y++) {
                int RGB = prosesImage.getRGB(x, y);
                int alpha = (RGB << 24) & 0xFF;
                int red = (RGB >> 16) >> 0xFF;
                int green = (RGB >> 8) & 0xFF;
                int blue = (RGB >>0) & 0xFF;
                int avg = (red + green + blue) / 3;
                int gray = alpha | avg << 16 | avg << 8 | avg;
                int inv = 255 - gray;
                int invpx = alpha | inv << 16 | inv << 8 | inv;
                prosesImage.setRGB(x, y, invpx);
            }
        }
        return prosesImage;
    }
    
    public static BufferedImage rgb_to_bin(){
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);
        for (int x = 0; x < size.width; x++) {
            for (int y = 0; y < size.height; y++) {
                int RGB = prosesImage.getRGB(x, y);
                int alpha = (RGB << 24) & 0xFF;
                int red = (RGB >> 16) >> 0xFF;
                int green = (RGB >> 8) & 0xFF;
                int blue = (RGB >>0) & 0xFF;
                int avg = (red + green + blue) / 3;
                int gray = alpha | avg << 16 | avg << 8 | avg;
                if (avg < 128) {
                    gray = 0;
                } else if(avg > 128) {
                    gray = 255;
                }
                int binergray = gray + (gray << 8) + (gray << 16);
                prosesImage.setRGB(x, y, binergray);
            }
        }
        return prosesImage;
    }
    
    public static BufferedImage rgb_to_inv_log(){
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);
        for (int x = 0; x < size.width; x++) {
                for (int y = 0; y < size.height; y++) {
                    int RGB = prosesImage.getRGB(x, y);
                    int alpha = (RGB << 24) & 0xFF;
                    int red = (RGB >> 16) >> 0xFF;
                    int green = (RGB >> 8) & 0xFF;
                    int blue = (RGB >>0) & 0xFF;
                    int avg = (red + green + blue) / 3;
                    int inv = (int) (pcd_ctrl.getC() * Math.log10(255 - avg + 1));
                    int invpx = alpha | inv << 16 | inv << 8 | inv;
                    prosesImage.setRGB(x, y, invpx);
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
    
    public static BufferedImage noise_reduct(int val){
        size = new Dimension();
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        int Sn = 0; 
        int avg =0;
        int Ss = 0;
        int Sn2 = 0;
        int Ss2=0;
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        prosesImage2 = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        prosesImage3 = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);
        for (int x = 0; x < size.width; x++) {
            for (int y = 0; y < size.height; y++) {
                int RGB = prosesImage.getRGB(x, y);
                int alpha = (RGB << 24) & 0xFF;
                int red = (RGB >> 16) & 0xFF;
                int green = (RGB >> 8) & 0xFF;
                int blue = (RGB >> 0) & 0xFF;
                avg = (red + green + blue) / 3;
                double r = Math.random();
                double p = pcd_ctrl.getNoise();
                int avg2 = (int)(avg+r*256*p);
                if (avg2>256)
                        avg2 = 255;
                int gray = alpha | avg2 << 16 | avg2 << 8 | avg2;
                
                prosesImage2.setRGB(x, y, gray);
                Sn = Sn + Math.abs(avg2-avg);
                Ss = Ss + Math.abs(avg);
            }
        }
        
        snr = 10*Math.log10(Ss/Sn);
        
        for (int v = 1; v <= size.height - (val-1); v++){
            for (int u = 1; u <= size.width -(val-1); u++){
                int sum = 0;
                int temp = 0;
                for (int j = -1; j <= (val-2); j++){
                    for (int i = -1; i <= (val-2); i++){
                        int RGB = prosesImage2.getRGB(u + i, v + j);
                        int alpha =(RGB << 24) & 0xFF;
                        int red = (RGB >> 16) & 0xFF;
                        temp = alpha;
                        sum = sum + red;
                    }    
                }
                int q = (int) Math.round(sum / (val * val));
                int gray2 = temp | q << 16 | q << 8 | q;
                prosesImage3.setRGB(u, v, gray2);
                Sn2 = Sn2 + Math.abs(q - avg);
            }    
        }
        snr2 = 10*Math.log10(Ss/Sn2);
        return prosesImage3;
    }
    
    public static double getSnr(){
        return snr;
    }
    
    public static double getSnr2(){
        return snr2;
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
