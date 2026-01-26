package Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//To get all links count //1
		System.out.println(driver.findElements(By.tagName("a")).size());
		
//	List<WebElement> linkslist=	driver.findElements(By.tagName("a"));
//	System.out.println(linkslist);
		//Links count of Footer sections
		//2
		WebElement footerdriver=driver.findElement(By.cssSelector("#gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//3
	WebElement columndriver=	footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(columndriver.findElements(By.tagName("a")).size());
	
	for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
	{
		String clickonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
		Thread.sleep(5000);
		
		}
	
	Set<String> windows=driver.getWindowHandles();	
	Iterator<String> it=windows.iterator();
	    while(it.hasNext())   //hasNext will check if next index is present or not
	    {
	    	driver.switchTo().window(it.next());  //it.next() prints window id and we pass it to swithc
	    	System.out.println(driver.getTitle());
	    }
		 
	 {
		 
	 }
	}

}
