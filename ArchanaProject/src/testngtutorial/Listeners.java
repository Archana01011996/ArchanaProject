package testngtutorial;

import org.testng.ITestListener;
import org.testng.ITestResult;




//ITestListener interface which implements testng listener
public class Listeners implements ITestListener {	
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		//screenshot code
		//response of api is failed
		//to get to know which test failed
		System.out.println("I failed executed listeners pass code "  +   result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("I successfully executed Listeners pass code");
	}
	
 
}
