package letcode.Testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import letcode.CommonAction.BrowserInitialize;
import letcode.Objects.DropdownObjects;
import letcode.Objects.InputObjects;

public class TcInputModule extends BrowserInitialize {

	@Test(priority = 1)
	public static void InputModule() {

		PageFactory.initElements(driver, InputObjects.class);
		InputObjects.InputModule.click();
		System.out.println("Landed On Input Module");
		PageBack();

	}

}
