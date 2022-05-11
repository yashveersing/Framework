package piit.automtion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowserdriver {
	static WebDriver driver;

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
  driver.navigate().to("https://amazon.com");
  driver.manage().window().maximize();
  driver.navigate().back();
  Thread.sleep(6000);
  driver.navigate().forward();
  driver.navigate().refresh();
  String ur=driver.getCurrentUrl();
  System.out.println(ur);
  String windowhandle=driver.getWindowHandle();
  System.out.println(windowhandle);
  driver.close();
  

	}

}
