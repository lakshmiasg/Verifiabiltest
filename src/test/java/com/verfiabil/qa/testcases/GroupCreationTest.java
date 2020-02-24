package com.verfiabil.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.verfiabil.qa.base.TestBase;
import com.verfiabil.qa.pages.GroupCreationPage;
import com.verfiabil.qa.pages.LoginPage;
import com.verfiabil.qa.pages.VerfiabilHomePage;
import com.verfiabil.qa.util.TestUtil;

public class GroupCreationTest extends TestBase{

	LoginPage loginPage;
	GroupCreationPage groupPage;
	VerfiabilHomePage homePage;
	String sheetName="group";
	
	public GroupCreationTest(){
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
		VerfiabilHomePage homePage;
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		groupPage=homePage.clickOnAddGroup();
	}
	
	@Test(priority=1)
	public void groupcreationLabelTest() {
	Assert.assertTrue(groupPage.grouppageCheck(),"Group creation page label  not matched");
	
	}
	
	
	@DataProvider
	public Object[][] getgroupcreationTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
			
	
	@Test(priority=2,dataProvider="getgroupcreationTestData")
	public void groupCreation(String tenancyname, String name, String adminemail, String email, String address, String city, String state, String zipcode) throws InterruptedException
	{
		//homePage.clickOnAddGroup();
		groupPage.createnewGroup(tenancyname, name, adminemail, email, address, city, state, zipcode);
	
	}	
		
		@AfterMethod
	public void tearDown(){
		driver.quit();
	}	
	
	
	
	
	
}
