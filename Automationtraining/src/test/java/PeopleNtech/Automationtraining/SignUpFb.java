package PeopleNtech.Automationtraining;

import org.testng.annotations.Test;

import pageObjectModel.SingUpFb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class SignUpFb {
	public static WebDriver driver;
		
  @Test
  public void f() {
	  SingUpFb su= new SingUpFb(driver);
	  su.creatAccount();
	  su.firstN();
	  su.lastName();
	  su.emailAdd();
	  su.passW();
	  su.birthM();
	  su.birthd();
	  su.birthY();
	  su.genders();
	  su.singupB();
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

}
