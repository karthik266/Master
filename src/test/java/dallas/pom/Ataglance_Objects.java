package dallas.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ataglance_Objects {

	@FindBy(xpath = "//i[contains(text(),'menu')]")
	public static WebElement Menuoptions;
	@FindBy(xpath = "//i[contains( text(),'filter_list')]")
	public static WebElement Filteroptions;
	@FindBy(xpath = "")
	public static WebElement Instructiondaysdropdown;
	@FindBy (xpath = "//button[contains(text(),'Apply')]")
	public static WebElement Applybtn;
	@FindBy (xpath = "//button[contains(text(),'Reset')]")
	public static WebElement Resetbtn;
	@FindBy(xpath = "//div[contains(text(),'Elementary School')]")
	public static WebElement Schtype_Elementaryschool;
	@FindBy(xpath = "//h1[contains(text(),'At a Glance')]")
	public static WebElement AtaglancePageheader;
	
	
	
	
	

}
