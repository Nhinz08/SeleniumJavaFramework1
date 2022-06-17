package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo2 {
	
	WebDriver driver = null;
	
	@BeforeTest

	public void setUpTest () {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void googleSearch2() {
		
		
		//goto.goole.com
		driver.get("https://google.com");
		
		//enter text in search
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");

		//click on search button
		//driver.findElement(By.id("t")).click();
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);	
		
	}		
		
		@Test
		public void googleSearch3() {
			
			
			//goto.goole.com
			driver.get("https://google.com");
			
			//enter text in search
			driver.findElement(By.name("q")).sendKeys("Automation Step by Step");

			//click on search button
			//driver.findElement(By.id("t")).click();
			driver.findElement(By.name("q")).sendKeys(Keys.RETURN);		

		
		
	}
	
	
	@AfterTest
	public void tearDownTest() {
		
		//close browser
				driver.close();
				driver.quit();
				System.out.println("Test Completed Successfully");

		
	}
	
}
