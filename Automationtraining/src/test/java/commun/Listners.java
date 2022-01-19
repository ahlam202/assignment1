package commun;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners extends Utility implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	this.driver=((Utility) result.getInstance()).driver;	
		Date dt=new Date();
		System.out.println(dt);
		String st=dt.toString().replace(" ", "_").replace(":", "_");
		String local =System.getProperty("user.dir");
		File stored=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(stored, new File(local+"\\pictures\\pass\\"+st+"captured.jpg"));
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		
	}
	

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver=((Utility)result.getInstance()).driver;
		Date dt=new Date();
		System.out.println(dt);
		String st=dt.toString().replace(" ", "_").replace(":", "_");
		String local =System.getProperty("user.dir");
		File stored=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(stored, new File(local+"\\pictures\\failed\\"+st+"captured.jpg"));
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		
		
	}
	}

	
	
	
	
	
	
	

