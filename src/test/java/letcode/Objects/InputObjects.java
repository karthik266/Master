package letcode.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputObjects {
	
	@FindBy(xpath = "//a[contains(text(),'Edit')]")
	public static WebElement InputModule;
	
	@FindBy(xpath = "//a[contains(text(),'Drop-Down')]")
	public static WebElement DropDownbutton;
	
	@FindBy(xpath = "//Select[@id='fruits']")
	public static  WebElement Dropdownlocator;


}
