package testsPOM;

import org.testng.Reporter;
import org.testng.annotations.Test;

import basepkg.Base;
import validationsPOM.LoginPageObjects;

public class Sample extends Base{
	
public static String Url = "http://opesmount.in/grocerystore/admin/";	
	
  @Test
  public void SampTest() {
	  LoginPageObjects lPOM = new LoginPageObjects();
	 driver.get(Url);
	 Reporter.log("URL launched");
	 Boolean b =  lPOM.userLogin();
	 sa.assertTrue(b, "Assert Pass");
	 sa.assertAll();
  }
}
