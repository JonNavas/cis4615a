/******************************************************************************
 LCK01-J. Do not synchronize on objects that may be reused
 Compilation: javac R09_LCK01_J.java
 Execution:   java R09_LCK01_J
 Compliant Code
 ******************************************************************************/
import java.lang.Integer;
import java.io.*; 
import java.util.*; 

public class R09_LCK01_J
{

	private int count = 0;
	private final Integer Lock = new Integer(count); // Boxed primitive Lock is shared
 
	public void doSomething() 
	{
		synchronized (Lock) 
		{
			count++;
			// ...
		}
	}
	
 	public static void main(String[] args) 
	{
        	//Do Something
    	}

}
