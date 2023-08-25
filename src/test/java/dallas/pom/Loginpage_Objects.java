package dallas.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage_Objects {

	@FindBy(id = "i0116")
	public static WebElement Email;
	@FindBy(id = "idSIButton9")
	public static WebElement nextbtn;
	@FindBy(id = "passwordInput")
	public static WebElement password;
	@FindBy(id = "submitButton")
	public static WebElement signbtn;
	@FindBy(id = "idSIButton9")
	public static WebElement yesbtn;
	@FindBy(xpath = "//body/div[@id='root']/div[1]/section[1]/div[3]/div[2]/section[1]/div[1]/div[1]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]")
	public static WebElement Learningdb;
	
	@FindBy(xpath = "//i[contains(text(),'menu')]")
	public static WebElement Menuoptions;
	@FindBy(xpath = "//i[contains( text(),'filter_list')]")
	public static WebElement Filteroptions;
	@FindBy(xpath = "//body/div[@id='root']/div[1]/section[1]/div[4]/div[1]/section[1]/div[4]/div[2]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	public static WebElement Instructiondaysdropdown;
	

}
