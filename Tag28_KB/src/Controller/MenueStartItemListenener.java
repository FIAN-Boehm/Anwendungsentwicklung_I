package Controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MenueStartItemListenener implements ActionListener {


	private static MyController mc ;
	
	
	
	
	public MenueStartItemListenener(MyController mc) {
		this.mc=mc;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		mc.starteSpiel();
	}

	
}
