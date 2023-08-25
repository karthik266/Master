package learning;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {
	static WebDriver driver;

	public static void main(String[] args) {
		System.out.println("output");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		driver.get("https://letcode.in/dropdowns");
		DropDownWithoutSelectClass();
		
		
	}

	public static void DropDownWithoutSelectClass() {

		driver.findElement(By.xpath("//select[@id='fruits']")).click();

		List<WebElement> fruits = driver.findElements(By.xpath("//select[@id='fruits']//option"));
		for (WebElement fr : fruits) {
		
			System.out.println(fr.getText());

			if (fr.getText().equals("Apple")) {

				fr.click();
			}

		}
		WebElement ouputText = driver.findElement(By.xpath("//p[@class='subtitle']"));
		System.out.println(ouputText.getText());
	}

}
