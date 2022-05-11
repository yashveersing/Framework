package piit.automtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alerts {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		  driver.navigate().to("https://chercher.tech/practice.pop-up.selenium-webdriver");
		  driver.manage().window().maximize();
		  WebElement Alert=driver.findElement(By.name("alerts"));
		  Alert.click();
		  Thread.sleep(7000);
		  driver.switchTo().alert().accept();
		  WebElement prompting=driver.findElement(By.name("prompt"));
		  prompting.click();
		  Thread.sleep(5000);
		  driver.switchTo().alert().sendKeys("tested");
		  driver.switchTo().alert().dismiss();

	}

}
