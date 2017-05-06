package com.cucumber.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
	
	@FindBy(linkText="Cucumber")
	private WebElement cucumberLink ;
	
	private WebDriver driver;
	
	public GoogleSearchPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public CucumberHomePage clickLink()
	{
		cucumberLink.click();
		return new CucumberHomePage(driver);
	}
	
	

}
