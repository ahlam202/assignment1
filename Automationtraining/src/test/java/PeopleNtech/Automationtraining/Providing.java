package PeopleNtech.Automationtraining;

import org.testng.annotations.Test;

import commun.Utility;
import pageObjectModel.HomeOfFb;

import org.testng.annotations.DataProvider;

public class Providing extends Utility{
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  HomeOfFb home=new HomeOfFb(driver);
	  home.emailAdd(n);
	  home.password(s);
	  home.loginButton();
	  Thread.sleep(6000);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "ahlam", "9021" },
      new Object[] { "ppntch", "5678" },
      new Object[] {"usa","1234" }
    };
  }
}
