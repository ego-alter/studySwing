package ItemEvent事件;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

public class OperatorListener implements ItemListener {
	JComboBox choice;
	ComputerListener workTogether;
	@Override
	public void itemStateChanged(ItemEvent e) {
		String fuhao = choice.getSelectedItem().toString();
		workTogether.setFuhao(fuhao);

	}

	public void setJComboBox(JComboBox box) {
		choice = box;
		
	}

	public void setWorkTogether(ComputerListener computer) {
		workTogether = computer;
		
	}

}
