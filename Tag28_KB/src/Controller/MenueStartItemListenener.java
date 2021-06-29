package Controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MenueStartItemListenener implements ActionListener {

//	private 
	private static MyController mc ;
	private final static  MenueStartItemListenener instance = new  MenueStartItemListenener(mc);
	
	public static MenueStartItemListenener getInstance() {
		return MenueStartItemListenener.instance;
	}
	
	public MenueStartItemListenener(MyController mc) {
		this.mc=mc;
	}
	
	public void actionPerformed(ActionEvent e, MyController mc) {
		mc.starteSpiel();
//		frame.getMainPanel().getRatePanel().repaint();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
