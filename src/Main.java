import java.awt.*;
import javax.swing.*;


public class Main{
	
	public static void main(String args[])
	{
	
		String a = "marcin";
		String b = "MARCIN";
		String c = "praczyk";
		
		System.out.println(a.length());
		if(a.equals(b))
			System.out.println("a and b are equal including case");
		else
			System.out.println("a and b are NOT equal including case");
		
		if(a.equalsIgnoreCase(b))
			System.out.println("a and b are equal ignoring case");
		else
			System.out.println("a and b are NOT equal ignoring case");
	}
	
}