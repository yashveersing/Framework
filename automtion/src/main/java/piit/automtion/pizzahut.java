package piit.automtion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pizzahut {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException { 
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				 driver.navigate().to( "https://www.pizzahut.com");
				  driver.manage().window().maximize();
				  WebElement Menu=driver.findElement(By.xpath("(//*[text()='Menu']"));
				  Menu.click();
				  Thread.sleep(40);
				WebElement Options=driver.findElement(By.name("Pizza"));
				Options.click();
				WebElement Cheesespizza=driver.findElement(By.name("Order Now"));
				Cheesespizza.click();
				  

}
}