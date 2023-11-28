package com.Demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Bace_Test_01 {

	WebDriver driver;
@Parameters("BrowsrName")
@BeforeClass
	public void opanBrowser(String BrowsrName)
	{
		if(BrowsrName.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (BrowsrName.equals("chrome")) {
			
			driver=new ChromeDriver();
		}
		else {
			driver=new EdgeDriver();
		}
	}
@BeforeMethod
public void opanApps()
{
	driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
@AfterMethod
public void testItestRsult(ITestResult result)
{
	String testmethod = result.getName();
	if(result.getStatus()==1)
	{
		Reporter.log(testmethod+"execution is pass",true);
	}
	else
	{
		Reporter.log(testmethod+"execution is fail",true);
	}
}
@AfterClass

public void closeBrowser()
{
	driver.close();
}
}
