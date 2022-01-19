package PeopleNtech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ixpath {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\git\\assignment1\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement fields = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input"));
		fields.sendKeys("ahlam");
		WebElement paw= driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/div/input"));
		paw.sendKeys("12345");
		WebElement log=driver.findElement(By.xpath("//button[@ value=\"1\"]"));
		log.click();
		WebElement non=driver.findElement(By.xpath("//i[@class=\"_9ai6 img sp_-Ww9-2lZPiS_2x sx_c93b76\"]"));
		non.click();
		Thread.sleep(6000);
		WebElement forg= driver.findElement(By.xpath("//a[text()='Forgot password?']"));
		forg.click();
		
		
		
		
		
		
	}

}
