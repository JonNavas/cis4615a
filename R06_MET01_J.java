/******************************************************************************
 MET01-J. Never use assertions to validate method arguments
 Non-Compliant Code
 ******************************************************************************/

public class R00_IDS03_J 
{
	public static int getAbsAdd(int x, int y) 
	{
		return Math.abs(x) + Math.abs(y);
	}
	
    public static void main(String[] args) 
	{
       	getAbsAdd(Integer.MIN_VALUE, 1);
    }

}