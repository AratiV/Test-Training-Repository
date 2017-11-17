package adminLogin;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static final String Path = "C:\\Users\\Home\\Downloads\\chromedriver_win32\\chromedriver.exe";
	public static final String Url = "http://opesmount.in/grocerystore/admin/";
	
	public String Ad_Login(Map <String,String> data)
	{
		
		String uname = null;
		String pwd = null;
		
		for(Map.Entry <String,String> me:data.entrySet())
		{
				uname = me.getKey();
				pwd = me.getValue();
			
		}
		
			System.setProperty("webdriver.chrome.driver",Path);
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(Url);
			
			driver.findElement(By.xpath("//*[@id=\"input-username\"]")).sendKeys(uname);
			driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(pwd);
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button")).submit();
			
			driver.close();

		
		return "PASS";
	}


}
