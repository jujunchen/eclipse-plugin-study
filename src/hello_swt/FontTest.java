package hello_swt;


import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

/**
 * 字体
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
		Font createdArialFont = new Font(display, "Arial", 12, SWT.ITALIC);	
		
		Label label = new Label(shell, SWT.NONE);
		label.setBounds(10, 10, 130, 20);
		label.setText("Tahoma, 10, Bold");
		label.setFont(createdTahomaFont);
		
		Label label2 = new Label(shell, SWT.NONE);
		label2.setBounds(10, 40, 130, 20);
		label2.setText("Arial, 12, italic");
		label2.setFont(createdArialFont);
		
		Label label3 = new Label(shell, SWT.NONE);
		label3.setBounds(10, 80, 130, 20);
		label3.setText("System Font");
		label3.setFont(sysFont);
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
	
	}

}
