package com.verfiabil.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.verfiabil.qa.base.TestBase;
import com.verfiabil.qa.pages.LoginPage;
import com.verfiabil.qa.pages.VerfiabilHomePage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	VerfiabilHomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	

	
	@Test(priority=1)
	public void verfiabilLogoTest() throws InterruptedException{
		boolean flag = loginPage.validateLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
}
