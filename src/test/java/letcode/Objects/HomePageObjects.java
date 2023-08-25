package letcode.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects {
	
	
	@FindBy(xpath = "//*[contains(text(),'Work-Space')]")
	public static  WebElement Workspace;
	@FindBy (xpath = "//*[contains(text(),'Courses')]")
	public static WebElement Courses;
	
	
	

}
