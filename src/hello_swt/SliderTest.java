package hello_swt;


import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Text;

/**
 * 滑动条Slider
 * win 11 不显示这个控件？
 */
public class SliderTest extends Shell {

	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell(display, SWT.SHELL_TRIM);
		shell.setSize(300, 200);
		shell.open();
		
		Slider slider = new Slider(shell, SWT.HORIZONTAL);
		slider.setSelection(0);
		
		final Text text = new Text(shell, SWT.BORDER);
		text.setText("0");
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		
		slider.addSelectionListener(new SelectionAdapter() {
		
			public void widgetSelected(SelectionEvent e) {
				Slider slider = (Slider) e.widget;
				text.setText(String.valueOf(slider.getSelection()));
			}
		});
		
		shell.layout();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
	}

}
