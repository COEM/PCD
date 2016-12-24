
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class pcd_process {
    public static BufferedImage get_grayscale(){
        return pcd_filter.rgb_to_gs_avg();
    }
    
    public static BufferedImage get_noise_uniform(){
        return pcd_filter.noise_uniform();
    }
    
    public static BufferedImage get_noise_salt_pepper(){
        return pcd_filter.noise_salt_papper();
    }
    
    public static BufferedImage get_noise_speckel(){
        return pcd_filter.noise_speckel();
    }
    
    public static BufferedImage get_gs_auto(){
        return pcd_filter.rgb_gs_auto();
    }
    
    public static BufferedImage get_inv(){
        return pcd_filter.rgb_to_inv();
    }
    public static BufferedImage get_gs(double a,double b,double c){
        return pcd_filter.rgb_to_gs(a, b, c);
    }
    public static void saveImg_png(BufferedImage x, String name){
        try {
            ImageIO.write(x, "png", new File(name));
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public static void saveImg_jpg(BufferedImage x, String name){
        try {
            ImageIO.write(x, "jpg", new File(name));
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
