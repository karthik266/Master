package dallas.Tc;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import dallas.CommonActions.Common;
import dallas.pom.Activity_Analysis_Objects;
import dallas.pom.Ataglance_Objects;
import dallas.pom.Loginpage_Objects;
import dallas.pom.Peopleanddevices_Objects;

public class Tc_Login_Page extends Common {

	@Test
	//(priority = 0)
	public void Login() throws InterruptedException, IOException {

		PageFactory.initElements(driver, Loginpage_Objects.class);
		Loginpage_Objects.Email.sendKeys(prop.getProperty("username"));
		Loginpage_Objects.nextbtn.click();
		Loginpage_Objects.password.sendKeys(prop.getProperty("password"));
		Loginpage_Objects.signbtn.click();
		Loginpage_Objects.yesbtn.click();
		Loginpage_Objects.Learningdb.click();
		
		System.out.println("Login Success");


	}

	/*
	 * @Test //(priority = 1) public void AtaGlancePage() throws
	 * InterruptedException, IOException {
	 * 
	 * PageFactory.initElements(driver, Ataglance_Objects.class);
	 * System.out.println("At a glance page started "); Thread.sleep(20000);
	 * Screenshot(driver); }
	 * 
	 * @Test //(priority = 2) public void PeopleAndDevices() throws
	 * InterruptedException, IOException {
	 * 
	 * PageFactory.initElements(driver, Peopleanddevices_Objects.class);
	 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 * Mouseover(driver); Thread.sleep(20000);
	 * Peopleanddevices_Objects.PeopleanddevicesMenu.click(); Thread.sleep(20000);
	 * Screenshot(driver); WebElement l =
	 * Peopleanddevices_Objects.Peopleanddevicesheader; String PageHeader =
	 * l.getText(); System.out.println(PageHeader); Screenshot(driver);
	 * System.out.println("People and devices page Completed"); }
	 * 
	 * @Test //(priority = 3) public void ActivityAnalysis() throws
	 * InterruptedException {
	 * 
	 * PageFactory.initElements(driver, Activity_Analysis_Objects.class);
	 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 * Mouseover(driver); Thread.sleep(20000);
	 * Activity_Analysis_Objects.ActivityAnalaysisbtn.click();
	 * 
	 * }
	 */
	// @Test(priority =2)
//	public void Loginsuccess() throws InterruptedException, IOException {
//
//		Login();
//		AtaGlancePage();
//		PeopleAndDevices();		
//
//	}
}
