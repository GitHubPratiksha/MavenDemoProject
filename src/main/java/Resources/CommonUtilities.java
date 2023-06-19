package Resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtilities {
	
	public static WebDriver driver;
	
	public void explicitwait(int duration, WebElement element ) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

}

