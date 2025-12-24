package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//While loop
		//int i=1;
	/*	while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		*/
		//using for loop
		
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		
		driver.findElement(By.cssSelector("input[class='buttonN']:nth-child(1)")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
