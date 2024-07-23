package drawingCircles;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class DrawCircle extends JComponent
{
	private int xPos;
	private int yPos;
	private int radius;
	
	public DrawCircle(int xPos,int yPos, int radius)
	{
		this.xPos = xPos;
		this.yPos = yPos;
		this.radius = radius;
		setBounds((xPos - radius) + 1, (yPos - radius) + 1, (radius*2)+1,(radius*2)+1);
	}
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.drawOval(0, 0, radius*2, radius*2);
	}
}