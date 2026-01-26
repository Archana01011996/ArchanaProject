package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Archana RenukaPrasad")	;
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("archana.jan01@gmail.com");
		driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys("Archana@1996");
		driver.findElement(By.xpath("//div[@class='form-check']/input")).click();
	   WebElement staticdropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdownoptions=new Select(staticdropdown);
		dropdownoptions.selectByVisibleText("Female");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("01-01-1996");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		
		
		
	
	
	}

}
