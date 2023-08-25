package learning;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webtable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();	
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("irctc"+Keys.ENTER);
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'IRCTC Next Generation ...')]"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).moveToElement(link).click().perform();
//		Set<String> Allwindow = driver.getWindowHandles();
//		System.out.println(Allwindow);
		ArrayList<String> childwindow = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(childwindow.get(1));
		
		System.out.println(driver.getCurrentUrl());
		
		
		
		
//		 WebElement Searchbtn =  driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
//		 Searchbtn.sendKeys("irctc");
//		 
//		String Enterkeys = Keys.chord(Keys.ENTER);
//		Searchbtn.sendKeys(Enterkeys);
//		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'IRCTC Next Generation ...')]"));
//		
//		Actions action = new Actions(driver);
//		action.contextClick(link).build().perform();
//		//action.sendKeys(Keys.ARROW_DOWN).perform();
//	
//		String newtab = Keys.chord(Keys.ARROW_DOWN.chord(Keys.ARROW_DOWN.chord(Keys.ARROW_DOWN.chord(Keys.ENTER))));
//		link.sendKeys(newtab);
		//action.build().perform();
		
		
		System.out.println("succes");
	
		
		
		
		
		
		
		
	
		
		//driver.findElement(By.xpath("//h3[contains(text(),'IRCTC Next Generation eTicketing System')]")).click();
		
		
//		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
//		Set <String > Homewindow = driver.getWindowHandles();
//		//System.out.println(Homewindow);
//		List<String> Allwindows = new ArrayList<String>(Homewindow);
//		driver.switchTo().window(Allwindows.get(1));
//		System.out.println(driver.getCurrentUrl());
		
	
		
		
		
		
		
		
		
		
//		int rows = driver.findElements(By.xpath("//tbody//tr")).size();
//		int cols = driver.findElements(By.xpath("//thead//tr//th")).size();
//		System.out.println("No of Rows " + rows);
//		System.out.println("No of Columns " + cols);
//		
//		for(int r =1 ; r<=rows ;r++) {
//			
//			String Country = driver.findElement(By.xpath("//tbody//tr["+r+"]//td[3]")).getText();
//			
//			if(Country.equals("United Kingdom")) {
//				
//				String university = driver.findElement(By.xpath("//tbody//tr["+r+"]//td[2]")).getText();
//				System.out.println(university);
//			}
//			
//			
//		}
//		
//		//to print all data
//		
//		for(int r =1 ; r<=rows ; r++) {
//			
//			
//			for(int c =1 ;c<=cols ; c++) {
//				String data = driver.findElement(By.xpath("//tbody//tr["+r+"]//td["+c+"]")).getText();
//				System.out.println(data);
//			}
//		}
//		
		
		
		
		//driver.quit();
		
	}

}
