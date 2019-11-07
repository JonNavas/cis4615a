/******************************************************************************
 EXP00-J. Do not ignore values returned by methods
 Non-Compliant Code
 ******************************************************************************/

public class R02_XP00_J 
{

	public void deleteFile()
	{
		File someFile = new File("someFileName.txt");
		
		// Do something with someFile
		
		if (!someFile.delete()) 
		{
    			// Handle failure to delete the file
  		}
	}
	
    	public static void main(String[] args)
    	{
		
		//Do Something
	}

}
