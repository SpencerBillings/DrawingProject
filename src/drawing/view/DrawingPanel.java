package drawing.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.*;
import drawing.controller.DrawingController;

public class DrawingPanel extends JPanel
{
	private DrawingController app;
	private ArtPanel canvas;
	private SpringLayout appLayout;
	
	private JPanel colorButtons;
	private JButton white;
	private JButton red;
	private JButton orange;
	private JButton yellow;
	private JButton green;
	private JButton blue;
	private JButton indigo;
	private JButton violet;
	private JButton black;
	
	private JPanel functionButtons;
	private JButton loadButton;
	private JButton saveButton;
	private JButton clearButton;
	
	private JScrollPane canvasScroll;
	
	private ImageIcon duckIcon;
	
	private JSlider widthSlider;
	
	private final int MINIMUM_LINE = 1;
	private final int MAXIMUM_LINE = 25;
	
	public DrawingPanel(DrawingController app)
	{
		super();
		app = app;
		canvas = new ArtPanel(app);
		appLayout = new SpringLayout();
		
		colorButtons = new JPanel(new GridLayout(0, 1));
		white = new JButton("   ");
		red = new JButton("   ");
		orange = new JButton("   ");
		yellow = new JButton("   ");
		green = new JButton("   ");
		blue = new JButton("   ");
		indigo = new JButton("   ");
		violet = new JButton("   ");
		black = new JButton("   ");
		
		functionButtons = new JPanel(new GridLayout(0, 1));
		loadButton = new JButton("Load");
		saveButton = new JButton("Save");
		clearButton = new JButton("Clear");
		
		canvasScroll = new JScrollPane();
		
		widthSlider = new JSlider(MINIMUM_LINE, MAXIMUM_LINE);
		
		setupMenuPanels();
		setupPanel();
		setupSlider();
		setupScrollPane();
		setupLayout();
		setupListeners();
	}
	
	private void setupMenuPanels()
	{
		
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension (800, 800));
		this.setBackground(Color.DARK_GRAY);
		this.add(canvasScroll);
		this.add(colorButtons);
		this.add(functionButtons);
		
		colorButtons.add(white);
		colorButtons.add(red);
		colorButtons.add(orange);
		colorButtons.add(yellow);
		colorButtons.add(green);
		colorButtons.add(blue);
		colorButtons.add(indigo);
		colorButtons.add(violet);
		colorButtons.add(black);
		
		functionButtons.add(clearButton);
		functionButtons.add(saveButton);
		functionButtons.add(loadButton);
	}
	
	private void setupSlider()
	{
		Hashtable<Integer, JLabel> scaleLabels = new Hashtable<Integer, JLabel>();
		scaleLabels.put(MINIMUM_LINE, new JLabel("<HTML>Small<BR>Line</HTML>"));
		scaleLabels.put(MAXIMUM_LINE, new JLabel("<HTML>Small<BR>Line</HTML>"));
		widthSlider.setLabelTable(scaleLabels);
		widthSlider.setSnapToTicks(true);
		widthSlider.setMajorTickSpacing(5);
		widthSlider.setMinorTickSpacing(1);
		widthSlider.setPaintTicks(true);
		widthSlider.setPaintLabels(true);
		widthSlider.setValue((MAXIMUM_LINE + MINIMUM_LINE) / 2);
	}
	
	private void setupScrollPane()
	{
		
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, colorButtons, 0, SpringLayout.NORTH, canvasScroll);
		appLayout.putConstraint(SpringLayout.SOUTH, colorButtons, 0, SpringLayout.SOUTH, canvasScroll);
		appLayout.putConstraint(SpringLayout.WEST, colorButtons, 50, SpringLayout.EAST, canvasScroll);
		appLayout.putConstraint(SpringLayout.EAST, colorButtons, 0, SpringLayout.WEST, functionButtons);
		
		appLayout.putConstraint(SpringLayout.NORTH, functionButtons, 200, SpringLayout.EAST, canvasScroll);
		appLayout.putConstraint(SpringLayout.NORTH, functionButtons, 0, SpringLayout.SOUTH, canvasScroll);
		appLayout.putConstraint(SpringLayout.NORTH, functionButtons, -50, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, functionButtons, 0, SpringLayout.NORTH, canvasScroll);
		
		appLayout.putConstraint(SpringLayout.NORTH, canvasScroll, 25, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, canvasScroll, 50, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, canvasScroll, -50, SpringLayout.SOUTH, this);
		
	}
	
	private void setupListeners()
	{
		white.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		red.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		orange.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		yellow.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		green.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		blue.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		indigo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		violet.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		black.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		clearButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		loadButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
	}
}
