package dallas.Tc;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import dallas.CommonActions.Common;
import dallas.pom.Ataglance_Objects;

public class Tc_Ataglance extends Common {
	@Test
	//(dependsOnMethods = "dallas.Tc.dallas.Tc.Login")
	public void Menuclick() throws InterruptedException, IOException  {

		PageFactory.initElements(driver, Ataglance_Objects.class);
		System.out.println("At a glance page started ");
		Thread.sleep(20000);
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.SECONDS);
		Mouseover(driver);
		Screenshot(driver);
		
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//i[contains( text(),'menu')]")));
//		action.click().build().perform();
//		System.out.println("mousehover handled");
		//Screenshot(driver);
//		WebElement  p = Ataglance_Objects.AtaglancePageheader;
//		String Ataglancepageheader = p.getText();
//		String ExpectedAtaglancepageheader = "At a Glance";
//		System.out.println(Ataglancepageheader);
//		Assert.assertEquals(Ataglancepageheader, ExpectedAtaglancepageheader);
		System.out.println("menu clicked");

	}

	
//	public void Menu() throws InterruptedException  {
//		
//		Menuclick();
//		System.out.println("Menu method executed");
//
//	}

}
