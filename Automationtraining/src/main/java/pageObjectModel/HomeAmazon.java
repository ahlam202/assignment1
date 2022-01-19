package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeAmazon {
	public WebDriver driver;
@FindBy(id = "nav-link-accountList-nav-line-1") WebElement sign;
public HomeAmazon(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void sign() {
	sign.click();
}
}
