package com.verfiabil.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.verfiabil.qa.base.TestBase;

public class LoginPage extends TestBase {
  
	//page repository
	
	@FindBy(xpath="//input[@name='userNameOrEmailAddress']")
	WebElement username;
	
	@FindBy(xpath=" //input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath="//button[@class='btn btn-success uppercase']")
	WebElement loginbutton;
	
	@FindBy(xpath="//div[@class='logo']//a//img")
	WebElement logo;
	
	@FindBy(xpath="//h2[contains(text(),'Login failed!')]")
	WebElement alertforinavlid;
	
	@FindBy(xpath="//button[@class='confirm']")
	WebElement okloginfailed;
	
	
	
	
	//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
	
		//Actions:
		/*public String validateLoginPageTitle(){
			return driver.getTitle();
		}*/
		
		public boolean validateLogo() throws InterruptedException{
			Thread.sleep(10000);
			return logo.isDisplayed();
		}
		
		public VerfiabilHomePage login(String un, String pwd) {
			
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginbutton.click();
			    	/*JavascriptExecutor js = (JavascriptExecutor)driver;
			    	js.executeScript("arguments[0].click();", loginbutton);*/
			    	
			return new VerfiabilHomePage();
		}
	
public void Invalidlogin(String un, String pwd) {
			
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginbutton.click();
			    	/*JavascriptExecutor js = (JavascriptExecutor)driver;
			    	js.executeScript("arguments[0].click();", loginbutton);*/
			    	
			if(alertforinavlid.isDisplayed()) {
				Assert.assertTrue(true, "Login Failed");
		         okloginfailed.click();
			}
			else {
				
				Assert.assertTrue(false, "Login Failed");
			}
		}
	
public void Blanklogin() {
	
	username.sendKeys("");
	password.sendKeys("");
	
	    	/*JavascriptExecutor js = (JavascriptExecutor)driver;
	    	js.executeScript("arguments[0].click();", loginbutton);*/
	    	
	if(loginbutton.isEnabled()) {
		Assert.assertFalse(false, "login button is enabled");
         
	}
	else {
		
		Assert.assertTrue(true, "login button disabled");
	}
}
	
}
