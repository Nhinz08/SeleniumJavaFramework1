package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		googleSearch();
		
	}
	
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//goto.goole.com
		driver.get("https://google.com");
		
		//enter text in search
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");

		//click on search button
		//driver.findElement(By.id("t")).click();
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		
		//close browser
		driver.close();
		
		System.out.println("Test Completed Successfully");
		
		
	}
}
