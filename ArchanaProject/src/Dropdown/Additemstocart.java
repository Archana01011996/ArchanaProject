package Dropdown;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.*;



public class Additemstocart {

	public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Explicit wait
  // WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(30));
	
		String[] names = {"Cucumber","Brocolli","Beetroot","Carrot"}; //specifcy which all products needed to put into cart
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
	   additems(driver,names); //this is called utility (additems utility)(where it accepts array of items and maintains everything)
	   driver.findElement(By.cssSelector("img[alt='Cart']")).click();
	  System.out.println(driver.findElement(By.xpath("//p[text()='Brocolli - 1 Kg']")).isDisplayed());
	   System.out.println(driver.findElement(By.xpath("//p[text()='Cucumber - 1 Kg']")).isDisplayed());
	   System.out.println(driver.findElement(By.xpath("//p[text()='Carrot - 1 Kg']")).isDisplayed());
	   driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	// w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
	   driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
	   driver.findElement(By.cssSelector(".promoBtn")).click();
	   //EXPLICIT WAIT

	//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
	   System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
	   
}

public static void additems(WebDriver driver,String[] names)
{
	int j=0;
	List<WebElement> productsList=driver.findElements(By.cssSelector("h4.product-name")); //get productslist
	// iterate over productslist to get each items index and store it and meanwhile split and trim the returned text
	for(int i=0;i<productsList.size();i++)
	{
		
		String[] name=productsList.get(i).getText().split("-");	//lets split cucumber -1 kg
		String formattedString=name[0].trim();   //trim method teims white space  
		
		//format is to get actual vegetable text
		//CONVERT ARRAY TO ARRAYLIST to easy search
	
	List mylist=Arrays.asList(names);
	//check if arraylist has required items to be added to cart and if it is present then add them to cart
  
	if(mylist.contains(formattedString))
		   {
	   driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
	   //3 times
	   j++;
	   if(j==names.length)
	   {
		   break;
	   }
	   
		   }
	}
	

}}
