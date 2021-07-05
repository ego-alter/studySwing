package actionEvent事件;

import java.awt.event.ActionListener;

import javax.swing.*;

public interface MyCommandListener extends ActionListener {//子接口多给出两个方法
	public void setJTextField(JTextField text);
	public void setJTextArea(JTextArea area);

}
