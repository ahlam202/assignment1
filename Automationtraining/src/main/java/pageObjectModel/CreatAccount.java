package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatAccount {
	public WebDriver driver;
	@FindBy(id = "createAccountSubmit") WebElement creat;
	@FindBy(id = "ap_customer_name") WebElement name;
	@FindBy(id = "ap_email") WebElement mobile;
	@FindBy(id = "ap_password") WebElement password;
	@FindBy(id = "ap_password_check") WebElement repassword;
	@FindBy(id = "continue") WebElement continueB;
	public CreatAccount(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void creat() {
		creat.click();
		
	}
	public void name() {
		name.sendKeys("ahlam");
		
	}
	public void mobile() {
		mobile.sendKeys("123456789");
		
	}
	public void paswd() {
		password.sendKeys("1234");
	}
	public void reenterpw() {
		repassword.sendKeys("1234");
		
	}
	public void continueB() {
		continueB.click();
		
	}
		
		
	
	

}
