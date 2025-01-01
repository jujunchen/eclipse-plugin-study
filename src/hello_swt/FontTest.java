package hello_swt;


import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * 图片控件
 */
public class FontTest extends Shell {

	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		shell.setSize(200, 300);
		shell.open();
		
		//获取内置字体
		Font sysFont = display.getSystemFont();
		Font createdTahomaFont = new Font(display, "Tahoma", 10, SWT.BOLD);
		
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
	
	}

}
