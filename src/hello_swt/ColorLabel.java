package hello_swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

/**
 * 控件颜色
 */
public class ColorLabel extends Shell {

	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		shell.setSize(120, 80);
		shell.open();
		
		//自己创建的Color，可以手动释放
		Color createWhiteColor = new Color(display, 255,255,255);
		//从Dispaly中获取，不能手动释放
		Color systemBlackColor = display.getSystemColor(SWT.COLOR_BLACK);
		
		Label label = new Label(shell, SWT.NONE);
		label.setBounds(10, 10, 100, 20);
		
		//背景色
		label.setBackground(systemBlackColor);
		//前景色
		label.setForeground(createWhiteColor);
		
		label.setText("Colored label");
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		createWhiteColor.dispose();
		//不要手动释放，防止其他地方被使用到，造成异常
//		systemBlackColor.dispose();
		display.dispose();
	}

}
