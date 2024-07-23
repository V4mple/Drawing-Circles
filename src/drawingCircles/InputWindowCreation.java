package drawingCircles;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputWindowCreation 
{
	private JFrame inputFrame;
	
	private JPanel drawingPanel;
	private JPanel inputPanel;
	
	private JLabel radiusLabel;
	
	private JTextField inputField;
	
	private JButton cancelButton;
	private JButton okayButton;
	
	private int xPos;
	private int yPos;
		
	private static final int FRAME_WIDTH = 250;
	private static final int FRAME_HEIGHT = 125;
	
	public InputWindowCreation(int xPos, int yPos, JPanel drawingPanel)
	{
		this.xPos = xPos;
		this.yPos = yPos;
		this.drawingPanel = drawingPanel;
		
		initializeComponents();
		inputFrame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
	}
	
	public void initializeComponents()
	{
		createFrame();
		
		setFrameSettings();
		
		createPanel();
		
		createLabel();
		
		createTextField();
		
		createButtons();
		
		addButtonListeners();
		
		addComponentsToPanel();
		
		addPanelToFrame();
	}
	
	public void createFrame()
	{
		inputFrame = new JFrame();
	}
	
	public void setFrameSettings()
	{
		inputFrame.setTitle("Input");
		inputFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		inputFrame.setVisible(true);
		inputFrame.setResizable(false);
	}
	
	public void createPanel()
	{
		inputPanel = new JPanel();
	}
	
	public void createLabel()
	{
		radiusLabel = new JLabel("Enter Radius :");
	}
	
	public void createTextField()
	{
		inputField = new JTextField(10);
	}
	
	public void createButtons()
	{
		cancelButton = new JButton("Cancel");
		okayButton = new JButton("Okay");
	}
	
	public void addButtonListeners()
	{
		cancelButton.addActionListener(new CancelButtonListener(inputFrame));
		okayButton.addActionListener(new OkayButtonListener(xPos,yPos,drawingPanel,inputFrame,inputField));
	}
	
	public void addComponentsToPanel()
	{
		inputPanel.add(radiusLabel);
		inputPanel.add(inputField);
		inputPanel.add(cancelButton);
		inputPanel.add(okayButton);
	}
	
	public void addPanelToFrame()
	{
		inputFrame.add(inputPanel);
	}
}
