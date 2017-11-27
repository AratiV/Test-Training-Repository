package validationsPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

import basepkg.Base;

public class LoginPageObjects extends Base{
	
	@FindBy(how=How.NAME,using="username")
	 WebElement uname1;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"input-password\"]")
	 WebElement pwd1;
	
	@FindBy(how=How.XPATH,using="//*[@id=\\\"content\\\"]/div/div/div/div/div[2]/form/div[3]/button")
	 WebElement btn;
	
	
	
	public boolean userLogin()
	{
		
		Boolean b;
		uname1.sendKeys("admin");
		Reporter.log("UserName Entered");
		pwd1.sendKeys("1q2w3e4r");
		Reporter.log("Password Entered");
		btn.click();
		if(driver.getTitle()=="Dashboard")
		{
			b = true;
		}
		else
		{
			b = false;
		}
			
		return  b;
	}

}
