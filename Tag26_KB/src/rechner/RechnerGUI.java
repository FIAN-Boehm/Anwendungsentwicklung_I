package rechner;

public class RechnerGUI {

	EastPanel east;
	MyFrame frame;
	
	RechnerGUI(){
		frame= new MyFrame();
		east = new EastPanel();
		frame.getContentPane().add(east);
	}
	
}
