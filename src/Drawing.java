import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Drawing extends JPanel
{
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.RED);
		g.drawLine(10, 25, 50, 70);
	}
}