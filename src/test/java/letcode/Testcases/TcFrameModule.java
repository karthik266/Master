package letcode.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import letcode.CommonAction.BrowserInitialize;

public class TcFrameModule extends BrowserInitialize {

	@FindBy(linkText = "Inner HTML")
	public static WebElement framebtn;
	@FindBy(xpath = "//input[@name='fname']")
	public static WebElement firstname;
	@FindBy(xpath = "//input[@name='lname']")
	public static WebElement lastname;

	@Test
	public static void frameHandlings() {

		PageFactory.initElements(driver, TcFrameModule.class);
		TcFrameModule.framebtn.click();
		driver.switchTo().frame(0);
		TcFrameModule.firstname.sendKeys("karthik");
		TcFrameModule.lastname.sendKeys("S");
		//driver.switchTo().frame(2);

	}

}
