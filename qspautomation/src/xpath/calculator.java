package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calculator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net");
		driver.findElement(By.xpath("//span[@onClick='r(1)' and .='1']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='sciop' and .='+']")).click();
		
		
		driver.findElement(By.xpath("//span[@onClick='r(2)' and .='2']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		Thread.sleep(1000);
		
		String result = driver.findElement(By.id("sciOutPut")).getText();
		System.out.println(result);
		
		driver.navigate().refresh();
		
	}

}
