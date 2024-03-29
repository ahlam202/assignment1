package PeopleNtech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Explicitwait {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.manage().window().maximize();
		WebElement demo= driver.findElement(By.linkText("Click to load get data via Ajax!"));
		demo.click();
		WebElement res= driver.findElement(By.id("results"));
		res.getText();
WebDriverWait wt= new WebDriverWait(driver, 5);
wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
System.out.println(res.getText());
	}

}
