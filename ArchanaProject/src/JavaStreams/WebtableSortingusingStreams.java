package JavaStreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebtableSortingusingStreams {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on column
		driver.findElement(By.xpath("//th[@role='columnheader'][1]")).click();
		//capture all webelemets into list
		
		List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));
		
		//capture text of all webelements into new (original)list
		List<String> originalList=veggies.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort the original list of step 3
	List<String>  sortedList=	originalList.stream().sorted().collect(Collectors.toList());
	
	Assert.assertTrue(originalList.equals(sortedList));
	
	//Scan the name column with getText -->Rice then print price of rice
	List<String> price;
	do {
		List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
	
 price=	rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
 price.forEach(s->System.out.println(s));
	if(price.size()<1)
	{
		driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
	}
	

	}while(price.size()<1);
	}

	private static String getPriceVeggie(WebElement s) {
		
	String	Pricevalue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return Pricevalue;
	}

}
