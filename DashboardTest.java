package Smoke;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import listeners.TestAllureListener;
import pageobject.Dashboard;
import pageobject.Homepage;
import pageobject.LoginPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import testBase.TestBase;

@Listeners({listeners.TestAllureListener.class})
public class DashboardTest extends TestBase{
	SoftAssert sa = new SoftAssert();
	public static int count=0;
	
	@Test(priority=1,description="Verify_Title")
	@Severity(SeverityLevel.NORMAL)
	@Description("Verify Title")
	
	public void Verify_Dashboard_Title() 
	{
		sa.assertEquals(driver.getTitle(),"AMS Portal" );
		sa.assertAll();
	}
	
	@Test(priority=2,dependsOnMethods="Verify_Dashboard_Title")
	public void Click_Maintenance_cases() 
	{
		Dashboard dp = new Dashboard(driver);
		dp.Click_Maintenance();
	}	
	
	@Test(priority=3)
	public void Login_with_Valid_credentials() 
	{
		//
	}
	
}
