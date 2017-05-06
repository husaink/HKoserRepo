package com.cucumber.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GoogleHomePage {
	
	@FindBy(name="q")
	private WebElement searchBar;
	
	@FindBy(name="btnG")
	private WebElement searchButton;
	private WebDriver driver ;
	
	public GoogleHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver ;
		PageFactory.initElements(driver, this);
		
	}
	
	public GoogleHomePage enterSearchKeyword(String keyword)
	{
		searchBar.sendKeys(keyword);
		return  this;
	}
	
	public GoogleSearchPage clickSearchButton()
	{
		searchButton.click();
		return new GoogleSearchPage(driver);
	}
	
	
	
	
	

}
