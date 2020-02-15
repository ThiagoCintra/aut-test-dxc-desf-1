package basic.mercury.utils.screenshot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.imageio.ImageIO;

public class TakeScreenshot {

	private static TakeScreenshot instance;
	private static ArrayList<BufferedImage> bufferImageList = new ArrayList<BufferedImage>();
	private static LinkedHashMap<String,BufferedImage> bufferImageMap = new LinkedHashMap<>();

	public  LinkedHashMap<String, BufferedImage> getBufferImageMap() {
		return bufferImageMap;
	}

	public  void setBufferImageMap(LinkedHashMap<String, BufferedImage> bufferImageMap) {
		TakeScreenshot.bufferImageMap = bufferImageMap;
	}

	public static synchronized TakeScreenshot getInstance() {
		if (instance == null) {
			instance = new TakeScreenshot();
		}
		return instance;
	}

	public ArrayList<BufferedImage> getBufferImageList() {
		return bufferImageList;
	}

	public void setBufferImageList(ArrayList<BufferedImage> bufferImageList) {
		this.bufferImageList = bufferImageList;
	}

//	public  void takeScreenShot() throws IOException {
//		Robot r;
//		try {
//			r = new Robot();
//			Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
//			BufferedImage image = r.createScreenCapture(capture);
//			bufferImageList.add(image);
//			
//		} catch (AWTException e) {
//			e.printStackTrace();
//		}
//
//	}
	
	public  void takeScreenShot(String txt) throws IOException {
		Robot r;
		try {
			r = new Robot();
			Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage image = r.createScreenCapture(capture);
			bufferImageMap.put(txt, image);
			
		} catch (AWTException e) {
			e.printStackTrace();
		}

	}
}
