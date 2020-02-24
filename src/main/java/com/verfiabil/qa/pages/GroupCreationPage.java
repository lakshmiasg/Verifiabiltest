package com.verfiabil.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.verfiabil.qa.base.TestBase;

public class GroupCreationPage extends TestBase {

	@FindBy(xpath="//span[contains(text(),'Create new group')]")
	WebElement createnewgrouptest;
	
	@FindBy(xpath="//input[@name='tenancyName']")
	WebElement tenancyname;
	
	@FindBy(xpath="//input[@name='Name']")
	WebElement name;
	
	@FindBy(xpath="//input[@name='AdminEmailAddress']")
	WebElement adminemail;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	WebElement nextbutton;
	
	@FindBy(xpath="//select[@id='benAdmin']")
	WebElement benadmindropdown;
	
	@FindBy(xpath="//input[@name='Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='address1']")
	WebElement address;
		
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement state;
	
	@FindBy(xpath="//input[@name='zip']")
	WebElement zipcode;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	WebElement next1;
	
	@FindBy(xpath="//createtenantgrouporbrokermodal[@class='ng-tns-c1-0']//button[3]")
	WebElement savebutton;
	
	@FindBy(xpath="//div[@class='text-right']//button[@class='btn btn-default'][contains(text(),'Cancel')]")
	WebElement cancel;
	
	@FindBy(xpath="//div[@class='modal-body']//div//button[@class='btn btn-default'][contains(text(),'Cancel')]")
	WebElement cancel1;
	
	@FindBy(xpath="//div[@class='modal-body']//div//button[@class='btn btn-default'][contains(text(),'Cancel')]")
	WebElement cancel2;
	
	@FindBy(xpath="//button[contains(text(),'Previous')]")
	WebElement previous;
	
	@FindBy(xpath="//button[contains(text(),'Previous')]")
	WebElement previous1;
	
	//Initializing the Page Objects:
	public GroupCreationPage(){
		PageFactory.initElements(driver, this);
	}
	
	//actions
	public boolean grouppageCheck()
	{
	return createnewgrouptest.isDisplayed();
	}
	
	 public void createnewGroup(String gtenancyname, String gname, String gadminemail, String gemail, String gaddress, String gcity, String gstate, String gzipcode) throws InterruptedException
	 {
	    Thread.sleep(5000);
		 tenancyname.sendKeys(gtenancyname);
		 name.sendKeys(gname);
		 adminemail.sendKeys(gadminemail);
		 nextbutton.click();
		 email.sendKeys(gemail);
		 address.sendKeys(gaddress);
		 city.sendKeys(gcity);
		 state.sendKeys(gstate);
		 zipcode.sendKeys(gzipcode);
		 next1.click();
		 savebutton.click();
		// Thread.sleep(5000);
	 } 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
}
