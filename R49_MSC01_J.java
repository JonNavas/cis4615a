/******************************************************************************
 MSC01-J. Do not use an empty infinite loop
 Compilation: javac R49_MSC01_J.java
 Execution:   java R49_MSC01_J
 Compliant Code
 ******************************************************************************/

class Stuff 
{
	
	private static final long DURATION = 0;
  	
	public void nop() throws InterruptedException 
	{
  		while (true) 
		{
    			// Useful operations
    			Thread.sleep(DURATION);
  		}
	}
	
	// Other fields and methods
	public static void main(String args[]) 
	{
		//Do Something
	}
	
}
