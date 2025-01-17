package hello_swt;


import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

/**
 * 滚动条
 */
public class ScrolledComposite extends Shell {

	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell(display, SWT.SHELL_TRIM);
		shell.setSize(300, 200);
		shell.setLayout(new FillLayout());
		shell.open();
		
		Image image = new Image(display, "./images/1.png");
		org.eclipse.swt.custom.ScrolledComposite sc = new org.eclipse.swt.custom.ScrolledComposite(shell, SWT.HORIZONTAL | SWT.VERTICAL);
		
		Label label = new Label(sc, SWT.NONE);
		label.setImage(image);
		label.pack();
		
		sc.setContent(label);
		
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
	
	}

}
