package com.verfiabil.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.verfiabil.qa.base.TestBase;
import com.verfiabil.qa.pages.LoginPage;
import com.verfiabil.qa.pages.VerfiabilHomePage;

public class Loginpage_Blankusername_Blankpassword extends TestBase {
	LoginPage loginPage;
	VerfiabilHomePage homePage;

	
	public Loginpage_Blankusername_Blankpassword(){
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
		loginPage.Blanklogin();
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	


}
