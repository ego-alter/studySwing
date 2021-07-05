package ItemEvent事件;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ComputerListener implements ActionListener {
	JTextField inputNumberOne,inputNumberTwo;
	JTextArea textShow;
	String fuhao;
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			double number1 = Double.parseDouble(inputNumberOne.getText());
			double number2 = Double.parseDouble(inputNumberTwo.getText());
			double result = 0;
			
			switch(fuhao) {
			case "+":result = number1+number2;break;
			case "-":result = number1-number2;break;
			case "*":result = number1*number2;break;
			case "/":result = number1/number2;break;
			}
			textShow.append(number1+" "+fuhao+" "+number2+" = "+result+"\n");
			
		} catch (Exception exp) {
			textShow.append("\n请输入正确字符\n");
		}

	}

	public void setJTextFieldOne(JTextField t) {
		inputNumberOne = t;
		
	}

	public void setJTextFieldTwo(JTextField t) {
		inputNumberTwo = t;
		
	}

	public void setJTextArea(JTextArea area) {
		textShow = area;
		
	}

	public void setFuhao(String s) {
		fuhao = s;
		
	}

}
