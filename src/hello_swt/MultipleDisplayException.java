package hello_swt;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * 多线程访问同一个Display实例，异常
 * 一个Display实例，只能被一个线程访问
 */
public class MultipleDisplayException extends Shell {

	public static void main(String[] args) {
		Display display = Display.getDefault();
		new Thread(() -> {
			Display disp = Display.getDefault();
			disp.dispose();
		}).start();
	}

}
