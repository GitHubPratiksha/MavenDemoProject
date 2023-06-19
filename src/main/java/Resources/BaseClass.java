package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	

	public WebDriver driver;
	public Properties prop;
	public void DriverInitialization() throws IOException {
		
		FileInputStream fs= new FileInputStream(System.getProperty(("user+dir")+"\\src\\main\\java\\Resources\\Data.properties"));
		
		//for accessing data properties
		prop= new Properties();
		
		//loading files which is already read
		prop.load(fs);
		
		String browserName= prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup(); // to run with udpated version of the browser
			driver=  new ChromeDriver();  
		
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\dixit\\OneDrive\\Desktop\\FireFoxDriver\\geckodriver-v0.32.0-win64\\geckodriver.exe");

		    driver = new FirefoxDriver(); 
		}
		else {
			
			System.out.println("browser value not found");
		}
		
		
				
	}
	
	@BeforeMethod
	public void launchURL() throws IOException {
		
		DriverInitialization();
		String url= prop.getProperty("url");
		driver.get(url);
		
	}
	

		

}
