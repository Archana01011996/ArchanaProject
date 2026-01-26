package testngtutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void WebLoginHomeloan()
	{
		System.out.println("day 3 class method-webloginHome");
	}
	
	@BeforeMethod
	public void beforeeverymethod()
	{
		System.out.println("Before method-executes before every method within class day 3");
	}
	@Test(timeOut=4000)
	public void MobileLoginHomeLoan()
	{
		System.out.println("day 3 class method-MobileLoginHome");
	}
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("Before suite:- executing in no 1 place");
	}
	@Test(groups= {"Smoke"})
	public void LoginAPIHomeloan()
	{
		System.out.println("day 3 class method-APILoginHome");
	}
	

	@AfterClass
	public void afclass()
	{
		System.out.println("after class method will execute after any method in that particular class day 3 here");
	}
	

}
