package PeopleNtech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\git\\assignment1\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement SearchIcon= driver.findElement(By.id("nav-search-submit-button"));
		SearchIcon.click();
		Thread.sleep(6000);
		WebElement bestsellers= driver.findElement(By.linkText("Best Sellers"));
		bestsellers.click();
		Thread.sleep(6000);
		WebElement linktx= driver.findElement(By.partialLinkText("Epic"));
		linktx.click();
		Thread.sleep(6000);
		WebElement searchfield = driver.findElement(By.name("field-keywords"));
		searchfield.sendKeys("computer");
		WebElement SearchIcon1= driver.findElement(By.id("nav-search-submit-button"));
		SearchIcon1.click();
		
		
		
		
		
		
	}

}
