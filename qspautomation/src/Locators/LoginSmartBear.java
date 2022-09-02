package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSmartBear {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://community.smartbear.com/t5/user/userloginpage");
		driver.findElement(By.id("profilecustom_email")).sendKeys("admin");
		driver.findElement(By.id("lia-password")).sendKeys("manager");
		driver.findElement(By.name("submitContext")).click();

	}

}
