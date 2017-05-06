package com.cucumber.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumber.selenium.CucumberHomePage;
import com.cucumber.selenium.GoogleHomePage;
import com.cucumber.selenium.GoogleSearchPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSD {
	
	private WebDriver driver;
	GoogleHomePage googleHome ;
	GoogleSearchPage googleSearch;
	CucumberHomePage cucuHomePage;
	
	private final String URL = "https://www.google.co.in";
	@Before
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	@Given("^User is on google home page$")
	public void user_is_on_google_home_page() throws Throwable {
	    
		driver.get(URL);
	    
	}

	@When("^User search \"([^\"]*)\" keyword$")
	public void user_search_keyword(String arg1) throws Throwable {
		googleHome = new GoogleHomePage(driver);
	    googleHome.enterSearchKeyword(arg1);
	    
	}

	@And("^Clicks Google Search$")
	public void clicks_Google_Search() throws Throwable {
	    googleSearch = googleHome.clickSearchButton();
	    
	}

	@Then("^User is displayed searched results$")
	public void user_is_displayed_searched_results() throws Throwable {
		Thread.sleep(2000);
	    System.out.println(googleSearch.getTitle());
		Assert.assertTrue("cucumber - Google Search".equalsIgnoreCase(googleSearch.getTitle()));
		cucuHomePage = googleSearch.clickLink();
		Thread.sleep(2000);
		//System.out.println(cucuHomePage.getHomeScreenText());
		Assert.assertTrue("Cucumber".equalsIgnoreCase(cucuHomePage.getHomeScreenText()));
		
	   // System.out.println("--------------Test Case Completed Successfully-------------");
	}
	
	

	@After()
	public void tearDown()
	{
		driver.quit();
	}

}
