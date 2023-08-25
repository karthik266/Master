package dallas.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Peopleanddevices_Objects {

	
	@FindBy(xpath = "//div[contains(text(),'People and Devices')]")
	public static  WebElement PeopleanddevicesMenu;
	
	@FindBy(xpath = "//h1[contains(text(),'People and Device')]")
	public static WebElement Peopleanddevicesheader;
	
}
