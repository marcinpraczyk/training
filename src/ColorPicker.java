import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorPicker extends JFrame
{
	private JButton button;
	private JPanel panel;
	private Color color = Color.WHITE;
	
	public ColorPicker()
	{
		super("the title");
		
		button = new JButton ("change a color");
		panel = new JPanel();
		panel.setBackground(color);
		
		button.addActionListener
		(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						color = JColorChooser.showDialog(null, "pick", color);
						if (color == null)
							color = Color.WHITE;
						
						panel.setBackground(color);
					}
				}
		);
		add(button, BorderLayout.SOUTH);
		add(panel, BorderLayout.CENTER);
		setSize(500,500);
		setVisible(true);
	}
}