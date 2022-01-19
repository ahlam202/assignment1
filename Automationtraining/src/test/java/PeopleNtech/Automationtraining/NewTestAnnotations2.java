package PeopleNtech.Automationtraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class NewTestAnnotations2 {
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

  @AfterClass
  public void afterClass() {
	  System.out.println("this is after class annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is after test annotation");
  }

}
