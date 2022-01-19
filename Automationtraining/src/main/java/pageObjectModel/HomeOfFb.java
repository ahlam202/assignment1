package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeOfFb {
public WebDriver driver;
	
	@FindBy(name = "email") WebElement email;
	@FindBy(name = "pass") WebElement passwd;
	@FindBy(name = "login")WebElement button;
	
	public HomeOfFb(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void emailAdd(String emails) {
		email.sendKeys(emails);
	}
	public void password(String id) {
		passwd.sendKeys(id);
		
	}
	public void loginButton() {
		button.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}

