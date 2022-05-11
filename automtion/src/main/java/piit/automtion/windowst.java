package piit.automtion;

import org.openqa.selenium.WebDriver;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class windowst {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException { 
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				 driver.navigate().to( "https://www.amazon.com");
				  driver.manage().window().maximize();
				  Actions ob=new Actions(driver);
				  WebElement newreleaseslinks=driver.findElement(By.linkText("New Release"));
				  ob.keyDown(Keys.SHIFT).build().perform();
				  newreleaseslinks.click();
				  ob.keyUp(Keys.SHIFT).build().perform();
				  driver.getWindowHandle();
				  Set<String> windowhandles=  driver.getWindowHandles();
				  Iterator<String> iterator=windowhandles.iterator();
				  String Parent= iterator.next();
				  String secondwindow= iterator.next();
				  System.out.println("This is Parent window="+Parent);
				  System.out.println("This is second window="+secondwindow);
				  driver.switchTo().window(secondwindow);
				  WebElement Products=driver.findElement(By.linkText("Camera and Photo Product"));
				  Thread.sleep(6000);
				  Products.click();
				  driver.switchTo().window(Parent);
				  WebElement Productss=driver.findElement()
				  
				  
	}				  

}
