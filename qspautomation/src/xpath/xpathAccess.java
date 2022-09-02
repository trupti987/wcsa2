package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAccess {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers");
		
		
		//driver.get("https://money.rediff.com/index.html");
		//self 
		//String text = driver.findElement(By.xpath("//td[contains(text(),'Straits Times')]/self::td")).getTagName();
		//System.out.println(text);
		
	
		//parent
	  //text = driver.findElement(By.xpath("//td[contains(text(),'Straits Times')]/parent::tr")).getTagName();
		//System.out.println(text);
		
		//child
		 //List<WebElement> childs = driver.findElements(By.xpath("//td[contains(text(),'Straits Times')]/ancestor::tbody/child::tr"));
			//System.out.println("num of child element"+ childs.size());
		
			//ancsetor
			
			String text = driver.findElement(By.xpath("//a[contains(text(),'Indo Amines Limi')]/ancestor::tr")).getText();
			System.out.println(text);
			//des
			List<WebElement> descendant = driver.findElements(By.xpath("//a[contains(text(),'Indo Amines Limi')]/ancestor::tr/descendant::*"));
			 System.out.println(descendant.size());
	             
			 //following 
			 List<WebElement>followiing = driver.findElements(By.xpath("//a[contains(text(),'Indo Amines Limi')]/ancestor::tr/following::tr"));
			 System.out.println("num of size of"+followiing.size());
			 //following sibling
			 
			 List<WebElement>followiingsibling = driver.findElements(By.xpath("//a[contains(text(),'Indo Amines Limi')]/ancestor::tr/following-sibling::tr"));
				System.out.println("num of followingsibling:"+followiingsibling.size());
				
				//preceding
				 List<WebElement>preceding = driver.findElements(By.xpath("//a[contains(text(),'Indo Amines Limi')]/ancestor::tr/preceding::tr"));
					System.out.println("num of followingsibling:"+preceding.size());
					
					 List<WebElement>precedingsibling = driver.findElements(By.xpath("//a[contains(text(),'Indo Amines Limi')]/ancestor::tr/preceding-sibling::tr"));
						System.out.println("num of precedingsibling:"+precedingsibling.size());
			 
			 driver.close();
			 


	}

}
