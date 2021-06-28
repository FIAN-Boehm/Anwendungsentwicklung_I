package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenueStartItemListenener implements ActionListener {

	private MyController mc;
	
	public MenueStartItemListenener(MyController mc) {
		this.mc=mc;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		mc.starteSpiel();
		
	}

}
