package Dropdown;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;        
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;

public class fluentWaittest {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30)) // Maximum wait time
                .pollingEvery(Duration.ofSeconds(3)) // Polling interval
                .ignoring(NoSuchElementException.class); // Exception to ignore
		
		WebElement foo=wait.until(new Function<WebDriver, WebElement>()
				{
			
			public WebElement apply(WebDriver driver)
			{
				if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
						{
					return driver.findElement(By.cssSelector("[id='finish'] h4"));
						}
				else
				{
					return null;
				}
			}
		

	});
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());

}
}
