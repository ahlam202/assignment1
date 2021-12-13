package PeopleNtech.Automationtraining;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PapayaJ {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.papajohns.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement StartOrder=driver.findElement(By.xpath("//*[@href=\" /order/stores-near-me\"]"));
		StartOrder.click();
		Thread.sleep(6000);
		WebElement UsaCont=driver.findElement(By.name("country"));
		Select contry=new Select(UsaCont);
		contry.selectByIndex(0);
		WebElement bus=driver.findElement(By.id("locations-addresstype"));
		Select addtype=new Select(bus);
		addtype.selectByValue("BUSINESS");
	    WebElement street= driver.findElement(By.id("autocomplete"));
	    street.sendKeys("123 Red River ");
	    Thread.sleep(6000);
		List<WebElement> allstreet= driver.findElements(By.id("autocomplete__listbox"));
		for (WebElement Element : allstreet) {
			if (Element.getText().equalsIgnoreCase("123 Red River Street, Austin, TX, USA")) {
				Element.click();
				break;
			}
			
		}
		
		WebElement apt=driver.findElement(By.id("locations-aptstefloor"));
		Select apt1=new Select(apt);
		apt1.selectByValue("APT");
		WebElement num=driver.findElement(By.xpath("//*[@id=\"locations-aptstefloornumber\"]"));
		num.sendKeys("20");
		WebElement zip=driver.findElement(By.name("zipcode"));
		zip.sendKeys("78701");
		WebElement butt=driver.findElement(By.xpath("//*[@class=\"button button-large\"]"));
		butt.click();
		WebElement addOrder= driver.findElement(By.xpath("(//*[@aria-label=\"ADD TO ORDER Cheese Pizza\"])[2]"));
		addOrder.click();
		WebElement drink= driver.findElement(By.id("drinks"));
		Select s=new Select(drink);
		s.selectByVisibleText("Diet Pepsi");
		WebElement add=driver.findElement(By.xpath("//*[@aria-label=\"2 Liter Add to Order\"]"));
		add.click();
		Thread.sleep(5000);
		WebElement shopCart= driver.findElement(By.xpath("//*[@id=\"cart\"]"));
		shopCart.click();
		WebElement checkout= driver.findElement(By.id("checkout-button"));
	     checkout.click();
	     
		
		
		
		
		
		

		
		
		
		
		
		
		
		
	}

}
