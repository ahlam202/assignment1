package PeopleNtech.Automationtraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookFlightU {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\git\\assignment1\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement roundTrp= driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		roundTrp.click();
		WebElement from= driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction"));
		from.click();
		WebElement ahmd=driver.findElement(By.xpath("//a[@text= \"Ahmedabad (AMD)\"]"));
		ahmd.click();
		Thread.sleep(6000);
		//WebElement dlh=driver.findElement(By.xpath("(//*[@text=\"Delhi (DEL)\"])[2]"));//using index
		WebElement dlh=driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_destinationStation1_CTNR\"]//*[@text=\"Delhi (DEL)\"]"));// using parent-child				dlh.click();
		dlh.click();
		WebElement departurDate=driver.findElement(By.xpath("//*[text()=12]"));
		departurDate.click();
		WebElement returnDate= driver.findElement(By.id("Div1"));
		System.out.println(returnDate.getAttribute("style"));//for see if this elemnt enable or disable 
		if (returnDate.getAttribute("style").contains("1")) {
				System.out.println("it is enabled");
			} else {
		         System.out.println("it is disabled");
		}
		WebElement pass= driver.findElement(By.id("divpaxinfo"));
		pass.click();
		Thread.sleep(6000);
		WebElement clickon= driver.findElement(By.id("hrefIncAdt"));
		// clickon.click(); //if wanna click more than one can just repeat this code
		for (int i = 1; i <5; i++) {
		clickon.click();//the best methode for click more than one by using for loop
		}	
		//int i=1;
		//while (i<5) {
		//clickon.click();
		//i++;// 
		//}	
		WebElement doneButton= driver.findElement(By.id("btnclosepaxoption"));
		doneButton.click();		
		WebElement currency= driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		Select usa=new Select(currency);
		usa.selectByValue("USD");
		System.out.println(usa.getFirstSelectedOption().getText());//how printing in select class
		WebElement box= driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		box.click();
		System.out.println(box.isSelected());
	    System.out.println( driver.findElements(By.xpath("//*[@type=\"checkbox\"]")).size());//how many checkboxes we have
	    WebElement country=driver.findElement(By.id("autosuggest"));
		country.sendKeys("al");
		Thread.sleep(6000);
		List<WebElement> allcount= driver.findElements(By.xpath("//*[@class=\"ui-menu-item\"]"));
		for (WebElement element : allcount) {
			if (element.getText().equalsIgnoreCase("Algeria")) {
				element.click();
				break;
			}
		}
		WebElement searchButton= driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
		searchButton.click();
				
				
	
			
		
		
		
	}

}
