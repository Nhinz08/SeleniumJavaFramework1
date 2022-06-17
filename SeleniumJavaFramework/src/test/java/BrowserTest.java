import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserTest {

	public static void main(String[] args) throws Exception {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
		
	
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", projectPath+"\\Drivers\\geckodriver\\geckodriver.exe");
		//System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.edge.driver",projectPath+//[@id="input"] "\\Drivers\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();	
				
		driver.get("http://google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
		
		
		List<WebElement> listOfElements = driver.findElements(By.xpath("//input"));

		int count = listOfElements.size();
		
		System.out.println("Count of Input elements : "+count);
		
		//WebElement textBox = driver.findElement(By.name("q"));
		//textBox.sendKeys("Automation Step by step");
		//textBox.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		//driver.quit();
		//driver.close();
		
	}
	
}
