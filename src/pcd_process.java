
import java.awt.image.BufferedImage;

public class pcd_process {
    static pcd_filter gs;
    static ctrl gambar;
    
    public static BufferedImage get_grayscale(){
        return pcd_filter.rgb_to_gs_avg();
    }
}
