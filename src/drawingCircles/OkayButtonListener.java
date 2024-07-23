package drawingCircles;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;

public class OkayButtonListener implements ActionListener
{
	private int xPos;
	private int yPos;
		
	private JPanel drawingPanel;
	
	private JFrame inputFrame;
	
	private JTextField inputField;
	
	
	OkayButtonListener(int xPos,int yPos,JPanel drawingPanel, JFrame inputFrame,JTextField inputField)
	{
		this.xPos = xPos;
		this.yPos = yPos;
		this.drawingPanel = drawingPanel;
		this.inputFrame = inputFrame;
		this.inputField = inputField;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
        try
        {
            int radius = Integer.parseInt(inputField.getText());
            DrawCircle circle = new DrawCircle(xPos, yPos, radius);
            drawingPanel.add(circle);
            drawingPanel.repaint();
            inputFrame.dispose();
            AppMouseListener.setInputWindowCheck(false);
        }
        catch (NumberFormatException exception) 
        {
            System.out.println("Error! Please Insert Valid Numbers In The Input Field!");
        }
	}

}
