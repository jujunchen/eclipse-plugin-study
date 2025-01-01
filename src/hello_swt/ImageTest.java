package hello_swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

/**
 * 图片控件
 */
public class ImageTest extends Shell {

	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		shell.setSize(723, 925);
		shell.open();
		
		//从路径读取图片
		Image image = new Image(display, "./images/4.png");
		//使用ImageData读取图片,再使用imageData构造Image
		ImageData imageData = new ImageData("./images/5.png");
		image = new Image(display, imageData);
		//手动设置颜色
		PaletteData paletteData = new PaletteData(0xFF, 0xF00, 0xFF0000);
		imageData = new ImageData(48, 48, 24, paletteData);
		for (int x = 0; x < 48; x++) {
			for (int y = 0; y < 48; y++) {
				imageData.setPixel(x, y, 0xFF);
			}
		}
		image = new Image(display, imageData);
		
		//使用内置图片，设置控件的图标
		shell.setImage(display.getSystemImage(SWT.ICON_WORKING));
		
		Label label = new Label(shell, SWT.NONE);
		label.setBounds(0, 0, 723, 925);
		label.setBackgroundImage(image);
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
	
	}

}
