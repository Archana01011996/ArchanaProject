package testngtutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS {
	
	public void doThis()
	{
		System.out.println("I am here");
	}
	
	@BeforeMethod
	
	public void BeforeRun()
	{
		System.out.println("I run before each and every  method in PS class");
	}
	
	@AfterMethod
	public void AfterRun()
	{
		System.out.println("I run after each and every method in PS class");
		
	}
	
	@Test
	public void doThat()
	{
		System.out.println("I am do that");
	}

}
