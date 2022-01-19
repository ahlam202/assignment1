package PeopleNtech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Pointers {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\git\\assignment1\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions ob=new Actions(driver);
		WebElement viewds= driver.findElement(By.id("nav-link-accountList"));
		ob.moveToElement(viewds).build().perform();
		//ob.contextClick(viewds).build().perform();// for right click
		WebElement order=driver.findElement(By.id("nav-orders"));
		order.click();
		
		
		
		
	}

}
