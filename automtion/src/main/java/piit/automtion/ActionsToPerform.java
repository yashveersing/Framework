package piit.automtion;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


	public class ActionsToPerform {
		static WebDriver driver;
public static void main(String[] args)  {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			 driver.navigate().to("https://www.amazon.com");
			  driver.manage().window().maximize();
			  Actions ob=new Actions(driver);
			  WebElement hovers=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
			  ob.moveToElement(hovers).build().perform();
}

}
