/******************************************************************************
 MSC01-J. Do not use an empty infinite loop
 Non-Compliant Code
 ******************************************************************************/

class Stuff 
{
  	
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
