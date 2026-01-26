package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlerts {

	public static void main(String[] args) throws InterruptedException {

		String name = "Archana";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("sessionkey");
		//click on any link
		//login page should be redirected
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.xpath("//fieldset[@class='pull-right']/legend//following-sibling::input[2]")).click();
		System.out.println(driver.switchTo().alert().getText());
		// if we want to click on ok for alert popup
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//fieldset[@class='pull-right']/legend//following-sibling::input[3]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
