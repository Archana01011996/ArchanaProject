package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OverallAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.findElement(By.id("checkBoxOption3")).click();
	   String option= driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]")).getText();
	   System.out.println(option);
		WebElement staticdropdown=driver.findElement(By.id("dropdown-class-example"));
		
		Select options=new Select(staticdropdown);
		options.selectByVisibleText(option);
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys(option);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		Thread.sleep(5000);
		String text=driver.switchTo().alert().getText(); 
		System.out.println(text);
		if(text.contains(option))
		{
			System.out.println("checked option is displayed");
		}
		else {
			System.out.println("not dispayed" + text);
		}
		
		

	}

}
	