package methodOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/HTML%20DOCUMENT/checkbox.html");
		Thread.sleep(3000);
		WebElement automationCheckBox = driver.findElement(By.id("automation"));
		automationCheckBox.click();
		boolean status = automationCheckBox.isSelected();
		System.out.println(status);

	}

}
