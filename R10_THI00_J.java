/******************************************************************************
 THI00-J. Do not invoke Thread.run()
 Compilation: javac R10_THI100_J.java
 Execution:   java R10_THI100_J
 
 Non-Compliant Code
 ******************************************************************************/

public final class Foo implements Runnable 
{
		
	@Override public void run() 
	{
		// ...
	}
 
	public static void main(String[] args) 
	{
		Foo foo = new Foo();
		new Thread(foo).start();
	}
	
}
