package com.verfiabil.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.verfiabil.qa.base.TestBase;
import com.verfiabil.qa.pages.BrokerCreationPage;
import com.verfiabil.qa.pages.GroupCreationPage;
import com.verfiabil.qa.pages.LoginPage;
import com.verfiabil.qa.pages.VerfiabilHomePage;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	VerfiabilHomePage homePage;
	GroupCreationPage groupPage;
	BrokerCreationPage brokerPage;
	
	public HomePageTest() {
		super();
	}
	//test cases should be separated -- independent with each other
		//before each test case -- launch the browser and login
		//@test -- execute test case
		//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		groupPage=new GroupCreationPage();
		brokerPage=new BrokerCreationPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "VerifiaBill","Home page title not matched");
	}
	
	@Test(priority=2)
	public void verifyAddGroupLink(){		
		groupPage = homePage.clickOnAddGroup();
	}
	
	@Test(priority=3)
	public void verifyAddBrokerLink(){		
		brokerPage = homePage.clickOnAddBroker();
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}	
	
}
