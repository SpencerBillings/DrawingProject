package drawing.view;

import drawing.controller.DrawingController;
import javax.swing.JFrame;

public class DrawingFrame extends JFrame
{
	private DrawingController app;
	private DrawingPanel appPanel;
	
	public DrawingFrame(DrawingController app)
	{
		super();
		this.app = app;
		this.appPanel = new DrawingPanel(app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(1000, 1000);
		this.setTitle("You Have 10 Seconds!");
		this.setResizable(false);
		this.setVisible(true);
	}
}
