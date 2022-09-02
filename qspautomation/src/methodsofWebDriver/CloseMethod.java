package methodsofWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://omayo.blogspot.com/");
		  driver.findElement(By.linkText("Open a popup window")).click();
		  Thread.sleep(3000);
		  driver.close();// it close only the parent browser
		  
		  }
}
