package letcode.Testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import letcode.CommonAction.BrowserInitialize;

public class TcWindowsModule extends BrowserInitialize {
	
	
	@FindBy(linkText = "Tabs")
	public static WebElement windowbtn;
	@FindBy(xpath = "//button[@id='home']")
	public static WebElement openhomepagebtn;
	@FindBy(linkText = "Edit")
	public static WebElement editbtn;
	@FindBy(xpath = "//button[@id='multi']")
	public static WebElement multiplewindowbtn;
	
	@Test
	public void windowHandling() {
		
		PageFactory.initElements(driver, TcWindowsModule.class);
		TcWindowsModule.windowbtn.click();
		TcWindowsModule.openhomepagebtn.click();
		String parent  = driver.getWindowHandle();
		Set<String > s = driver.getWindowHandles();
		Iterator<String > i1 = s.iterator();
		
		String parentwindow =i1.next();
		String childwindow =i1.next();
		driver.switchTo().window(childwindow);
		TcWindowsModule.editbtn.click();
		driver.switchTo().window(parentwindow);
		TcWindowsModule.multiplewindowbtn.click();
		
		
		
		
		
		
		
	}

}
