package PeopleNtech.Automationtraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestAnnotations {
  @Test
  public void f() {
	  System.out.println("this is test annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is before method annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is after method annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is before class annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is after class annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is before test annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is after test annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is before suite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is after suite annotation");
  }
  @Test
  public void f2() {
	  System.out.println("this is second test annotation");
  }

}
