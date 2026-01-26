package testngtutorial;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class day1 {
	
	@BeforeClass
	public void befclass()
	{
		System.out.println("Before class method will execute before any method in that particular class day 1 here");
	}
	
	@AfterTest
	public void Demo()
	{
		System.out.println("AfterTest-day1 class-Archana");
	}
	
	@AfterSuite
	public void Afsuite()
	{
	System.out.println("Aftersuite:-I will be executing last");
	}
	@Test(groups= {"Smoke"})
	public void SecondTest()
	{
	//	System.out.println("Day1 class-bye");
		Assert.assertTrue(false);
	}
                                                              
	@Parameters({"URL","APIkEY/Username"})
	@Test
	public void thirstest(String urlname,String key)
	{
		System.out.println("Day 3");
		System.out.println(urlname);
		System.out.println(key);
	}                                                                                                     
	@Test(dataProvider="getData")
	
	public void unpwd(String username ,String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		//1 st combination-username password-good credit history-row
		//2 nd-username and password-no credit history
		//3rd -fraudlent credit history
		
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
	}
}
