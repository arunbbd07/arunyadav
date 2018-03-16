package packages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utility.constant;


public class Base {
	  public static WebDriver driver = new FirefoxDriver(); 

    @BeforeSuite
    public void setup()throws Exception  { 
         driver.manage().window().maximize();
    	 driver.get(constant.appUrl);
    	 
    } 

    @AfterSuite
    public void tearDown()throws Exception { 
            driver.quit(); 
        } 
} 
