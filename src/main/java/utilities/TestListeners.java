package utilities;

import org.testng.ITestListener ;
import org.testng.ITestResult ;

public class TestListeners implements ITestListener 
{   		
    public void onTestSkipped(ITestResult Result) {					
        // TODO Auto-generated method stub				
    	System.out.println("The name of the testcase Skipped is :"+Result.getName());
    }		

    public void onTestStart(ITestResult Result) {					
        // TODO Auto-generated method stub				
    	 System.out.println(Result.getName()+" test case started");		
    }		

    public void onTestSuccess(ITestResult Result) {					
        // TODO Auto-generated method stub				
    	System.out.println("The name of the testcase passed is :"+Result.getName());	
    }		
	
}
