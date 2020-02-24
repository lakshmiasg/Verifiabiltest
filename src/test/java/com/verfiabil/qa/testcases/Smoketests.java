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

public class Smoketests extends TestBase{
	LoginPage loginPage;
	VerfiabilHomePage homePage;
	GroupCreationPage groupPage;
	BrokerCreationPage brokerPage;
	
	public Smoketests() {
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
	public void verifyTenantsheader()
	{
		String tenantsTitle=homePage.verifyTenantsHeader();
		Assert.assertEquals(tenantsTitle, "Tenants","Tenants header not matched");
		System.out.println("tenants header is displayed as:" +tenantsTitle);
	}
		
	
	@Test(priority=3)
	public void verifyAddGroupLink(){		
		groupPage = homePage.clickOnAddGroup();
	}
	
	@Test(priority=4)
	public void verifyAddBrokerLink(){		
		brokerPage = homePage.clickOnAddBroker();
	}
	
	@Test(priority=5)
	public void verifyRolesgclink()
	{
		String rTitle=homePage.verifyRolesgc();
		Assert.assertEquals(rTitle, "Roles","Roles header not matched");
		System.out.println("Roles header is:" +rTitle);
	}
	
	@Test(priority=6)
	public void verifyUsersgclink()
	{
		String uTitle=homePage.verifyUsersgc();
		Assert.assertEquals(uTitle, "Users","Users header not matched");
		System.out.println("Users header is:" +uTitle);
	}
	
	@Test(priority=7)
	public void verifyAuditlogsgclink()
	{
		String alTitle=homePage.verifyAuditlogsgc();
		Assert.assertEquals(alTitle, "Audit logs","Audit logs header not matched");
		System.out.println("Audit logs header is:" +alTitle);
	}
	
	
	@Test(priority=8)
	public void verifyMaintainencegclink()
	{
		String mTitle=homePage.verifyMaintainencegc();
		Assert.assertEquals(mTitle, "Maintenance","Maintenance header not matched");
		System.out.println("Maintenance header is:" +mTitle);
	}
	
	
	@Test(priority=9)
	public void verifySettingsgclink()
	{
		String sTitle=homePage.verifySettingsgc();
		Assert.assertEquals(sTitle, "Settings","Settings header not matched");
		System.out.println("Settings header is:" +sTitle);
	}
	
	@Test(priority=10)
	public void verifyCarriermanagementgclink()
	{
		String cmTitle=homePage.verifyCarriermanagementgc();
		Assert.assertEquals(cmTitle, "Carrier Management","Carrier management header not matched");
		System.out.println("Carreir management header is:" +cmTitle);
	}
	
	
	@Test(priority=11)
	public void verifyAccountnumbergclink()
	{
		String anmTitle=homePage.verifyAccountNmbergc();
		Assert.assertEquals(anmTitle, "Account Number Management","Accunt number management header not matched");
		System.out.println("Account Number Management header is:" +anmTitle);
	}
	
	@Test(priority=12)
	public void verifyServicefeegclink()
	{
		String sfcTitle=homePage.verifyServicefeegc();
		Assert.assertEquals(sfcTitle, "Service fee configuration","Service fee configuration header not matched");
		System.out.println("Service fee configuration header is:" +sfcTitle);
	}

	@Test(priority=13)
	public void verifySelfcostplangclink()
	{
		String scpTitle=homePage.verifySelfcostplangc();
		Assert.assertEquals(scpTitle, "Self-insured plan cost modification","Self-insured plan cost modification header not matched");
		System.out.println("Self-insured plan cost modification header is:" +scpTitle);
	}
	
	
	@Test(priority=14)
	public void verifyImportcarrierdatagclink()
	{
		String icdTitle=homePage.verifyImportcarrierdatagc();
		Assert.assertEquals(icdTitle, "Import Carrier Data","Import Carrier Data header not matched");
		System.out.println("Import Carrier Data header is:" +icdTitle);
	}
	
	@Test(priority=15)
	public void verifyImportbenadmindatagclink()
	{
		String ibdTitle=homePage.verifyImportbenadmindatagc();
		Assert.assertEquals(ibdTitle, "Import Benadmin Data","Import BenAdmin Data header not matched");
		System.out.println("Import BenAdmin Data header is:" +ibdTitle);
	}
	
	@Test(priority=16)
	public void verifyReviewinvoicegclink()
	{
		String riTitle=homePage.verifyReviewinvoicesgc();
		Assert.assertEquals(riTitle, "Review Imported Data","Review Imported Data header not matched");
		System.out.println("Review Imported Data header is:" +riTitle);
	}
	
	
	@Test(priority=17)
	public void verifyResolvenamemismatchgclink()
	{
		String rnmTitle=homePage.verifyResolenaamemismatchgc();
		Assert.assertEquals(rnmTitle, "Resolve Name Mismatches","Resolve Name Mismatches header not matched");
		System.out.println("Resolve Name Mismatches header is:" +rnmTitle);
	}
	
	@Test(priority=18)
	public void verifyDiscrepanciesgclink()
	{
		String dTitle=homePage.verifyDiscrepanciesgc();
		Assert.assertEquals(dTitle, "Audit view","Discrepancies header not matched");
		System.out.println("Discrepancies header is:" +dTitle);
	}
	
	@Test(priority=19)
	public void verifyFollowupdiscrepancylink()
	{
		String fudTitle=homePage.verifyFollowupdiscrepancygc();
		Assert.assertEquals(fudTitle, "Audit view","Follow Up Discrepancies header not matched");
		System.out.println("Follow Up Discrepancies header is:" +fudTitle);
	}
	
	@Test(priority=20)
	public void verifyNodiscreapnciesgclink()
	{
		String ndTitle=homePage.verifyNodiscreapnciesgc();
		Assert.assertEquals(ndTitle, "Audit view","No Discrepancies header not matched");
		System.out.println("No Discrepancies header is:" +ndTitle);
	}
	
	
	@Test(priority=21)
	public void verifyBillinglink()
	{
		String paymentTitle=homePage.verifyBillingslink();
		Assert.assertEquals(paymentTitle, "Service Bills","Payment header not matched");
		System.out.println("Payments header is:" +paymentTitle);
	}
	

	
	@Test(priority=22)
	public void verifyCarrierinvoicesummarygclink()
	{
		String cisTitle=homePage.verifyCarrierinvoicesummarygc();
		Assert.assertEquals(cisTitle, "Billing Month:","Billing Month not matched");
		System.out.println("Carrier Invoice Summary header is:" +cisTitle);
	}
	
	
	@Test(priority=23)
	public void verifyCostallocationgclink()
	{
		String caTitle=homePage.verifyCostallocationgc();
		Assert.assertEquals(caTitle, "BenAdmin:","Cost Allocation and Discrepancy ID header not matched");
		System.out.println("Cost Allocation and Discrepancy ID header is:" +caTitle);
	}
	
	
	@Test(priority=24)
	public void verifyUploadcustomreportgclink()
	{
		String ucrTitle=homePage.verifyUploadcustomreportgc();
		Assert.assertEquals(ucrTitle, "VIEW UPLOADED REPORTS","Upload Custom Reports header not matched");
		System.out.println("Upload Custom Reports header is:" +ucrTitle);
	}
	
	
	@Test(priority=25)
	public void verifyOtherreportsgclink()
	{
		String orTitle=homePage.verifyOtherreportsgc();
		Assert.assertEquals(orTitle, "BenAdmin Received Jobs","Other reports header not matched");
		System.out.println("Other reports header is:" +orTitle);
	}
	

	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}	
	
}

