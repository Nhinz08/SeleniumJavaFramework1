package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.selenium.Eyes;

public class ApplitoolsDemo {
	
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		Eyes eyes = new Eyes();
		
	}
	

}
