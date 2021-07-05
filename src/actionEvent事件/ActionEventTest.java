package actionEvent事件;

public class ActionEventTest {

	public static void main(String[] args) {
		WindowActionEvent win = new WindowActionEvent();
		PoliceListen police = new PoliceListen();//创建监视器
		win.setMyCommandListener(police); //窗口组合监视器
		win.setTitle("处理ActionEvent事件");
		win.setBounds(100,100,460,360);
		

	}

}
