/**
 * @author Cacing
 */
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class pcd_ctrl {
    static String gambar;
    static BufferedImage prosesImage;
    static double noise;
    static int c;
    public static String getGambar() { 
        return gambar;
    }
    
    public static BufferedImage get_noise_reduc() { 
        return prosesImage;
    }
    
     public static BufferedImage set_noise_reduc(BufferedImage x) { 
        return prosesImage = x;
    }
     
    public static int setC(int x){
        return c = x;
    }
    public static int getC(){
        return c;
    } 
     
    public static double getNoise(){
        return noise;
    }
    
    public static double setNoise(double x){
        return noise = x;
    }
    
    public static String setGambar(String x) {
        return gambar = x; 
    }
    public void start() {
        if (gambar==null) {
           // 
        } else {
            JFrame f=new JFrame("Form Image 2"); 
            JLabel l=new JLabel(); 
            l.setSize(400, 400); 
            
            l.setIcon(new ImageIcon(new ImageIcon(getGambar()).getImage().getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH)));
            f.add(l); 
            
            f.setSize(400,400);
            f.setVisible(true);
            f.setLocationRelativeTo(null);
        }
    }
    
    public void noise_reduc() {
        if (gambar==null) {
           // 
        } else {
            JFrame f=new JFrame("Form Image Noise Reduc"); 
            JLabel l=new JLabel(); 
            l.setSize(370, 270); 
            
            l.setIcon(new ImageIcon(new ImageIcon(get_noise_reduc()).getImage().getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH)));
            f.add(l); 
            
            f.setSize(385,400);
            f.setVisible(true);
            f.setLocationRelativeTo(null);
        }
    }
}