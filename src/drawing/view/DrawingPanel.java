package drawing.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;

import drawing.controller.DrawingController;

public class DrawingPanel extends JPanel
{
	private DrawingController app;
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
	
	private JScrollPane horiScroll;
	private JScrollPane vertiScroll;
	
	private ImageIcon duckIcon;
	
	public DrawingPanel(DrawingController app)
	{
		super();
		this.app = app;
		this.appLayout = new SpringLayout();
		
		this.colorButtons = new JPanel(new GridLayout(9, 1));
		appLayout.putConstraint(SpringLayout.WEST, colorButtons, 51, SpringLayout.WEST, this);
		this.white = new JButton("   ");
		white.setForeground(Color.WHITE);
		this.red = new JButton("   ");
		red.setBackground(Color.RED);
		red.setForeground(Color.RED);
		this.orange = new JButton("   ");
		orange.setForeground(Color.ORANGE);
		orange.setBackground(new Color(255, 200, 0));
		this.yellow = new JButton("   ");
		this.green = new JButton("   ");
		this.blue = new JButton("   ");
		this.indigo = new JButton("   ");
		this.violet = new JButton("   ");
		this.black = new JButton("   ");
		
		this.functionButtons = new JPanel(new GridLayout(3, 1));
		appLayout.putConstraint(SpringLayout.NORTH, colorButtons, 59, SpringLayout.SOUTH, functionButtons);
		this.loadButton = new JButton("Load");
		this.saveButton = new JButton("Save");
		this.clearButton = new JButton("Clear");
		
		this.horiScroll = new JScrollPane();
		this.vertiScroll = new JScrollPane();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension (800, 800));
		this.setBackground(Color.DARK_GRAY);
		this.add(horiScroll);
		this.add(vertiScroll);
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
	
	private void setupScrollPane()
	{
		
	}
	
	private void setupLayout()
	{
		
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
