package actionEvent事件;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class WindowActionEvent extends JFrame {
	JTextField inputText;
	JTextArea textShow;
	JButton button;
	MyCommandListener listener;//listener是监视器
	public WindowActionEvent() {
/*		setLayout(new FlowLayout());
		text = new JTextField(10);
		add(text);
		listener = new ReaderListen();//创建监视器
		text.addActionListener(listener);//text将listener注册为自己的监视器
*/
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void init() {
		setLayout(new FlowLayout());
		inputText = new JTextField(10);
		button = new JButton("确定");
		textShow = new JTextArea(19,40);
		add(inputText);
		add(button);
		add(new JScrollPane(textShow));
	}

	void setMyCommandListener(MyCommandListener listener) {
		this.listener = listener;
		listener.setJTextField(inputText);
		listener.setJTextArea(textShow);
		inputText.addActionListener(listener);
		//inputText是事件源，listener是监视器
		button.addActionListener(listener);
		//button是事件源，listener是监视器
		
	}
}
