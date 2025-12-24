package Javabasics_eclipse;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		 //implicit wait
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //this wait is for objects to show up
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("archana");
		driver.findElement(By.name("inputPassword")).sendKeys("73487hjds");
		driver.findElement(By.className("signInBtn")).click();
		//Thread.sleep(5000);  //this wait is fot app to be stable
		String Text=driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(Text);
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Archana");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("archana.jan01@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9880132379");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String Text2=driver.findElement(By.cssSelector("p.infoMsg")).getText();
	//	String Text2=driver.findElement(By.cssSelector("form p")).getText();  //using parent to child in css selector
		System.out.println(Text2);
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();  //can also use below xpath  //div/button  or   //div[@class='forgot-pwd-btn-conainer']/button[1]
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Archana");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");  //regular css expression
		driver.findElement(By.id("chkboxOne")).click();
		//driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click(); //regular expression for xpath

	}

}
