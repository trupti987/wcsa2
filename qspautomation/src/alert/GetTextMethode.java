package alert;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethode {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		  driver.get("file:///C:/Users/LENOVO/Desktop/confirmation.html");
		  driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
		  Thread.sleep(2000);
		  
		  
		  Alert al=driver.switchTo().alert();
		  // al.dismiss();  
		  al.accept();  
		  String text = al.getText();
		  System.out.println(text);
		  
		  
	}

}




