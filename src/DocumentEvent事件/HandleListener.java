package DocumentEvent事件;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class HandleListener implements ActionListener {
	JTextArea inputText,showText;
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		switch(str) {
			case"copy":showText.copy();break;
			case"cut":showText.cut();break;
			case"paste":inputText.paste();break;
		}

	}

	public void setShowText(JTextArea text) {
		inputText = text;
		
	}

	public void setInputText(JTextArea text) {
		showText = text;
		
	}

}
