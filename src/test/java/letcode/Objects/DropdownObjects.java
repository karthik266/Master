package letcode.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import letcode.CommonAction.BrowserInitialize;

public class DropdownObjects {

	
	
	@FindBy(xpath = "//a[contains(text(),'Drop-Down')]")
	public static WebElement DropDownbutton;
	
	@FindBy(xpath = "//Select[@id='fruits']")
	public static  WebElement Dropdownlocator;

}
