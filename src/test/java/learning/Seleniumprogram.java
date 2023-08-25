package learning;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumprogram {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		Thread.sleep(2000);
		
		
//		WebElement dropdownvalues = driver.findElement(By.xpath("//Select[@id='fruits']"));
//		Select select = new Select(dropdownvalues);
//		//select.selectByIndex(1);
//		select.selectByVisibleText("Apple");
				
		//driver.findElement(By.xpath("//button[@id='home']")).click();

//		Set<String> Allwindows = driver.getWindowHandles();
//		// System.out.println(parentwindow);
//
//		Iterator<String> i1 = Allwindows.iterator();
//		String parentwindow = i1.next();
//		String childwindow = i1.next();
//		driver.switchTo().window(childwindow);
//
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[contains(text(),'Drop-Down')]")).click();
//
//		Select S1 = new Select(driver.findElement(By.xpath("//select[@id='fruits']")));
//
//		List<WebElement> dropdownoptions = S1.getOptions();
//
//		for (int i = 0; i < dropdownoptions.size(); i++) {
//
//			if (dropdownoptions.get(i).getText().contains("Apple")) {
//
//				dropdownoptions.get(i).click();
//				break;
//			}
//			
//
//		}
//		Allwindows.clear();
		//driver.close();
//		driver.switchTo().window(parentwindow);
//		driver.findElement(By.xpath("//button[@id='multi']")).click();
//		
//		Set<String > Alwindows = driver.getWindowHandles();
//		
//		Iterator<String> i = Alwindows.iterator();
//		String multiparentwindow = i.next();
//		String MultiCildWindow1 = i.next();
//		driver.switchTo().window(MultiCildWindow1);
		

	}

}
