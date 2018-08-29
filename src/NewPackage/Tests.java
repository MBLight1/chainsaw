package NewPackage;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class Tests {
	
	@Test
	public void tests(){
		
	  
      MyClass myClass = new MyClass();
      myClass.get();
      myClass.search("121");
      assertEquals(null, myClass.getT());
      myClass.close();   
	}
}
