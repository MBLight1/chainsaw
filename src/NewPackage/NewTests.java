package NewPackage;

import org.testng.annotations.Test;

import browserproperties.Browser;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;


public class NewTests {

	private ObjectMap map;
	
	
	@Test(dataProvider = "create", dataProviderClass = Dataprovider.class)
	public void tests(String number){
	  
      map = new ObjectMap("C:\\eclipse-workspace\\NewGoogleProject\\src\\NewPackage\\objectmap.properties");
      MyClass myClass = new MyClass();
      myClass.get();
      
      try {
    	  //Step 1
			WebElement finding = Browser.driver().findElement(map.getLocator("find"));
			finding.sendKeys(number);
			
		  //Step 2
			assertEquals("", finding.getText());  
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
      myClass.close();   
	}
	
	
}
