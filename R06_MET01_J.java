/******************************************************************************
 MET01-J. Never use assertions to validate method arguments
 Compilation: javac R06_MET01_J.java
 Execution:   java R06_MET01_J
 Compliant Code
 ******************************************************************************/
import java.lang.Math;
import java.lang.Integer;

public class R06_MET01_J 
{
	
	public static int getAbsAdd(int x, int y) 
	{
  		if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) 
		{
    			throw new IllegalArgumentException();
 	 	}
  
		int absX = Math.abs(x);
  		int absY = Math.abs(y);
		
  		if (absX > Integer.MAX_VALUE - absY) 
		{
    			throw new IllegalArgumentException();
 		}
		
 		 return absX + absY;
	}
	
	public static void main(String[] args)
    	{
		//Do Something
	}
	
}
