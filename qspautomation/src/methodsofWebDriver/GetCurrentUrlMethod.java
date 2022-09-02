package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//1
		driver.manage().window().maximize();
		 driver.get("https://www.selenium.dev/");//2
		 
		 String currentUrl = driver.getCurrentUrl();//3
		 System.out.println(currentUrl);

	}

}
