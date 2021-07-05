package actionEvent事件;

import java.awt.event.*;
import javax.swing.*;

public class PoliceListen implements MyCommandListener {
	JTextField textInput;
	JTextArea textShow;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = textInput.getText();
		textShow.append(str+"的长度:"+str.length()+"\n");

	}

	@Override
	public void setJTextField(JTextField text) {
		textInput=text;

	}

	@Override
	public void setJTextArea(JTextArea area) {
		textShow=area;

	}

}
