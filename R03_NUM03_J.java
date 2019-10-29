/******************************************************************************
 NUM03-J. Use integer types that can fully represent the possible range of unsigned data
 Non-Compliant Code
 ******************************************************************************/

public class R03_NUM03_J
{	
	
	public static int getInteger(DataInputStream is) throws IOException 
	{
		return is.readInt(); 
	}
	
    public static void main(String[] args) 
	{
        //Do Something
    }

}