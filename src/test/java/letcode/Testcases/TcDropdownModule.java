package letcode.Testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import letcode.CommonAction.BrowserInitialize;
import letcode.Objects.DropdownObjects;

public class TcDropdownModule extends BrowserInitialize {
	
	@FindBy(xpath = "//a[contains(text(),'Drop-Down')]")
	public static WebElement DropDownbutton;
	
	@FindBy(xpath = "//Select[@id='fruits']")
	public static  WebElement Dropdownlocator;

	@Test(priority = 2)
	public void dropdownSelection() {

		PageFactory.initElements(driver, TcDropdownModule.class);
		try {
			TcDropdownModule.DropDownbutton.click();
			dropdownByText(TcDropdownModule.Dropdownlocator, "Apple");
			// BrowserInitialize.PageBack();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
