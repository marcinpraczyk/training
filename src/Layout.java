import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Layout extends JFrame
{
	private JButton leftButton;
	private JButton rightButton;
	private JButton centerButton;
	private FlowLayout layout;
	private Container container;
	
	public Layout()
	{
		super("title");
		layout = new FlowLayout();
		
		setLayout(layout);
		container = getContentPane();
		
		leftButton = new JButton("left");
		add(leftButton);
		leftButton.addActionListener
		(
		
				new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						layout.setAlignment(FlowLayout.LEFT);
						layout.layoutContainer(container);
					}
				}
				
		);
		
		centerButton = new JButton("center");
		add(centerButton);
		centerButton.addActionListener
		(
				
		new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				layout.setAlignment(FlowLayout.CENTER);
				layout.layoutContainer(container);
			}
		}
				
		);
		
		rightButton = new JButton("right");
		add(rightButton);
		rightButton.addActionListener
		(
				
				new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						layout.setAlignment(FlowLayout.RIGHT);
						layout.layoutContainer(container);
					}
				}
				
		);
		
	}
}