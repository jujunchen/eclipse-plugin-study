package hello_swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * 控件用户数据
 * 在Text 中存储了文章内容，通过getData读取内容
 */
public class TextData extends Shell {

	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		shell.setSize(260, 283);
		shell.open();
		
		Text text = new Text(shell, SWT.NONE);
		text.setText("文章内容");
		text.setData("Version", "1.2");
		text.setData("作者", "阿提说说");
		//没有key的
		text.setData("备注");
		text.setBounds(10, 8, 230, 35);
		
		//可以根据key读出来使用
		Label benefitLabel = new Label(shell, SWT.NONE);
		benefitLabel.setBounds(10, 49, 90, 15);
		benefitLabel.setText((String) text.getData("作者"));
		
		Label benefitLabel2 = new Label(shell, SWT.NONE);
		benefitLabel2.setBounds(10, 69, 90, 15);
		benefitLabel2.setText((String) text.getData());
		
		
		shell.layout();
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

}
