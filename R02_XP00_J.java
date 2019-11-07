/******************************************************************************
 EXP00-J. Do not ignore values returned by methods
 Compilation: javac R02_XP00_J.java
 Execution:   java R02_CP00_J
 Compliant Code
 ******************************************************************************/
import java.io.File;

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
	
Compliant-Code
 	public static void main(String[] args) 
   	{
		deleteFile();
=======
    	public static void main(String[] args)
    	{
		
		//Do Something
master
	}

}
