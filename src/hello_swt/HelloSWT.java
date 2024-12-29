package hello_swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class HelloSWT extends Shell {

	public static void main(String[] args) {
		Display display = Display.getDefault();
		final Shell shell = new Shell(display);
		shell.setSize(260, 283);
		shell.open();

		Text text = new Text(shell, SWT.BORDER);
		text.setText("SWT是Eclipse平台使用的图形工具箱");
		text.setBounds(10, 8, 230, 35);

		List list = new List(shell, SWT.BORDER);
		list.setItems(new String[] { "使用操作系统本地控件", "提供一套平台无关的API", "GUI程序的运行速度快", "更多更多......" });
		list.setBounds(10, 68, 232, 82);

		Label benefitLabel = new Label(shell, SWT.NONE);
		benefitLabel.setText("SWT优点：");
		benefitLabel.setBounds(10, 49, 90, 15);
		
		Group  group = new Group(shell, SWT.NONE);
		group.setText("你使用过哪些图形工具");
		group.setBounds(10, 159, 230, 47);
		
		Button awtButton = new Button(group, SWT.CHECK);
		awtButton.setText("AWT");
		awtButton.setBounds(10, 22, 54, 18);
		
		Button swingButton = new Button(group, SWT.CHECK);
		swingButton.setText("Swing");
		swingButton.setBounds(70, 22, 60, 15);
		
		Button swtButton = new Button(group, SWT.CHECK);
		swtButton.setBounds(136, 22, 62, 15);
		swtButton.setText("SWT");
		
		Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				MessageBox msgBox = new MessageBox(shell, SWT.ICON_INFORMATION);
				msgBox.setMessage("Hello SWT");
				msgBox.open();
			}
			
		});
		
		button.setText("按一下按钮，向SWT说Hello");
		button.setBounds(10, 214, 227, 25);
		shell.layout();
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

}
