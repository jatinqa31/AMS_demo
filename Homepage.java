package pageobject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
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

public class Homepage extends TestBase{

	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
  
  @FindBy(xpath="//li[@data-test-id='dynamic-nav-menu_2']")
  WebElement Dashboard_link;
  
  @FindBy(xpath="//li[@id='product-4']/div/p/a")
  WebElement Fluffy_bunny_btn;
  
  @FindBy(xpath="//span[@class='cart-count ng-binding']")
  WebElement cart_count;
  
  @FindBy(xpath="//a[@href='#/cart']")
  WebElement cart;
  
  @FindBy(xpath="//td[text()=' Funny Cow']")
  WebElement funny_Cow;
  
  @FindBy(xpath="//td[text()=' Fluffy Bunny']")
  WebElement fluffy_bunny;
  
  public void Click_dashboard()
  {
//	WebDriverWait wait = new WebDriverWait(driver, 15);
//	WebElement wb = product_btn();
//	wb=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='mm_products']//a[@class='dropmenu']")));
	  Dashboard_link.click();
  }

  public void Fluffy_bunny_btn_click()
  {
	  Fluffy_bunny_btn.click();
  }

  public String Get_cart_count()
  {
	  return cart_count.getText();
  }
  

  public void cart_click()
  {
	  cart.click();
  }
  
  public boolean Funny_cow_displayed()
  {
	  return funny_Cow.isDisplayed();
  }
  
  public boolean Fluffy_bunny_displayed()
  {
	  return fluffy_bunny.isDisplayed();
  }
  
}
