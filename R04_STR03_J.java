/******************************************************************************
 STR03-J. Do not encode noncharacter data as a string
 Compilation: javac R04_STR03_J.java
 Execution:   java R004_STR03_J
 Compliant Code
 ******************************************************************************/
import java.math.BigInteger;
import java.io.*;

public class R04_STR03_J
{
	
    	public static void main(String[] args) 
	{
        			
		BigInteger x = new BigInteger("530500452766");
		String s = x.toString();  // Valid character data
		byte[] byteArray = s.getBytes();
		String ns = new String(byteArray); 
		x = new BigInteger(ns);
		
   	}

}
