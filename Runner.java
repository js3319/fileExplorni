import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;
public class Runner {
String input;
String change;
Desktop desktop;
File file;


public Runner() {
	EventQueue.invokeLater(new Runnable() {
		@Override
		public void run() {
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				start();
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
			}
		}
	});
} 
	public static void main(String[]args) {
		Runner run = new Runner();			
		
	}

	
	public void getUserInput() {
		//mac os is forward slash /users/js/xxxxxxxx
		//ex. "/Users/js/Downloads/IMG_1388.jpg/"
		//perhaps put hints to help user guide, or adapt gui to have user select directory path
		input = JOptionPane.showInputDialog("Enter Directory");	
		
		desktop = Desktop.getDesktop();
		if(Desktop.isDesktopSupported()) {
		//URI is essentially url, this segment opens 
//		URI uri;
//		try {
//			uri = new URI("https://www.reddit.com/");
//			desktop.browse(uri);
//		} catch (URISyntaxException | IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		File file = new File (input);
//		try {
//			desktop.open(file);
////		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(input);
	//	System.out.println(desktop);
		if(file.isDirectory()) {
			System.out.println("is directory");
		}
		}
		else{
			System.out.println("desktop not supported!");
		}
		
	//	change = JOptionPane.showInputDialog("Enter Desired Change");	
	}
	public void start() {
		//put methods here
		getUserInput();
		//checkInput();
		
			try {
				FileRetriever finder= new FileRetriever(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}
	
	public void checkInput() {
		//	if(input)
		
		}
	
	
}

	

