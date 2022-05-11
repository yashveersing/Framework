package piit.automtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropitdown {

	static WebDriver driver;
public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		  driver.navigate().to("https://facebook.com");
		  driver.manage().window().maximize();
		  WebElement CreateAnAccount=driver.findElement(By.xpath("//*[text()='Create new account']"));
		  CreateAnAccount.click();
		  Thread.sleep(8000);
		  WebElement month=driver.findElement(By.name("birthday_month"));
		  Select ob=new Select(month);
		  ob.selectByValue("6");
		  WebElement day=driver.findElement(By.name("birthday_day"));
		  Select ob6=new Select(day);
		  ob6.selectByVisibleText("6");
		  WebElement year=driver.findElement(By.name("birthday_year"));
		  Select ob8=new Select(year);
		  ob8.selectByVisibleText("2019");
		  WebElement gender=driver.findElement(By.name("sex"));
		  Select ob7=new Select(gender);
		  ob7.selectByValue("Female");
		  
		  

	}

}
