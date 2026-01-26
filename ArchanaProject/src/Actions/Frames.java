package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//to know how many frames are there
	System.out.println(driver.findElements(By.tagName("iframe")).size()); 
	//switching to frame using webelement
	driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
	driver.findElement(By.id("draggable")).click();
	Actions a=new Actions(driver);
	WebElement source=driver.findElement(By.id("draggable"));
	WebElement target=driver.findElement(By.id("droppable"));
	a.dragAndDrop(source, target).build().perform();
	driver.switchTo().defaultContent();
	
	
	
		
		
		
		
	}
	

}
