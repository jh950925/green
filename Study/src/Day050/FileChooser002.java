package Day050;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class FileChooser002 {
	public static void main(String[] args) {
		
		//1. ImageIO
		try {
			File file = new File("D:/myimg001.jpg");
			BufferedImage bi = ImageIO.read(file); //read는 읽어오기
			File output = new File("D:/myimg002.jpg");
			ImageIO.write(bi, "jpg", output); //write 가져오기
		}catch(Exception e) { e.printStackTrace(); }
		
		
	}
}
