package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAccess {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://money.rediff.com/news");
	driver.manage().window().maximize();
	//sef 
	Thread.sleep(3000);
	//String text = driver.findElement(By.xpath("//span[contains(text(),'Rediff Moneywiz')]/self::span")).getText();
	//parent
	
	String text = driver.findElement(By.xpath("//span[contains(text(),'Rediff Moneywiz')]/parent::a")).getText();
	System.out.println(text);
	
	//child
	 List<WebElement> childs = driver.findElements(By.xpath("//span[contains(text(),'Rediff Moneywiz')]/ancestor::div/child::a"));
	 System.out.println("nub of child element "+childs.size());
	 
	 //Ancestor
	 text=driver.findElement(By.xpath("//span[contains(text(),'Rediff Moneywiz')]/ancestor::div[1]")).getText();
      System.out.println(text);
	}

}
