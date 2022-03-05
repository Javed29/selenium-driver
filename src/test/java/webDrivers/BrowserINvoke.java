package webDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserINvoke {
	
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedrive.exe");

	      WebDriver driver = new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      
	      driver.get("https://www.google.co.in");
	     
	      driver.quit();
		}
		
		  
	}


