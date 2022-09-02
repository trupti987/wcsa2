package getHandelMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/"); //parent window
		//getWindowhandle
		
		//String WindowID = driver.getWindowHandle(); //return single windows id 
		//System.out.println(WindowID);            //CDwindow-31B5E0FC919D5C9CB83E5CE8B9B703A8 (geting id and the its changes all the time)
		
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();  // child window
		
		Set<String> WindowIDs= driver.getWindowHandles(); //returns  window id of multiple browser
		
		// frist method iterator
		 // 2nd method is arylist method /listmethod
		       List <String> WindowsIDslist=new ArrayList(WindowIDs);
		       String parentWindowID = WindowsIDslist.get(0);
		       String childWindowID = WindowsIDslist.get(0);
		       System.out.println("parentwindowID"+ parentWindowID );
		       System.out.println("parentwindowID"+ childWindowID );
		
		//getWindowhandles
	

	}

	private static void iterator() {
		// TODO Auto-generated method stub
		
	}

}
