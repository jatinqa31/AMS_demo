package pageobject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.TestBase;

public class Dashboard extends TestBase{

	public Dashboard(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
  
  @FindBy(xpath="//div[text()='Maintenance Cases']")
  WebElement Maintenance_cases;
  
  @FindBy(xpath="//table[@id='grid-desktop-paginator']")
  WebElement Pagination_table;
  

  public void Click_Maintenance()
  {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
    wait.until(ExpectedConditions.elementToBeClickable(Maintenance_cases));
    Maintenance_cases.click();
  }

  public WebElement pagination()
  {
	  return Pagination_table;
  }
  
  public void traverse_page()
  {

  }
    
}
