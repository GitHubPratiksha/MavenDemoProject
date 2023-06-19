package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.CartObjectModel;
import PageObjectModel.SearchObjectModel;
import Resources.BaseClass;
import Resources.Constants;

public class VerifyAddToCart {
	
	public class Cart extends BaseClass {

		@Test
		public void CartMethod() throws IOException {
		
		
			
			SearchObjectModel obj= new SearchObjectModel(driver);
			obj.EntersearchIPhone().sendKeys(Constants.searchiPhone);
			
			
		}

public static void main(String[] args) {
	// TODO Auto-generated method stub

}
	
		
	
		

}
