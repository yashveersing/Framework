package PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home {
	WebDriver driver;
	@FindBy(name="email") WebElement mymail;
	@FindBy(name="pass") WebElement password;
	@FindBy(linkText="Forgot Password") WebElement Forgot;
	
	public  Home (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
		
	}
	public void Email() {
		mymail.sendKeys("yashveer");
		
	}
	public void Mypassword() {
		password.sendKeys("peter");
		
		
	}
	public void Forgotmypassword() {
		Forgot.click();
	}

}
