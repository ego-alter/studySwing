package 窗口;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class JFrameTest {
	public static void main(String args[]) {
		JFrame window1 = new JFrame("第一个窗口");
		JFrame window2 = new JFrame("第二个窗口");
		Container con = window1.getContentPane();
		con.setBackground(Color.yellow);
		window1.setBounds(600,500,388,308);
		window2.setBounds(1000,500,388,308);
		window1.setVisible(true);
		window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//释放当前窗口
		window2.setVisible(true);
		window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出程序
		
	}
}
