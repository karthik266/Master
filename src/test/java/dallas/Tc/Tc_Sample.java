package dallas.Tc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc_Sample {

	static WebDriver driver;

	@Test
	public void browser() throws InterruptedException, IOException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);

		driver.get("https://letcode.in/dropdowns");
		//WebElement dd =driver.findElement(By.xpath("//select[@id='fruits']"));
		//Select fruit = new Select(dd);
		//fruit.selectByValue("Apple");
		
		/*
		 * List<WebElement> allvalues =
		 * driver.findElements(By.xpath("//select[@id='fruits']//Option"));
		 * System.out.println(allvalues.size()); for(int i = 0 ; i<=allvalues.size() ;
		 * i++) { System.out.println(allvalues.get(i).getText());
		 * 
		 * if(allvalues.get(i).getText().equalsIgnoreCase("Apple")) {
		 * allvalues.get(i).click(); } }
		 */
		WebElement dd = driver.findElement(By.xpath("//select[@id='fruits']"));
		
		List<WebElement> fruits =  driver.findElements(By.xpath("//select[@id='fruits']//Option"));
	
	

		for (WebElement fr : fruits) {
			
			System.out.println(fr.getText());

			if (fr.getText().equalsIgnoreCase("Mango")) {
				fr.click();
				//System.out.println("" + fr.getText());
				break;
			}

		}
		Select select = new Select(dd);
		select.getAllSelectedOptions();
		System.out.println();
		
		System.out.println("dropdown clicked");
		driver.findElement(By.xpath("//Select[@id='superheros']")).click();
		

		/*
		 * // String Mainwindow = driver.getWindowHandle(); Set<String> Allwindow =
		 * driver.getWindowHandles(); System.out.println(Allwindow); List<String> list =
		 * new ArrayList<String>(Allwindow); driver.switchTo().window(list.get(0));
		 * String curl = driver.getCurrentUrl(); System.out.println(curl);
		 */

		/*
		 * driver.findElement(By.xpath("//textarea[@id='APjFqb']")).
		 * sendKeys("online stop watch"); driver.findElement(By.xpath(
		 * "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).
		 * click(); Thread.sleep(10000);
		 * driver.findElement(By.xpath("//span[contains (text(),'Start')]")).click();
		 * driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		 * driver.findElement(By.xpath("//span[contains (text(),'Stop')]")).click();
		 */

		// handledropdown();
	}

	public static void Screenshot(WebDriver driver) throws IOException {

		Date CurrentDate = new Date();
		String ScreenShotName = CurrentDate.toString().replace(":", "-").replace(" ", "-");

		File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot,
				new File("C:\\\\Users\\\\KARTHIK\\\\Documents\\Dallas" + ScreenShotName + ".png"));
		System.out.println("screenshot saved in local folder");
	}

//Select dropdown
	public static void handledropdown() {
		Select sc = new Select(driver.findElement(By.id("fruits")));
		sc.selectByValue("2");
		Select sc1 = new Select(driver.findElement(By.id("superheros")));
		sc1.selectByIndex(2);
		Select sc3 = new Select(driver.findElement(By.id("lang")));
		sc3.selectByVisibleText("Swift");
	}

}

/*
 * Thread.sleep(5000); String CU = driver.getCurrentUrl();
 * System.out.println(CU); driver.manage().window().maximize();
 * 
 * driver.findElement(By.id("i0116")).sendKeys("RLMSSO@dallasisd.org");
 * driver.findElement(By.id("idSIButton9")).click(); Thread.sleep(10000);
 * driver.findElement(By.id("passwordInput")).sendKeys("Inn!v32023");
 * driver.findElement(By.id("submitButton")).click(); Thread.sleep(5000);
 * driver.findElement(By.id("idSIButton9")).click(); Thread.sleep(30000); //new
 * WebDriverWait(WebDriver,
 * 20).until(ExpectedConditions.elementToBeClickable(By.
 * xpath("//span[@class='select2-results']//li[contains(., 'User Name')]"))).
 * click(); // String // Digital_btn=
 * "//body/div[@id='root']/div[1]/section[1]/div[3]/div[2]/section[1]/div[1]/div[1]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]";
 * driver.findElement(By.xpath(
 * "//body/div[@id='root']/div[1]/section[1]/div[3]/div[2]/section[1]/div[1]/div[1]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]"
 * )) .click(); Thread.sleep(20000); String pageheader =
 * driver.findElement(By.xpath("//h1[contains(text(),'At a Glance')]")).getText(
 * ); System.out.println(pageheader); System.out.println("completed"); Actions
 * action = new Actions(driver); action.moveToElement(driver.findElement(By.
 * xpath("//i[contains( text(),'menu')]"))); action.click().build().perform();
 * System.out.println("mousehover");
 */
//		Select select = new Select(driver.findElement(By.xpath(
//				"//body/div[@id='root']/div[1]/section[1]/div[4]/div[1]/section[1]/div[4]/div[2]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")));
//
//		select.selectByIndex(1);

//		    	List<WebElement> opt = driver.findElements((By.xpath("//div[contains(text(),'Instructional Days')]")));
//		    	for(WebElement we : opt) {
//		    		String name = we.getText();
//		    	}
// driver.findElement(By.xpath("//div[contains(text(),'Elementary
// School')]")).click() ;

// driver.findElement(By.xpath("//div[contains(text(),'All')]")).click() ;
//		   WebElement dropdown  =  driver.findElement(By.xpath("//button[contains(text(),'Apply')]"));
//		   dropdown.click();
//		   dropdown.getText();
// driver.wait(20000);

// driver.findElement(By.xpath("//div[contains(text(),'People and
// Devices')]")).click();
// Assert.assertEquals(false, null);

// driver.close();
