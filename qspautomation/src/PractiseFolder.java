import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseFolder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();             //lunchChrome
		 driver.manage().window().maximize();             //Maxizimie size
		 // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 driver.get("https://www.google.com/");            //Opne Webpage
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER );    //Swict to active elemnt	
		 
		 /*Navigation nav= driver.navigate();   /// Navigate
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
		nav.refresh();
		driver.close();  */                 //Close the Browser
		 String currenturl = driver.getCurrentUrl();
		 System.out.println(currenturl);
		 
		
		 
		 
		 
		 
		 
		 
		 

	}

}
