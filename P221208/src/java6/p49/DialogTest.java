package java6.p49;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogTest extends WindowAdapter implements ActionListener {
	private Frame f;
	private Dialog info;

	public DialogTest() {
		f = new Frame("Parent");
		f.setSize(300, 200);
		info = new Dialog(f, "Information", true);
		info.setSize(140, 90);
		info.setLocation(50, 50);
		info.setLayout(new FlowLayout());

		Label msg = new Label("This is modal Dialog", Label.CENTER);
		Button ok = new Button("OK");

		f.addWindowListener(this);
		ok.addActionListener(this);

		info.add(msg);
		info.add(ok);

		f.setVisible(true);

		info.setVisible(true);

	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		new DialogTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("OK")) {
			info.setVisible(false);
			info.dispose();
		}

	}

}
