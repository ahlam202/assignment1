package PeopleNtech.Automationtraining;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commun.Utility;
import pageObjectModel.HomeOfFb;

public class FindElements extends Utility{
  @Test
  public void f() {
	List<WebElement> links= driver.findElements(By.tagName("a")); 
	 System.out.println(links.size());
	  for (WebElement webElement : links) {
		System.out.println(webElement.getText());
	  }	
	}
	  
  
      @Test
	  public void proprtisOfMethod() throws InterruptedException, IOException {
		  String local= System.getProperty("user.dir");
    	  Properties pro=new Properties();
    	  FileInputStream fis=new FileInputStream(local+"\\target\\Regression.properties");
    	  pro.load(fis);
    	  String eml= pro.getProperty("email");
    	  String pass= pro.getProperty("password");
    	  HomeOfFb home=new HomeOfFb(driver);
		  home.emailAdd(eml);
		  home.password(pass);
		  home.loginButton();
		  Thread.sleep(6000);
	  }
		
	
	 
  }
  
  
  
  

