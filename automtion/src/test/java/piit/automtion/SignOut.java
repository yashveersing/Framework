package piit.automtion;

import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;
import PageObjectModel.ForgotPasswordPage;
import PageObjectModel.Home;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;



public class SignOut {
	WebDriver driver;
	
  public void f() throws InterruptedException, IOException{
	  Home ob=new Home(driver);
	  ob.Email();
	  ob.Mypassword();
	  Thread.sleep(8000);
	 ob.Forgotmypassword();
	 ForgotPasswordPage id=new ForgotPasswordPage(driver);
	 id.IdsSendKeys();
	 id.SearchButtonClick();
	 Thread.sleep(900);
	
File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(screenshots, new File("C:\\Users\\Owner\\eclipse-workspace\\automtion\\pictures\\shotsofpage.jpg"));
  }
  @BeforeClass
  public void beforeClass() {
	 Browsers("Chrome");
	 // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//driver=new ChromeDriver();
		//System.setProperty("webdriver.edge.driver","C:\\Users\\Owner\\eclipse-workspace\\automtion\\drivers\\msedgedriver.exe");
		//driver=new EdgeDriver();
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Owner\\eclipse-workspace\\automtion\\drivers\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.navigate().to( "https://www.homedepot.com");
		  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }


  public void Browsers(String window) {
 
if (window.equalsIgnoreCase("Chrome"                                                                                                                                                                                                   )) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	 driver.navigate().to( "https://www.homedepot.com");
	  driver.manage().window().maximize();
  }
  else if(window.equalsIgnoreCase("Edge")) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Owner\\eclipse-workspace\\automtion\\drivers\\msedgedriver.exe");
	driver=new EdgeDriver();
	 driver.navigate().to( "https://www.homedepot.com");
	  driver.manage().window().maximize();
  }
  else if(window.equalsIgnoreCase("Firefox")) {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Owner\\eclipse-workspace\\automtion\\drivers\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.navigate().to( "https://www.homedepot.com");
	  driver.manage().window().maximize();
		
  }
  } }	  
  
	  


