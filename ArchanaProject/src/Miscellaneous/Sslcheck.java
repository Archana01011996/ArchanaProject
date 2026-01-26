package Miscellaneous;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sslcheck {

	public static void main(String[] args) {
		
		
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		//adding extensions
		options.addExtensions(new File("//path/to/extension.crx"));
		
		//proxy
		Proxy proxy=new Proxy();
		proxy.setHttpProxy("myhttpproxy:3337");
		options.setCapability("proxy", proxy);
		//block popup window
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable=popup-blocking"));
		
		//for downloading file in specific place
		Map<String, Object> prefs=new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
		
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");																
		System.out.println(driver.getTitle());
		

	}

}
