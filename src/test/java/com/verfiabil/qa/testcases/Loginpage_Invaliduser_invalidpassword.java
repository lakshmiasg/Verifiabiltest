package com.verfiabil.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.verfiabil.qa.base.TestBase;
import com.verfiabil.qa.pages.LoginPage;
import com.verfiabil.qa.pages.VerfiabilHomePage;
import com.verfiabil.qa.util.TestUtil;

public class Loginpage_Invaliduser_invalidpassword extends TestBase {
	LoginPage loginPage;
	VerfiabilHomePage homePage;
	String sheetName="login";
	
	public Loginpage_Invaliduser_invalidpassword(){
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
	
	@DataProvider
	public Object[][] getgroupcreationTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=2,dataProvider="getgroupcreationTestData")
	public void loginTest(String username,String password) {
		loginPage.Invalidlogin(username,password);
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
}


