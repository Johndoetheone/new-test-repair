/*
* TEMPLATE GENERATED TESTCASE FILE
* @description
* CWE: 259 Hard Coded Password
* BadSource: hardcodedPassword Set data to a hardcoded string
* Flow Variant: 81 Data flow: data passed in a parameter to an abstract method
* */

package test_cases.CWE259.CWE259_Hard_Coded_Password__mapReplaceSECURITY_CREDENTIALS;

import testcasesupport.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.io.*;
import javax.naming.Context;
import java.util.HashMap;
import java.util.Map;

public class CWE259_Hard_Coded_Password__mapReplaceSECURITY_CREDENTIALS_81_bad extends CWE259_Hard_Coded_Password__mapReplaceSECURITY_CREDENTIALS_81_base
{

	public void action(String data) throws Throwable
    {
    	Map<String, String> map = new HashMap<>();
		map.put(Context.SECURITY_CREDENTIALS, "");
        
        if (data != null)
        {
            try
            {
            	/* POTENTIAL FLAW: data used as password in database connection */
				map.replace(Context.SECURITY_CREDENTIALS, "", data);
            	
            }
            catch (Exception e)
			{
				IO.logger.log(Level.WARNING, "Unknown error", e);
			}

        }
    }
    
    public void action(char[] data) throws Throwable
    {
    }
    
    public void action(Properties properties) throws Throwable
    {
    }
}