package Javabasics_eclipse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Parent to child and sibling to sibling traverse
		//header/div/button[1]/following-sibling::button[1]
	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
	System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[1]")).getText());
	
	//child to parent travserse  --in css we cannot traverse only in xpath we can
	
	//header/div/button[1]/parent::div/parent::header/a
		
		
		
	}

}
