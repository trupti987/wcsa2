package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("file:///C:/Users/LENOVO/Desktop/Alert.html");
		  driver.findElement(By.xpath("//button[.='Try it']")).click();
		  Thread.sleep(2000);
		  Alert al=driver.switchTo().alert();
		  al.accept();                                         //or else Dismiss
		                                                      /// driver.close();   to close the browser 

	}

}