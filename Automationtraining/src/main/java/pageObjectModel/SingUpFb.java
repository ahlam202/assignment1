package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SingUpFb {
	public WebDriver driver;
 @FindBy(xpath = "//*[text()='Create new account']")WebElement creat;
 @FindBy(name = "firstname") WebElement firstName;
 @FindBy(name = "lastname") WebElement lastN;
 @FindBy(name = "reg_email__") WebElement email;
 @FindBy(id = "password_step_input") WebElement password;
 @FindBy(name = "birthday_month") WebElement bMonth;
 @FindBy(name = "birthday_day") WebElement bDay;
 @FindBy(name = "birthday_year") WebElement bYear;
 @FindBy(xpath = "(//*[@name='sex'])[1]") WebElement gender;
 @FindBy(xpath = "//*[@name=\"websubmit\"]")WebElement singUp;
 
 public SingUpFb(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
 public void creatAccount() {
	creat.click();
	
}
 
public void firstN() {
	firstName.sendKeys("AHLAM");
}	
public void lastName() {
	lastN.sendKeys("larguet");
}	
	public void emailAdd() {
		email.sendKeys("ahlam.larguet@gmail.com");
	}
	public void passW() {
		password.sendKeys("123456789");
		
	}
	public void birthM() {
		Select month= new Select(bMonth);
		month.selectByValue("1");
	}
	public void birthd() {
		Select day=new Select(bDay);
		day.selectByVisibleText("6");
	}
	public void birthY() {
		Select year=new Select(bYear);
		year.selectByValue("1990");
	}
	public void genders() {
		gender.click();
	}
	public void singupB() {
		singUp.click();
	}
	
	
	
	
	
	
	
	
	
}
