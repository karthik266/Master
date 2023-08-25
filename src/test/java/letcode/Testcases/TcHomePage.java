package letcode.Testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import letcode.CommonAction.BrowserInitialize;
import letcode.Objects.HomePageObjects;

public class TcHomePage extends BrowserInitialize {
	
	
     @Test(priority = 0)
	public void InputBlock() {

		PageFactory.initElements(driver, HomePageObjects.class);
		HomePageObjects.Workspace.click();
	
	
	
	

	}

}
