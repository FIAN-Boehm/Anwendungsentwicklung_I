package Controller;

import java.io.File;

import Model.Woerter;
import View.MainFrame;

public class ApplicationTest {

	public static void main(String[] args) {
//		Woerter w = new Woerter();
//		System.out.println(w.toString());
//		File file = new File(w.getSf().getPathString() + w.getSf().getSaves()[1]);
//		w.ladeWoerter(file);
//		System.out.println(w.toString());
//		System.out.println(w.wortAussuchen());
//		w.entferneGeratenesWort("Batman");
//		System.out.println(w.toString());
//		MainFrame mf = new MainFrame();
//		System.out.println(mf.getMainPanel().toString());
		
		MyController mc = new MyController();
		mc.run();
		mc.starteSpiel();
		
	}

}
