package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	WebDriver driver;
	@FindBy (xpath="(//*[@name='email'])[2]") WebElement Id;
	@FindBy(name="did_submit") WebElement SearchButtonClick;
	
	public ForgotPasswordPage(WebDriver driver) {
		this.driver=driver;
PageFactory.initElements(driver, this);
		
		
		
	}
	public void IdsSendKeys() {
		Id.sendKeys("yashveer@gmail.com");
		
	}
	public void SearchButtonClick() {
		SearchButtonClick.click();
	}
	

}
