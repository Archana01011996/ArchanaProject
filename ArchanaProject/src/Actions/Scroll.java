package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor   js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<values.size();i++)
		{
		
			sum=sum+Integer.parseInt(values.get(i).getText());
			
		}
		System.out.println(sum);
		
		int total_amount=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, total_amount);
		
		List<WebElement> pricelist=driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		
		int sum1=0;
		for(int j=0;j<pricelist.size();j++)
		{
			sum1=sum1+Integer.parseInt(pricelist.get(j).getText());
			
		}
		System.out.println(sum1);
		
	List<WebElement> courses_rows=	driver.findElements(By.xpath("//div[@class='left-align'] //table[@id='product']/tbody/tr"));
	System.out.println("No of rows present is" + courses_rows.size());
	//print 2 nd row
	System.out.print(driver.findElement(By.xpath("//table[@class='table-display']/tbody/tr[3]")).getText());
	List<WebElement> Column=driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr/th"));
	
	System.out.println("No of column present is" + Column.size());
		
	}

}
