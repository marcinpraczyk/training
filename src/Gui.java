import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame
{
	
	private String details;
	private JLabel statusBar;
	
	public Gui()
	{
		super("title");
		
		statusBar = new JLabel("default");
		add(statusBar, BorderLayout.SOUTH);
		
		addMouseListener (new MouseClass());
		
	}
		
	private class MouseClass extends MouseAdapter
	{
		public void mouseClicked (MouseEvent event)
		{
			details = String.format("You've clicked the mouse %d times!", event.getClickCount());
			if(event.isMetaDown())
				details += " with right mouse button";
			else if(event.isAltDown())
				details += " with center mouse button";
			else
				details += " with left mouse button";
			
			statusBar.setText(details);
		}
	}
	
}
