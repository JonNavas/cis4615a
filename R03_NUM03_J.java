/******************************************************************************
 NUM03-J. Use integer types that can fully represent the possible range of unsigned data
 Compilation: javac R03_NUM03_J.java
 Execution:   java R03_NUM03_J
 Non-Compliant Code
 ******************************************************************************/

public class R03_NUM03_J
{	
	
	public static int getInteger(DataInputStream is) throws IOException 
	{
		return is.readInt() & 0xFFFFFFFFL; 
	}
	
   	 public static void main(String[] args) 
 	{
        	//Do Something
    	}

}
