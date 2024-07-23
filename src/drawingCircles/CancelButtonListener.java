package drawingCircles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class CancelButtonListener implements ActionListener 
{
	private JFrame inputFrame;
	
	public CancelButtonListener(JFrame inputFrame)
	{
		this.inputFrame = inputFrame;
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		inputFrame.dispose();
		AppMouseListener.setInputWindowCheck(false);
	}
}