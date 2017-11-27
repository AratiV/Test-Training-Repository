package basepkg;

import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

//import modules.Login;
//import modules.StoreResult;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
//import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;

public class Base {
	
	public static final String Path = "C:\\Users\\Home\\Downloads\\chromedriver_win32\\chromedriver.exe";
		
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static SoftAssert sa;
	//public static Login lg;
	//public static StoreResult sr;
	//public static ITestResult result;
	public static int er = 0;
	
  @BeforeSuite
  public void beforeSuite() {
	  
	  System.setProperty("webdriver.chrome.driver",Path);
	  driver = new ChromeDriver();
	  wait = new WebDriverWait(driver,120);
	  sa = new SoftAssert();
	  driver.manage().window().maximize();
  }
   
 

  @AfterSuite
  public void afterSuite() {
	  
	  driver.quit();
  }

}
