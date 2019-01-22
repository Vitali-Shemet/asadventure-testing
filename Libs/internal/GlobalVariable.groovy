package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object HomeUrl
     
    /**
     * <p></p>
     */
    public static Object Login
     
    /**
     * <p></p>
     */
    public static Object Password
     
    /**
     * <p></p>
     */
    public static Object NoSearchResultsText
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['HomeUrl' : 'https://www.asadventure.com/en.html', 'Login' : 'test.user21@mailinator.com', 'Password' : 'DSNYktEjpD9MTMA', 'NoSearchResultsText' : 'Your search did not match any products'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        def selectedVariables = allVariables[profileName]
		
		for(object in selectedVariables){
			String overridingGlobalVariable = RunConfiguration.getOverridingGlobalVariable(object.key)
			if(overridingGlobalVariable != null){
				selectedVariables.put(object.key, overridingGlobalVariable)
			}
		}

        HomeUrl = selectedVariables["HomeUrl"]
        Login = selectedVariables["Login"]
        Password = selectedVariables["Password"]
        NoSearchResultsText = selectedVariables["NoSearchResultsText"]
        
    }
}
