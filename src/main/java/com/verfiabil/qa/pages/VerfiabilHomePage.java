package com.verfiabil.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.verfiabil.qa.base.TestBase;

public class VerfiabilHomePage extends TestBase{

	
	@FindBy(xpath="//img[@class='logo-default']")
	WebElement iconhomepage;
	
	@FindBy(xpath="//div[@class='input-group']//input[@placeholder='Search...']")
	WebElement search;
			
	@FindBy(xpath="//div[@class='jtable-title-text']")
	WebElement tenantsheader;
	
	@FindBy(xpath="//li[@id='header_notification_bar']//a[@class='dropdown-toggle']")
	WebElement notifications;
		
	@FindBy(xpath="//span[@class='title'][contains(text(),'Tenants')]")
	WebElement tenants;
	

	
	//actions
	@FindBy(xpath="//button[@class='btn btn-info dropdown-toggle']")
	WebElement actions;
	//elements under actions
		@FindBy(xpath="//a[contains(text(),'Add Group')]")
		WebElement addgroup;
		
		@FindBy(xpath="//div[@class='page-content-wrapper']//li[2]//a[1]")
		WebElement addbroker;
		
		@FindBy(xpath="//a[contains(text(),'Add Broker Company')]")
		WebElement addbrokercompany;

		
		
	//administration			
	@FindBy(xpath="//span[contains(text(),'Administration')]")
	WebElement administration;
    //elements under administration
	@FindBy(xpath="//span[@class='title'][contains(text(),'Roles')]")
	WebElement roles;
	
	@FindBy(xpath="//span[@class='title'][contains(text(),'Users')]")
	WebElement users;
	
	@FindBy(xpath="//span[@class='title'][contains(text(),'Audit logs')]")
	WebElement auditlogs;
	
	@FindBy(xpath="//span[@class='title'][contains(text(),'Maintenance')]")
	WebElement maintainence;
	
	@FindBy(xpath="//span[@class='title'][contains(text(),'Settings')]")
	WebElement settings;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/ng-component[1]/div[2]/div[2]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/span[1]")
	WebElement rolesheader;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/ng-component[1]/div[2]/div[2]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/span[1]")
	WebElement usersheader;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/ng-component[1]/div[2]/div[2]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/span[1]")
	WebElement auditlogsheader;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/ng-component[1]/div[2]/div[2]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/span[1]")
	WebElement maintainenceheader;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/ng-component[1]/div[2]/div[2]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/span[1]")
	WebElement settingsheader;
	
	
	
	
	
	
	
	
	
	
	//group configuration
	@FindBy(xpath="//span[contains(text(),'Group Configuration')]")
	WebElement groupconfig;
	//elements under group config
	@FindBy(xpath="//span[contains(text(),'Service Fee Configuration')]")
	WebElement servicefeeconfig;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/ng-component[1]/div[2]/div[2]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]")
	WebElement servicefeeconfigheader ;	
		
	@FindBy(xpath="//span[contains(text(),'Carrier Management')]")
	WebElement carriermanagement;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/ng-component[1]/div[2]/div[2]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]")
	WebElement carriermanagementheader;
	
	@FindBy(xpath="//span[contains(text(),'Account Number Management')]")
	WebElement accountnumbermanagement;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/ng-component[1]/div[2]/div[2]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]")
	WebElement accountnumbermanagementheader;
	
	@FindBy(xpath="//span[contains(text(),'Self-insured Plan Cost Modification')]")
	WebElement selfinsuredplan;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/ng-component[1]/div[2]/div[2]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]")
	WebElement selfinsuredplanheader;
	
	

	
	//data collection
	@FindBy(xpath="//span[contains(text(),'Data Collection')]")
	WebElement datacollection;
	//elements under data collection
	@FindBy(xpath="//span[contains(text(),'Import Carrier Data')]")
	WebElement importcarrierdata;
	
	@FindBy(xpath="//span[contains(text(),'Import BenAdmin Data')]")
	WebElement importbenadmindata;
	
	@FindBy(xpath="//span[contains(text(),'Review Invoices')]")
	WebElement reviewinvoice;
	
	@FindBy(xpath="//span[contains(text(),'Resolve Name Mismatches')]")
	WebElement resolvenamemismatch;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/ng-component[1]/div[2]/div[2]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/span[1]")
	WebElement importcarrierdataheader;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/ng-component[1]/div[2]/div[2]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/span[1]")
	WebElement importbenadmindataheader;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/ng-component[1]/div[2]/div[2]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/span[1]")
	WebElement reviewinvoiceheader;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/ng-component[1]/div[2]/div[2]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/span[1]")
	WebElement resolvenamemismatchheader;
	
	
	
	
	
	
	//audit
	@FindBy(xpath="//a[@class='auto']//span[@class='title'][contains(text(),'Audit')]")
	WebElement audit;
	//elements under audit
	@FindBy(xpath="//li[@class='open']//li[1]//a[1]//span[1]")
	WebElement discrepancies;
	
	@FindBy(xpath="//span[contains(text(),'Follow up Discrepancies')]")
	WebElement followupdicrepancies;
	
	@FindBy(xpath="//span[contains(text(),'No Discrepancies')]")
	WebElement nodiscrepancies;
		
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/ng-component[1]/div[2]/div[2]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement discrepanciesheader;	
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/ng-component[1]/div[2]/div[2]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]")
	WebElement followupdicrepanciesheader;	
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/ng-component[1]/div[2]/div[2]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]")
	WebElement nodiscrepanciesheader;
	
	
	
	
	
	
	
	//billing
	@FindBy(xpath="//span[contains(text(),'Billing')]")
	WebElement billing;
	//elements under billing
	@FindBy(xpath="//span[contains(text(),'Payments')]")
	WebElement payments;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/ng-component[1]/div[2]/div[2]/div[1]/ng-component[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/span[1]")
	WebElement paymentheader;
	
	
	
	//reports
	@FindBy(xpath="//a[@class='auto']//span[@class='title'][contains(text(),'Reports')]")
	WebElement reports;
	//elements under reports
	@FindBy(xpath="//span[contains(text(),'Carrier Invoice Summary')]")
	WebElement carrierinvoicesummary;
	
	@FindBy(xpath="//span[contains(text(),'Cost Allocation and Disc ID')]")
	WebElement costallocanddescid;
	
	@FindBy(xpath="//span[contains(text(),'Upload Custom Reports')]")
	WebElement uploadcustomreport;
	
	@FindBy(xpath="//span[contains(text(),'Other Reports')]")
	WebElement otherreports;
	
	@FindBy(xpath="//label[contains(text(),'Billing Month:')]")
	WebElement carrierinvoicesummarybillingheader;
	
	@FindBy(xpath="//label[contains(text(),'BenAdmin:')]")
	WebElement costallocanddescidbenadminheader;
	
	@FindBy(xpath="//button[@class='btn btn-primary floatright']")
	WebElement uploadcustomreportbuttonheader;
	
	@FindBy(xpath="//h5[contains(text(),'BenAdmin Received Jobs')]")
	WebElement otherreportsheader;
		
	
	
	
	

	
	
	
	//Initializing the Page Objects:
			public VerfiabilHomePage(){
				PageFactory.initElements(driver, this);
			}
	
			//actions
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public String verifyTenantsHeader()
	{
	return tenants.getText();
	
	}
	public GroupCreationPage clickOnAddGroup(){
		
		actions.click();
		addgroup.click();
		return new GroupCreationPage();
	}
	
	
	public BrokerCreationPage clickOnAddBroker() {
		actions.click();
		addbroker.click();
	return new BrokerCreationPage();
	}
	
	public String verifyCarriermanagementgc()
	{
		groupconfig.click();
		carriermanagement.click();
		return carriermanagementheader.getText();
	}
	
	public String verifyAccountNmbergc()
	{
		groupconfig.click();
		accountnumbermanagement.click();
		return accountnumbermanagementheader.getText();
	}
	
	public String verifyServicefeegc()
	{
		groupconfig.click();
		servicefeeconfig.click();
		return servicefeeconfigheader.getText();
	}
	
	public String verifySelfcostplangc()
	{
		groupconfig.click();
		selfinsuredplan.click();
		return selfinsuredplanheader.getText();
	}
	
	public String verifyImportcarrierdatagc()
	{
		datacollection.click();
		importcarrierdata.click();
		return importcarrierdataheader.getText();
	}
	
	public String verifyImportbenadmindatagc()
	{
		datacollection.click();
		importbenadmindata.click();
		return importbenadmindataheader.getText();
	}
	
	public String verifyReviewinvoicesgc()
	{
		datacollection.click();
		reviewinvoice.click();
		return reviewinvoiceheader.getText();
	}
	
	public String verifyResolenaamemismatchgc()
	{
		datacollection.click();
		resolvenamemismatch.click();
		return resolvenamemismatchheader.getText();
	}
	
	public String verifyDiscrepanciesgc()
	{
		audit.click();
		discrepancies.click();
		return discrepanciesheader.getText();
	}
	
	public String verifyFollowupdiscrepancygc()
	{
		audit.click();
		followupdicrepancies.click();
		return followupdicrepanciesheader.getText();
	}
	
	public String verifyNodiscreapnciesgc()
	{
		audit.click();
		nodiscrepancies.click();
		return nodiscrepanciesheader.getText();
	}
	
	public String verifyCarrierinvoicesummarygc()
	{
		reports.click();
		carrierinvoicesummary.click();
		return carrierinvoicesummarybillingheader.getText();
	}
	
	public String verifyCostallocationgc()
	{
		reports.click();
		costallocanddescid.click();
		return costallocanddescidbenadminheader.getText();
	}
	
	
	public String verifyUploadcustomreportgc()
	{
		reports.click();
		uploadcustomreport.click();
		return uploadcustomreportbuttonheader.getText();
	}
	
	public String verifyOtherreportsgc()
	{
		reports.click();
		otherreports.click();
		return otherreportsheader.getText();
	}
	
	public String verifyRolesgc()
	{
		administration.click();
		roles.click();
		return rolesheader.getText();
	}
	
	public String verifyUsersgc()
	{
		administration.click();
		users.click();
		return usersheader.getText();
	}
	
	public String verifyAuditlogsgc()
	{
		administration.click();
		auditlogs.click();
		return auditlogsheader.getText();
	}
	
	public String verifyMaintainencegc()
	{
		administration.click();
		maintainence.click();
		return maintainenceheader.getText();
	}
	
	public String verifySettingsgc()
	{
		administration.click();
		settings.click();
		return settingsheader.getText();
	}
	
	
	
	
	
	
	
	public String verifyBillingslink()
	{
		billing.click();
		payments.click();
		return paymentheader.getText();	
	}
	
	
} 
