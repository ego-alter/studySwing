package 菜单;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class WindowMenu extends JFrame {
	JMenuBar menubar;
	JMenu menu,subMenu;
	JMenuItem item1,item2;
	
	public WindowMenu() {}
	public WindowMenu(String s, int x, int y, int w, int h) {//窗口设置
		init(s);
		setLocation(x,y);
		setSize(w,h);//窗口尺寸
		setVisible(true);//可见
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//隐藏当前窗口
	}
	
	@SuppressWarnings("deprecation")
	void init(String s) {
		setTitle(s);
		menubar = new JMenuBar();//菜单条
		menu = new JMenu("菜单");//菜单
		subMenu = new JMenu("软件项目");//菜单是菜单项子类，也可以作为菜单项
		item1 = new JMenuItem("java话题",new ImageIcon(getClass().getResource("a.gif")));//菜单项
		item2 = new JMenuItem("动画话题",new ImageIcon(getClass().getResource("b.gif")));
		item1.setAccelerator(KeyStroke.getKeyStroke('A'));//设置快捷键
		item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
		
		menu.add(item1);
		menu.addSeparator();
		menu.add(item2);
		menu.add(subMenu);
		subMenu.add(new JMenuItem("汽车销售系统",new ImageIcon(getClass().getResource("c.gif"))));
		subMenu.add(new JMenuItem("农场信息系统",new ImageIcon(getClass().getResource("d.gif"))));
		menubar.add(menu);
		setJMenuBar(menubar);
	}

}
