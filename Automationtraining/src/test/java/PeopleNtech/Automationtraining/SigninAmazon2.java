package PeopleNtech.Automationtraining;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import commun.Utility;
import pageObjectModel.CreatAccount;
import pageObjectModel.HomeAmazon;
import pageObjectModel.SignPage;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SigninAmazon2 extends Utility {
	
  @Test(priority = 2,dependsOnMethods = "verificationOfText")
  public void f() throws IOException {
	  HomeAmazon h=new HomeAmazon(driver);
	  h.sign();
	  shots();
	  SignPage s= new SignPage(driver);
	  s.email();
	  s.continueBtn();
	  CreatAccount c= new CreatAccount(driver);
	  c.creat();
	  c.name();
	  c.mobile();
	  c.paswd();
	  c.reenterpw();
	  c.continueB();
	  shots();
  }
	  @Test(priority = 1)
	  public void verificationOfText() throws IOException {
		  HomeAmazon h=new HomeAmazon(driver);
		  h.sign();
		  
		  SignPage s= new SignPage(driver);
		  s.email();
		  s.continueBtn();
		 shots();
		  String errorS=s.errorTex();
		  System.out.println(errorS);
		  SoftAssert soft= new SoftAssert();
		  soft.assertEquals(errorS, "We cannot find an account with that email address");//soft assertion
		  System.out.println("this is after assertion");
		  soft.assertAll();
		 // Assert.assertEquals(errorS, "We cannot find an account with that email address");//hard assertion
		  
	  }
}
  



  
  

