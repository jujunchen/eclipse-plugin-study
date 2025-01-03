package hello_swt;


import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.graphics.Region;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * 构造不规则窗口
 */
public class RegionTest extends Shell {

	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell(display, SWT.NO_TRIM);
		
		Region region = new Region(display);
		//绘制4个长方形
		region.add(new Rectangle(10, 10, 10, 100));
		region.add(new Rectangle(10, 100, 100, 10));
		region.add(new Rectangle(10, 10, 100, 10));
		region.add(new Rectangle(100, 10, 10, 100));
		
		shell.setRegion(region);
		//设置背景颜色，红色
		Color color = new Color(null, 255, 0, 0);
		shell.setBackground(color);
		
		shell.open();
		
		//由于这个窗口没有关闭按钮，添加一个监听关闭的事件
		shell.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent e) {
				shell.close();
			}
			
		});
		
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
	
	}

}
