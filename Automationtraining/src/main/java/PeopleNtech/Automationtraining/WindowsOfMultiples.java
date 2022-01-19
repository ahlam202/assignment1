package PeopleNtech.Automationtraining;



import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class WindowsOfMultiples {
static public WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement kbook=driver.findElement(By.linkText("Kindle Books"));
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.SHIFT).build().perform();
		kbook.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		String current = driver.getWindowHandle();
		System.out.println(current);
		Set<String>windowHandl =driver.getWindowHandles();
		 Iterator<String>itrators=windowHandl.iterator();
		String parent= itrators.next();
		String child= itrators.next();
		System.out.println("this is the parent window ="+parent);
		System.out.println("this is the child window="+child);
		driver.switchTo().window(child);
		WebElement KindlExclu= driver.findElement(By.linkText("Kindle Exclusives"));
		KindlExclu.click();
		driver.switchTo().window(parent);
		WebElement custumServ= driver.findElement(By.linkText("Customer Service"));
		custumServ.click();
		
		
		//window handle for multi windows
		/*Set<String> windows=driver.getWindowHandles();
		Iterator<String> it =windows.iterator();
		String parent1=it.next();
		String ch=it.next();
		driver.switchTo().window(ch);
		driver.switchTo().window(parent1);*/
		
		
		 
		
		
		
		
		
	}

}
