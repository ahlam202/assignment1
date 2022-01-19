package PeopleNtech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\git\\assignment1\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement CreatAccount= driver.findElement(By.xpath("//*[text()='Create new account']"));
		CreatAccount.click();
		Thread.sleep(6000);
		WebElement Monthbirth = driver.findElement(By.name("birthday_month"));
		Select month= new Select(Monthbirth);
		month.selectByValue("1");
		WebElement birthday= driver.findElement(By.name("birthday_day"));
		Select day=new Select(birthday);
		day.selectByVisibleText("6");
		WebElement yearbirth=driver.findElement(By.name("birthday_year"));
		Select year=new Select(yearbirth);
		//year.selectByValue("2018");
		year.selectByIndex(1);
	
		WebElement gender=driver.findElement(By.xpath("(//*[@name='sex'])[1]"));
		gender.click();
		
		
		
		
		
		
		
		
		
	}

}
