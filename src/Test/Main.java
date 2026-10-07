package Test;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.Color;
import java.awt.Image;

public class Main {
	
	// Get screen size to create the window with these values
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int screenHeight = screenSize.height;
	int screenWidth = screenSize.width;
	
	void SetVisible(Boolean isTrue, JFrame Element) {
		Element.setVisible(isTrue);
	}
	
	void chunckGenerator(short sizeX, short sizeY) {
		
	}
	
	void Interfaz(String args[]) {
		JFrame MainFrame = new JFrame();
		MainFrame.setSize(screenWidth, screenHeight);
		MainFrame.getContentPane().setBackground(Color.black);
		
		try (
				Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Assets/icon.jpg"){
			
		}
		MainFrame.setIconImage(icon);
		
		JTextArea MainTitle = new JTextArea(1, 1);
		MainTitle.setText("TEST");

		MainTitle.setVisible(true);
		
		
		SetVisible(true, MainFrame);
	}
	
	void main(String args[]) {
		Interfaz(args);
	}
}
