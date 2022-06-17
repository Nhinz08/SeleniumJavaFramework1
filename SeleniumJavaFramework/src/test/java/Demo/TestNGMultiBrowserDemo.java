package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {


	WebDriver driver = null; 
	String projectPath = System.getProperty("user.dir");
	
	@Parameters("browsername")
	@BeforeTest
	public void setup(String browserName) {
	System.out.println("Browser name is : "+browserName);
	System.out.println("Thread id : "+Thread.currentThread().getId());
	
	if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	else if(browserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", projectPath+"\\Drivers\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		driver = new FirefoxDriver();
		
	}
	//else if(browserName.equalsIgnoreCase("ie")) {
		//System.setProperty("webdriver.ie.driver", projectPath+"\\Drivers\\iedriver\\iedriver.exe");
		//WebDriver driver = new InternetExplorerDriver();
	}
	
	
	@Test
	public void test1() throws Exception {
		driver.get("https://google.com");
		Thread.sleep(4000);
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("Test Completed Successfully");
	}

}