package piit.automtion;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;	

		public class homedepot  {
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException { 
					// TODO Auto-generated method stub
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
					driver=new ChromeDriver();
					 driver.navigate().to( "https://www.homedepot.com");
					  driver.manage().window().maximize();
					  WebElement Registerme=driver.findElement(By.xpath("//*[text()='Register']"));
					  Registerme.click();
					  WebElement PersonalAccount=driver.findElement(By.xpath("//*[text()='Select & Continue']"));
					  PersonalAccount.click();
					  Thread.sleep(600);
					  WebElement Emailaddress=driver.findElement(By.id("email"));
					  Emailaddress.click();
					  Emailaddress.sendKeys("veer26882@gamil.com");
					  WebElement Password=driver.findElement(By.name("password"));
		              Password.sendKeys("Yash@veer#2017");
					  Password.click();
					  Thread.sleep(500);
					  WebElement Zip=driver.findElement(By.name("zipcode"));
					  Zip.sendKeys("22150");
					  Zip.click();
					  WebElement Phonenumber=driver.findElement(By.id("phone"));
					  Phonenumber.sendKeys("5713324567");
					  Phonenumber.click();
					    WebElement Caacount=driver.findElement(By.xpath("//*[text()='Create an Account']"));
					    Caacount.click();
					   Thread.sleep(500);
					  
					  
					  
					  
		}
}
