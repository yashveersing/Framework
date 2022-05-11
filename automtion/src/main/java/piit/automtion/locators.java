package piit.automtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		  driver.navigate().to("https://amazon.com");
		  driver.manage().window().maximize();
		  WebElement Searchfieldtxt=driver.findElement(By.name("field-keywords"));
			 Searchfieldtxt.sendKeys("Computer");
		WebElement Searchicon= driver.findElement(By.id("nav-search-submit-button"));
		Searchicon.click();
		WebElement linktext=driver.findElement(By.linkText("Registry"));
		linktext.click();
		
		  

	}

}
