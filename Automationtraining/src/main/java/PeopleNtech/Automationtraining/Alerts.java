package PeopleNtech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\git\\assignment1\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement simpleAlert = driver.findElement(By.id("alertButton"));
		simpleAlert.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		WebElement confAlert = driver.findElement(By.id("confirmButton"));
		confAlert.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		WebElement confAlert1 = driver.findElement(By.id("confirmButton"));
		confAlert1.click();
		Thread.sleep(6000);
		driver.switchTo().alert().dismiss();

	}

}
