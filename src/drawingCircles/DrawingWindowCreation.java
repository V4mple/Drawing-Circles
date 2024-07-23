package drawingCircles;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingWindowCreation 
{
	private JFrame mainFrame;
	
	private JPanel drawingPanel;
	
	private static final int FRAME_WIDTH = 1000;
	private static final int FRAME_HEIGHT = 800;
	
	public DrawingWindowCreation()
	{
		initializeComponents();
		mainFrame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
	}
	
	public void initializeComponents()
	{
		createFrame();
		setFrameSettings();
		createPanel();
		addListener();
		addPanelToFrame();
	}
	
	public void createFrame()
	{
		mainFrame = new JFrame();
	}
	
	public void setFrameSettings()
	{
		mainFrame.setTitle("Drawing Circles");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}
	
	public void createPanel()
	{
		drawingPanel = new JPanel();
	}
	
	public void addListener()
	{
		drawingPanel.addMouseListener(new AppMouseListener(drawingPanel));
	}
	
	public void addPanelToFrame()
	{
		mainFrame.add(drawingPanel);
	}
}
