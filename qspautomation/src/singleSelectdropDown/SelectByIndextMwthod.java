package singleSelectdropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndextMwthod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("file:///C:/Users/LENOVO/Desktop/HTML%20DOCUMENT/singleselectdropdown.html");
		  Thread.sleep(3000);
		  WebElement ssdropdown = driver.findElement(By.id("menu"));
		  Select sel=new Select (ssdropdown);
		  sel.selectByIndex(4);
		  

	}

}
