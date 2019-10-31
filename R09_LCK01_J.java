/******************************************************************************
 LCK01-J. Do not synchronize on objects that may be reused
 Non-Compliant Code
 ******************************************************************************/

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
