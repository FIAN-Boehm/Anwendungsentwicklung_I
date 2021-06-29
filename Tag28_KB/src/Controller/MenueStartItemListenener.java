package Controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



public class MenueStartItemListenener implements ActionListener {


	private  MyController mc ;
	
	
	
	
	public MenueStartItemListenener(MyController mc) {
		this.mc=mc;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		mc.starteSpiel();
	}


	

	
}
