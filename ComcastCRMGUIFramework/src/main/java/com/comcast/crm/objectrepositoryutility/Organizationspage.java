package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizationspage {
	WebDriver driver;
	public Organizationspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement createNewOrgBtn;
	
	@FindBy(name="search_text")
	private WebElement searchEdt;
	
	@FindBy(name="search_field")
	private WebElement searchDD;
	
	@FindBy(name="submit")
	private WebElement searchBtn;
	


	public WebElement getCreateNewOrgBtn() {
		return createNewOrgBtn;
	}
	
	public WebElement getSearchEdt() {
		return searchEdt;
	}

	public WebElement getSearchDD() {
		// TODO Auto-generated method stub
		return searchDD;
	}

	public WebElement getSearchBtn() {
		// TODO Auto-generated method stub
		return searchBtn;
	}


}
