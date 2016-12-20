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
    //static ctrl Gambar
    public static String getGambar() { 
        //method untuk mengambil string lokasi gambar
        return gambar; //memberikan nilai balik dari method getGambar
    }
    
    public static BufferedImage get_noise_reduc() { 
        //method untuk mengambil string lokasi gambar
        return prosesImage;
    }
    
     public static BufferedImage set_noise_reduc(BufferedImage x) { 
        //method untuk mengambil string lokasi gambar
        return prosesImage = x;
    }
     
    public static double getNoise(){
        return noise;
    }
    
    public static double setNoise(double x){
        return noise = x;
    }
    
    public static String setGambar(String x) {
        //method untuk mengatur string lokasi gambar
        return gambar = x; //memberikan nilai balik dari method setGambar
    }
    public void start() {
        if (gambar==null) {
           // 
        } else {
            //Menampilkan gambar di frame lain
            JFrame f=new JFrame("Form Image 2"); //membuat jframe baru
            JLabel l=new JLabel(); //membuat label baru
            l.setSize(400, 400); //mengatur ukuran labael
            
            //memasukkan gambar ke dalam label
            l.setIcon(new ImageIcon(new ImageIcon(getGambar()).getImage().getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH)));
            f.add(l); 
            
            f.setSize(400,400); //mengatur ukutan frame
            f.setVisible(true);  //menampilkan frame lain
            f.setLocationRelativeTo(null);// mengatur posisi agar ke tengah
        }
    }
    
    public void noise_reduc() {
        if (gambar==null) {
           // 
        } else {
            //Menampilkan gambar di frame lain
            JFrame f=new JFrame("Form Image Noise Reduc"); //membuat jframe baru
            JLabel l=new JLabel(); //membuat label baru
            l.setSize(370, 270); //mengatur ukuran labael
            
            //memasukkan gambar ke dalam label
            l.setIcon(new ImageIcon(new ImageIcon(get_noise_reduc()).getImage().getScaledInstance(l.getWidth(), l.getHeight(), Image.SCALE_SMOOTH)));
            f.add(l); 
            
            f.setSize(385,400); //mengatur ukutan frame
            f.setVisible(true);  //menampilkan frame lain
            f.setLocationRelativeTo(null);// mengatur posisi agar ke tengah
        }
    }
}