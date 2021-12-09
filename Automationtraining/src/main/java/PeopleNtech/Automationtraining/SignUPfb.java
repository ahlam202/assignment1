package PeopleNtech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUPfb {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement CreatAccount= driver.findElement(By.xpath("//*[text()='Create new account']"));
		CreatAccount.click();
		Thread.sleep(6000);
		WebElement FirstN= driver.findElement(By.name("firstname"));
		FirstN.sendKeys("ahlam");
		WebElement LastN= driver.findElement(By.name("lastname"));
		LastN.sendKeys("larg");
		WebElement Fnumbr= driver.findElement(By.name("reg_email__"));
		Fnumbr.sendKeys("1234567890");
		WebElement Pwd= driver.findElement(By.id("password_step_input"));
		Pwd.sendKeys("0987654321");
		WebElement Monthbirth = driver.findElement(By.name("birthday_month"));
		Select month= new Select(Monthbirth);
		month.selectByValue("1");
		WebElement birthday= driver.findElement(By.name("birthday_day"));
		Select day=new Select(birthday);
		day.selectByVisibleText("6");
		WebElement yearbirth=driver.findElement(By.name("birthday_year"));
		Select year=new Select(yearbirth);
		year.selectByValue("1990");
		WebElement gender=driver.findElement(By.xpath("(//*[@name='sex'])[1]"));
		gender.click();
		WebElement SignUp= driver.findElement(By.xpath("//*[@name=\"websubmit\"]"));
		SignUp.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
