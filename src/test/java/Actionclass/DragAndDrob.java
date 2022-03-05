package Actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrob {

public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("https://demoqa.com/droppable");
	
	WebElement firstEle = driver.findElement(By.id("draggable"));
	WebElement secondEle = driver.findElement(By.id("draggable"));
	
	Thread.sleep(2000);
	
	Actions act = new Actions (driver);
	act.dragAndDrop(firstEle, secondEle).build().perform();
	
	Thread.sleep(2000);
	
	driver.quit();
	
	
	
	
	
	
	
	
	
}
}