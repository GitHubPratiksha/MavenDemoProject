package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SearchObjectModel {
	
	public WebDriver driver; 

	public SearchObjectModel(WebDriver driver2) {
		this.driver = driver2;
		
	}
	
	By search1 = By.xpath("//div[@id='search']");
	
	
	public WebElement search1() {
		
		return driver.findElement(search1);
	}


	public Object EntersearchIPhone() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
