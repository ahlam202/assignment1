package PeopleNtech.Automationtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkbox {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\git\\assignment1\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().to("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		/*WebElement box= driver.findElement(By.id("checkBoxOption1"));
		box.click();
		System.out.println(box.isSelected());
		box.click();
		System.out.println(box.isSelected());
		
		System.out.println(driver.findElements(By.xpath("//*[@type=\"checkbox\"]")).size());
		
		
		WebElement alertB= driver.findElement(By.id("alertbtn"));
		alertB.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		WebElement alertB1= driver.findElement(By.id("confirmbtn"));
		alertB1.click();
		Thread.sleep(6000);
		driver.switchTo().alert().dismiss();*/
		WebElement adult= driver.findElement(By.xpath("(//*[@class=\"bc-neutral-100 bg-transparent\"])[1]"));
		Select adults4=new Select(adult);
		adults4.selectByValue("4");
		WebElement child= driver.findElement(By.xpath("(//*[@class=\"bc-neutral-100 bg-transparent\"])[2]"));
		Select child1= new Select(child);
		child1.selectByVisibleText("1");
		WebElement infant= driver.findElement(By.xpath("(//*[@class=\"bc-neutral-100 bg-transparent\"])[3]"));
		Select infant0= new Select(infant);
		infant0.selectByIndex(0);
		WebElement more=driver.findElement(By.xpath("//*[@class=\"td-none hover:td-underline px-4 mt-1 weak\"]"));
		more.click();
		WebElement classOfTrav= driver.findElement(By.xpath("//*[@style=\"width: 230px; height: 30px;\"]"));
		Select first= new Select(classOfTrav);
		first.selectByValue("First");
		WebElement airline= driver.findElement(By.cssSelector("*[placeholder=\"Airline name\"]"));
		airline.sendKeys("air india");
		WebElement searchButt= driver.findElement(By.xpath("(//*[@class=\"col flex flex-middle\"])[6]"));
		searchButt.click();
		WebElement errMsg= driver.findElement(By.xpath("//*[text()='Select Departure and Arrival airports/cities.']"));
		System.out.println(errMsg.getText());
		
		
		
	}

}
