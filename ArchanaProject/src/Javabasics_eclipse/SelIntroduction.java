package Javabasics_eclipse;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;


public class SelIntroduction {

	public static void main(String[] args) {
		

		
		
				
				//Invoking ChromeBrowser
				//Chrome =ChromeDriver -->Method close
				//FireFox=FirefoxDriver -->Method close
				//can implement both Webdriver methods + its own class (chromedriver class) methods)
				//Webdriver is an interface where all chrome,firefox ,edge classes should implement and
				//below code doesnt work in all other browser classes because of its own classes so use webdriver class
			//	ChromeDriver driver=new ChromeDriver();
				//Since we want only methods from Webdriver we should be writing code like below
				//selenium manager will invoke chrome browser
				
		//Chromedriver.exe-->invoke chrome browser
		    //	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			//	WebDriverManager.chromedriver().setup();
			/*	WebDriver driver=new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.close();  //closes current window
				driver.quit();   //closes all associated windows which opened by automation
				
				*/
				
				
				//Firefox driver
				
			/*	System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.36.0-win-aarch64\\geckodriver.exe");
				WebDriverManager.firefoxdriver().setup();
				WebDriver driver=new FirefoxDriver();
				WebDriverManager.firefoxdriver().setup();
				driver.get("https://rahulshettyacademy.com/");
            System.out.println(driver.getTitle());
             */
		
            //edge driver

            System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\edgedriver.exe");
			WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
			}

		


	}


