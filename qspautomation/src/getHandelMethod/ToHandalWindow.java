package getHandelMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandalWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[2]/a[1]"));
	    System.out.println(driver.getTitle());
	    
	    Set<String> s = driver.getWindowHandles();
	    for (String i:s)
	    {
	    	String t = driver.switchTo().window(i).getTitle();
	    	System.out.println(t);
	    
	    if (t.contains("Buy 2350+ Rings Online | BlueStone.com - India's #1 Online Jewellery Brand"));
	    {
	    	driver.close();
	    }
	    }


	}

}
