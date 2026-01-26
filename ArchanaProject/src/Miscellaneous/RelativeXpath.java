package Miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeXpath {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	WebElement	nametextbox=driver.findElement(By.cssSelector("input[name='name']"));
	System.out.println(driver.findElement(with(By.tagName("label")).above(nametextbox)).getText());
	WebElement DOBlabelText=driver.findElement(By.cssSelector("[for='dateofBirth']"));
	//relative locators doesnt locate flex type of html  so instead of entering data in dob it goes to next input tag submit and performs click
	driver.findElement(with(By.tagName("input")).below(DOBlabelText)).click();  //submit button click
	WebElement checkbox=driver.findElement(By.cssSelector("[for='exampleCheck1']"));
	driver.findElement(with(By.tagName("input")).toLeftOf(checkbox)).click();
	WebElement radiobutton=driver.findElement(By.cssSelector("[id='inlineRadio1']"));
	System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radiobutton)).getText());
	

	}

}
