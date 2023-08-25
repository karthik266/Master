package letcode.Testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import letcode.CommonAction.BrowserInitialize;
import letcode.Objects.AlertsObjects;

public class TcAlertsModule extends BrowserInitialize {
	
	@FindBy(xpath = "//a[contains(text(),'Dialog')]")
	public static WebElement alertsbutton;

	@FindBy(xpath = "//button[@id='accept']")
	public static WebElement simplealert;
	
	@FindBy(xpath = "//button[@id='confirm']")
	public static WebElement confirmalert;
	
	@FindBy(xpath = "//button[@id='prompt']")
	public static WebElement promptalert;
	
	@FindBy(xpath = "//button[@id='modern']")
	public static WebElement modernalert;
    
	@Test
	public void AlertsHandling() {

		PageFactory.initElements(driver, TcAlertsModule.class);
		TcAlertsModule.alertsbutton.click();
		TcAlertsModule.simplealert.click();
		alertsaccept(AlertsObjects.simplealert);
		TcAlertsModule.confirmalert.click();
		alertsDismiss(AlertsObjects.confirmalert);
		TcAlertsModule.promptalert.click();
		alertsSendkeys("java is a programing language");
		alertsaccept(AlertsObjects.promptalert);
		
	}
}
