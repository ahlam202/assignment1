package PeopleNtech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\git\\assignment1\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
		WebElement flight=driver.findElement(By.xpath("//*[text()='Flights']"));
		flight.click();
		WebElement depart=driver.findElement(By.id("d1-btn"));
		depart.click();
		Thread.sleep(6000);
		WebElement selectdate=driver.findElement(By.xpath("//*[@aria-label=\"Dec 26, 2021\"]"));
		selectdate.click();
		WebElement doneButt= driver.findElement(By.xpath("//*[@class=\"uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary uitk-flex-item uitk-flex-shrink-0 dialog-done\"]"));
		doneButt.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
