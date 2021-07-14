package View;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonBox extends JPanel{
	private JButton[] tastatur;
	private char taste= 'A';
	
	ButtonBox(){
		this.setLayout(new GridLayout(3,9));
		machTasten();
		
	}
	
	public JButton[] getTastatur() {
		return tastatur;
	}

	public void setTastatur(JButton[] tastatur) {
		this.tastatur = tastatur;
	}

	public char getTaste() {
		return taste;
	}

	public void setTaste(char taste) {
		this.taste = taste;
	}

	private void machTasten() {
		tastatur = new JButton[26];
		for(int i=0; i<=25; i++) {
			tastatur[i]= new JButton(Character.toString(taste+i));
			this.add(tastatur[i]);
		}
		
	
	}
	
	
	
	
}
