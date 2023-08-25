package dallas.CommonActions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Common {
	public WebDriver driver;
	public Properties prop;

	public void PropertyFile() throws IOException {
		String Filepath = "C:\\Users\\KARTHIK\\eclipse-Dallas\\Dallas\\src\\test\\java\\dallas\\Configfile\\Config.properties";
		prop = new Properties();
		FileInputStream Fis = new FileInputStream(Filepath);
		prop.load(Fis);
	}

	@BeforeSuite(alwaysRun = true)
	public void launchBrowser() throws IOException {
		PropertyFile();
		String Url = prop.getProperty("url");
		String browser = prop.getProperty("browser");
		
		if (browser.equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);

		} else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	public void Screenshot(WebDriver driver) throws IOException {

		Date CurrentDate = new Date();
		String ScreenShotName = CurrentDate.toString().replace(":", "-").replace(" ", "-");

		File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot,
				new File("C:\\\\Users\\\\KARTHIK\\\\Documents\\Dallas" + ScreenShotName + ".png"));
		System.out.println("screenshot saved in local folder");

	}
	
	public void Mouseover(WebDriver driver) {
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//i[contains( text(),'menu')]")));
		action.click().build().perform();
		System.out.println("mousehover handled");
	}

	@AfterSuite
	public void teardown() {
//		driver.quit();
	}

}
