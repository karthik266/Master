package letcode.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsObjects {

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
	
	

}
