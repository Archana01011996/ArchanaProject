package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class CalendarTest {

	public static void main(String[] args) {
		
		String Month_number="6";
		String date="15";
		String year="2027";
   String[] expectedlist= {Month_number,date,year};
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()= '"+year+"']")).click();
		driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__year-view__months__month']")).get(Integer.parseInt(Month_number)-1).click();
        driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
       List<WebElement> lists= driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
       
       for(int i=0;i<lists.size();i++)
       {
    	   System.out.println(lists.get(i).getAttribute("value"));
    	   Assert.assertEquals(lists.get(i).getAttribute("value"), expectedlist[i]);
       }
       driver.close();
       
       
        
        
}
}

