package dallas.Tc;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import dallas.CommonActions.Common;
import dallas.pom.Peopleanddevices_Objects;

public class Tc_peopleanddevices extends Common {

	WebDriver driver;
@Test(dependsOnMethods="Login")
	public void peopleanddeviceslogin() throws InterruptedException, IOException {
		PageFactory.initElements(driver, Peopleanddevices_Objects.class);
		System.out.println("People and devices page started");
		Mouseover(driver);
//		
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//i[contains( text(),'menu')]")));
//		action.click().build().perform();
//		System.out.println("mousehover handled");
//		Thread.sleep(20000);
//		Peopleanddevices_Objects.PeopleanddevicesMenu.click();
//		Thread.sleep(20000);
//		WebElement l = Peopleanddevices_Objects.Peopleanddevicesheader;
//		String PageHeader = l.getText();
//		System.out.println(PageHeader);
		//Screenshot(driver);
		System.out.println("People and devices page ended");

	}

	
	public void PeopleAndDevicesActivity() throws InterruptedException, IOException {

		peopleanddeviceslogin();
		System.out.println("people and devices method executed");
	}
}
