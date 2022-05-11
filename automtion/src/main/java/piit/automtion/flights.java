package piit.automtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flights {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException { 
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				 driver.navigate().to("https://Expedia.com/");
				  driver.manage().window().maximize();
				  WebElement departure=driver.findElement(By.id("d1-btn"));
				  departure.click();
				  WebElement dateofdeparture=driver.findElement(By.xpath("//*[@aria-label='May 16, 2022']"));
				  dateofdeparture.click();
				  WebElement dateofreturn=driver.findElement(By.xpath("//*[@aria-label='May 28, 2022']"));
				  dateofreturn.click();
				  departure.click();
				 
	}
	}


