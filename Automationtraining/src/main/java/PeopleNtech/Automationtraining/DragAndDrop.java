package PeopleNtech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		// System.out.println(driver.findElements(By.tagName("iframe")).size());//for
		// knowing how frame we have
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions ob = new Actions(driver);
		ob.dragAndDrop(drag, drop).build().perform();
		driver.switchTo().parentFrame();
		// driver.switchTo().defaultContent();// it is the same parentframe
		Thread.sleep(6000);
		WebElement size = driver.findElement(By.linkText("Resizable"));
		size.click();

	}
}
