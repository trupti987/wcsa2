package launchBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchInstagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(5000);
		driver.close();
	}

}
