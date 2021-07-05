package FocusEvent事件_KeyEvent事件;

import java.awt.event.*;

import javax.swing.*;

public class Police implements KeyListener, FocusListener {

	@Override
	public void focusGained(FocusEvent e) {
		JTextField t = (JTextField)e.getSource();
		t.setText(null);

	}

	@Override
	public void focusLost(FocusEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		JTextField t = (JTextField)e.getSource();
		if(t.getCaretPosition() >= 6) {
			t.transferFocus();
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {}

}
