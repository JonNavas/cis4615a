/******************************************************************************
 IDS03-J Do not log unsanitized user input
 Compilation: javac R00_IDS3_J.java
 Execution:   java R00_IDS03_J
 
 Non-Compliant Code
 ******************************************************************************/

public class R00_IDS03_J 
{
	public String sanitizeUser(String username) 
	{
		return Pattern.matches("[A-Za-z0-9_]+", username))
			? username : "unauthorized user";
	}
	
    	public static void main(String[] args) 
	{
		boolean loginSuccesful = true;
        
		if (loginSuccessful) 
			{
			logger.severe("User login succeeded for: " + sanitizeUser(username));
			} 
		
		else 
			{
			logger.severe("User login failed for: " + sanitizeUser(username));
			}
   	 }

}
