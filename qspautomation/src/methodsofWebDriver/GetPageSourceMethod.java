package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("file:///C:/Users/LENOVO/Desktop/HTML%20DOCUMENT/button.html");
		 String sourceCodehtml=driver.getPageSource();
		 System.out.println(sourceCodehtml);
	}

}
