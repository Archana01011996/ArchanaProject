package testngtutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	@AfterMethod(groups= {"Smoke"}) //for groups since this aftermethod it works only if below @test method works
	public void aftereverymethod()
	{
		System.out.println("Aftermethod of day 2:-I will exdecute after every method in day 2");
	}
	@Test(groups= {"Smoke"})
	public void WebLogincarloan()
	{
		System.out.println("day 2 class method-weblogincar");
	}
	
	
	@Test(dependsOnMethods= {"WebLogincarloan"})
	public void MobileLoginCarLoan()
	{
		System.out.println("day 2 class method -MobileLogincar");
	}
	@BeforeTest
	public void LoginAPIcarloan()
	{
		System.out.println("Before test executes first in that test folder-APILogincar");
	}

}
