package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("confirmBtn")).click();
		WebElement target = driver.findElement(By.xpath("//a[.='All Jewellery ' and @title='Jewellery']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[.='Kadas']")).click();

	}

}
