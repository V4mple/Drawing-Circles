package drawingCircles;

import java.awt.event.MouseListener;

import javax.swing.JPanel;

import java.awt.event.MouseEvent;

public class AppMouseListener implements MouseListener
{
	private int xPos;
	private int yPos;
	
	private static boolean inputWindowCheck = false;
	
	private JPanel drawingPanel;
	
	public AppMouseListener(JPanel drawingPanel)
	{
		this.drawingPanel = drawingPanel;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		xPos = e.getX();
		yPos = e.getY();
		
		if (!inputWindowCheck)
		{
			inputWindowCheck = true;
			InputWindowCreation inputWindow = new InputWindowCreation(xPos,yPos,drawingPanel);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void setInputWindowCheck(boolean mode)
	{
		inputWindowCheck = mode;
	}

}
