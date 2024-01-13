import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;
import java.awt.image.*;


public class LastPanel extends JPanel{
	//Properties
	int intX = 50;
	int intY = 50;
	BufferedImage canvasImage = null;
	Graphics canvasGraphics = null;
	
	//Methods
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//g.fillOval(intX, intY, 5, 5);
		canvasGraphics.setColor(Color.WHITE);
		canvasGraphics.fillOval(intX, intY, 5, 5);
		g.drawImage(canvasImage, 0, 0, null);
		
	}

	
	
	//Constructor
	public LastPanel(){
		super();
		canvasImage = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
		canvasGraphics = canvasImage.getGraphics();
	
	}
}
