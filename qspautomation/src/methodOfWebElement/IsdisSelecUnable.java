package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsdisSelecUnable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		/* WebElement loginButton = driver.findElement(By.name("signup1"));
		boolean status = loginButton.isDisplayed();
		System.out.println(status); */
		 WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		 WebElement pass =driver.findElement(By.xpath("//input[@id='pass']"));
		
		if (email.isDisplayed() && email.isEnabled())
		{
			email.sendKeys("trupti@123");
		}
		if (pass.isDisplayed() && pass.isEnabled())
		{
			pass.sendKeys("123");
		}
	
		//email.isDisplayed();
		
		
		
	}

}
