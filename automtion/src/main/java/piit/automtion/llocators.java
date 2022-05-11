package piit.automtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class llocators {
	static WebDriver driver;
public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		  driver.navigate().to("https://amazon.com");
		  driver.manage().window().maximize();
		  WebElement searchoffields=driver.findElement(By.xpath("//input[@aria-label='Search']"));
		  searchoffields.sendKeys("kids cars");
 WebElement searchtoclick=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span/input"));
 Thread.sleep(6000);
 searchtoclick.click();
		  
		  

	}

}
