package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignPage {
	public WebDriver driver;
@FindBy(name = "email") WebElement email;
@FindBy(id = "continue") WebElement contBtton;
@FindBy(xpath = "//*[contains(text(), \"We cannot find an account \")]") WebElement error;
public SignPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}


public void email() {
	email.sendKeys("ahlam.larguet@icloud.com");
	
}
public void continueBtn() {
	contBtton.click();
	
}
public String errorTex() {
	String errorOf=error.getText();
	return errorOf ;
}
}
