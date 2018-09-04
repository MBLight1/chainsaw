package NewPackage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import browserproperties.Browser;


public class MyClass extends LoadableComponent<MyClass> {
		
	//@FindBy(id = "searchbox")
	public WebElement find3;
	
	private ObjectMap map;
		
	static String url = "https://www.online-calculator.com/";
	private String title = "Online Calculator";
	
	public MyClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");      
		PageFactory.initElements(Browser.driver(), this);		
	}
	
	@Override
	protected void load() {
		Browser.open(url);
	}
	
	@Override
	protected void isLoaded() {
		assertTrue(Browser.driver().getTitle().equals(title));
	}
	
	public void close() {
		Browser.close();
	}
	
	public void search(String search){
		//find.sendKeys(search);
		//map = new ObjectMap("C:\\eclipse-workspace\\NewGoogleProject\\src\\NewPackage\\objectmap.properties");
		try {
			WebElement finding = Browser.driver().findElement(map.getLocator("find"));
			finding.sendKeys(search);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getT(){
		map = new ObjectMap("C:\\eclipse-workspace\\NewGoogleProject\\src\\NewPackage\\objectmap.properties");
		try {
			WebElement findings = Browser.driver().findElement(map.getLocator("find"));
		   // findings.getAttribute("value");
			findings.getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return	null;
	}
}


