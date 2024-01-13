import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class lastgui implements ActionListener, ChangeListener{
	//Properties
	JFrame theFrame = new JFrame("Last GUI");
	LastPanel thePanel = new LastPanel();
	Timer thetimer = new Timer(1000/60, this);
	JSlider hslider = new JSlider(SwingConstants.HORIZONTAL, 0, 800, 50);
	JSlider vslider = new JSlider(SwingConstants.VERTICAL, 0, 600, 550);
	
	//Methods
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource() == thetimer){
			thePanel.repaint();
		}
	}
	
	public void stateChanged(ChangeEvent evt){
		if(evt.getSource() == hslider){
			thePanel.intX = hslider.getValue();
		}
		if(evt.getSource() == vslider){
			thePanel.intY = 600 - vslider.getValue();
		}
	}
	
	//Constructor
	public lastgui(){
		thePanel.setLayout(null);
		thePanel.setPreferredSize(new Dimension(800, 600));
		
		hslider.setSize(800, 20);
		hslider.setLocation(0, 0);
		hslider.addChangeListener(this);
		thePanel.add(hslider);
		
		vslider.setSize(20, 600);
		vslider.setLocation(0, 0);
		vslider.addChangeListener(this);
		thePanel.add(vslider);
		
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.setContentPane(thePanel);
		theFrame.pack();
		theFrame.setVisible(true);
		theFrame.setResizable(false);
		thetimer.start();
	}
	
	//main method
	public static void main(String[] args){
		new lastgui();
	}
}
