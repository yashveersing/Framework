package piit.automtion;

import org.testng.annotations.Test;

import m.Common.Utility;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.TakesScreenshot;
@Test
public class browser extends Utility {
	WebDriver driver;
  public void f() throws IOException {
	  WebElement id=driver.findElement(By.name("email"));
	  id.sendKeys("www.veer26882@gmail.com");
	  Pictures();
	  WebElement password=driver.findElement(By.name("pass"));
	  password.sendKeys("johnsilver");
	  Pictures();
	  WebElement loginbutton=driver.findElement(By.name("login")); 
	  loginbutton.click();
	  File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  String sk;
	FileHandler.copy(screenshots, new File("C:\\Users\\Owner\\eclipse-workspace\\automtion\\pictures\\shotsofpage.jpg"));
	    
  }
  @BeforeClass
  public void beforeClass() { 
	 Browsers("Chrome");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

  public void Browsers(String window) {
  if (window.equalsIgnoreCase("Chrome")) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	 driver.navigate().to( "https://www.homedepot.com");
	  driver.manage().window().maximize();
  }else if(window.equalsIgnoreCase("Edge")) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\Owner\\eclipse-workspace\\automtion\\drivers\\msedgedriver.exe");
	driver=new EdgeDriver();
	 driver.navigate().to( "https://www.homedepot.com");
	  driver.manage().window().maximize();
  }else if(window.equalsIgnoreCase("Firefox")) {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Owner\\eclipse-workspace\\automtion\\drivers\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.navigate().to( "https://www.homedepot.com");
	  driver.manage().window().maximize();
  }	
  }
  public void Pictures()throws IOException{
	  Date dt=new Date();
	  String sk=dt.toString().replace(" ", "_").replace(" ", "_");
	  System.out.println(sk);
	  System.out.println(dt);
	  File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(screenshots, new File("C:\\Users\\Owner\\eclipse-workspace\\automtion\\pictures\\"+sk+"shotsofpage.jpg"));  
}
  }
