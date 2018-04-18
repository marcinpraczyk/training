import java.io.*;
import java.util.*;
import java.lang.*;

public class CreateFile
{
	
	private Formatter x;
	
	public void openFile()
	{
		try
		{
			x = new Formatter ("prova.txt");
		}
		
		catch (Exception e)
		{
			System.out.println("zle");
		}
	}
	
	public void addRecords(String a, String b, String c)
	{
		x.format("%s %s %s", a , b , c);
	}
	
	public void closeFile()
	{
		x.close();
	}
}