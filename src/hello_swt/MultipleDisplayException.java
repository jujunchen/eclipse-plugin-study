package hello_swt;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class MultipleDisplayException extends Shell {

	public static void main(String[] args) {
		Display display = Display.getDefault();
		new Thread(() -> {
			Display disp = Display.getDefault();
			disp.dispose();
		}).start();
	}

}
