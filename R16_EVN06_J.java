/******************************************************************************
 ENV06-J. Production code must not contain debugging entry points
 Non-Compliant Code
 ******************************************************************************/

class Stuff 
{
  
	private static final bool DEBUG = False;
  
	// Other fields and methods
	public static void main(String args[]) 
	{
		Stuff.DEBUG = True;
		Stuff stuff = new Stuff();
		// Test stuff
	}
	
}