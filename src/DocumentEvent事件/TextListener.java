package DocumentEvent事件;

import java.util.Arrays;

import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TextListener implements DocumentListener {
	JTextArea inputText,showText;
	
	@Override
	public void insertUpdate(DocumentEvent e) {
		changedUpdate(e);

	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		changedUpdate(e);

	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		String str=inputText.getText();
		String regex="[\\s\\d\\p{Punct}]+";
		String words[] = str.split(regex);
		Arrays.sort(words);
		showText.setText(null);
		for(int i=0;i<words.length;i++) {
			showText.append(words[i]+",");
		}
	}

	public void setInputText(JTextArea text) {
		inputText = text;
		
	}

	public void setShowText(JTextArea text) {
		showText = text;
		
	}

}
