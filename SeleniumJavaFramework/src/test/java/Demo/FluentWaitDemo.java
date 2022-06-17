package Demo;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {
	
	static String projectPath = System.getProperty("user.dir");
	
	public static void main(String[] args) throws Exception {
		test();	
	}
	
	public static void test() throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver",projectPath+ "/Drivers/Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Abcd");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		//driver.findElement(By.linkText("ABCD Alphabet Songs For Kids 4+ - App Store")).click();
		
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30))
		       .pollingEvery(Duration.ofSeconds(30))
		       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		      WebElement linkElement= driver.findElement(By.linkText("ABCD Alphabet Songs For Kids 4+ - App Store"));
		       
		      if(linkElement.isEnabled()) {
		    	  
		    	  System.out.println("Element Found");
		      }
		       return linkElement;
		     }
		   });
		   
		   element.click();
	}

		
	
	
		//Thread.sleep(3000);
		//driver.close();
		//driver.quit();



}
