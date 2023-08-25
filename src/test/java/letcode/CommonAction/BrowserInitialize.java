package letcode.CommonAction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserInitialize {
	public static WebDriver driver;
	public Properties prop;

	public void PropertyFile() throws IOException {
		String Filepath = "C:\\Users\\KARTHIK\\eclipse-Dallas\\Dallas\\src\\test\\java\\letcode\\configurationfile\\Configclass.properties";
		prop = new Properties();
		FileInputStream Fis = new FileInputStream(Filepath);
		prop.load(Fis);
	}

	@BeforeSuite
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
		driver.findElement(By.xpath("//*[contains(text(),'Work-Space')]")).click();
	}

	public void Pagerefresh() {
		driver.navigate().refresh();
	}

	public static void PageBack() {

		driver.navigate().back();
	}

	@AfterSuite
//	public static void Close() {
//		driver.close();
//	}
	
	public static void switchtochildwindow() {
		
		driver.switchTo().window(null);
		
	}

	public static void frameSwitchByIndex(WebElement element) {

		driver.switchTo().frame(element);

	}

	public static void dropdownByText(WebElement element, String text) {

		Select select = new Select(element);
		select.selectByVisibleText(text);

	}

	public static void dropdownByIndex(WebElement element, int index) {

		Select select = new Select(element);
		select.selectByIndex(index);

	}

	public static void alertsaccept(WebElement element) {

		driver.switchTo().alert().accept();
	}

	public static void alertsDismiss(WebElement element) {
		driver.switchTo().alert().dismiss();

	}

	public static void alertsSendkeys(String text) {
		driver.switchTo().alert().sendKeys(text);

	}

}
