package Miscellaneous;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invokingmultiplewindowsortabs {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> windows=driver.getWindowHandles();
	Iterator<String> it=	windows.iterator();
	String parentid=it.next();
	String childid=it.next();
	

	driver.switchTo().window(childid);
	Thread.sleep(5000);                                                                                                                    
	driver.get("https://rahulshettyacademy.com/");

//	driver.findElement(By.xpath("//a[text()='View More Courses']")).click();
//	String childid2=it.next();
//	driver.switchTo().window(childid2);
//	Thread.sleep(5000);
	
	//String CourseName=driver.findElements(By.xpath("//h2[@data-sentry-element='CardTitle']")).get(1).getText();
	String CourseName=driver.findElements(By.xpath("//h3[@class='font-bold text-lg group-hover:text-primary transition-colors leading-tight']")).get(0).getText();
	driver.switchTo().window(parentid);
	WebElement name=driver.findElement(By.cssSelector("[name='name']"));
	name.sendKeys(CourseName);
	File file=name.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file,new File( "logo.png"));
	
	//height n width of webelement
	System.out.println(name.getRect().getDimension().getHeight());
	System.out.println(name.getRect().getDimension().getWidth());

	}

}
