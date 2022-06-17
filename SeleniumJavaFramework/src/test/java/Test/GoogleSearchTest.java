package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPage;



public class GoogleSearchTest {
	
	public static WebDriver driver = null;

	public static void main(String[] args) {
		googleSearch();
		
	}
	
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//goto.goole.com
		driver.get("https://google.com");
		
		//enter text in search
		//driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation Step by Step");
		
		//click on search button
		//driver.findElement(By.id("t")).click();
		//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		
		//close browser
		driver.close();
		
		System.out.println("Test Completed Successfully");
		
		
	}
}
