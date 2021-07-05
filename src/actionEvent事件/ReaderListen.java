package actionEvent事件;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReaderListen implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();//获取封装在事件中的命令字符串
		System.out.println(str+":"+str.length());

	}

}
