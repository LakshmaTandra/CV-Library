package stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

import pages.HomePage;
import pages.SearchResultsPage;

public class JobSearchSteps {
	
	private TestBase base;
	HomePage homePage;
	SearchResultsPage searchResultsPage;
	
	public JobSearchSteps(TestBase base) {
		this.base = base;
	}



	@Given("User is on CV-Library Homepage")
	public void user_is_on_cv_library_homepage() throws IOException {
		System.out.println("Home Page");
		base.driver.get(base.getProperty("Url"));
		homePage = new HomePage(base.driver);
		homePage.acceptAllCookies();
	}


	
	@When("User Enters {string}  {string} and selects {int} miles")
	public void user_enters_and_selects_miles(String jobTitle, String location, Integer distance) {
		
		homePage.enterSearchwithjobTitleLocationandDistance(jobTitle, location, distance);
		
		
	}
	
	
	@And("User clicks on More Options")
	public void user_clicks_on_more_options() {

		homePage.clickOnMoreOptions();
	}
	
	
	
	@And("Enters {int} , {int} , {string} and {string}")
	public void enters_and(Integer minSalary, Integer maxSalary, String salaryType, String jobType) {

		homePage.enterDataForMoreOptionsFields(minSalary, maxSalary, salaryType, jobType);
		
		
	}
	
	
	@And("Clicks on FindJobs button")
	public void clicks_on_find_jobs_button() {
	
		homePage.clickSearchCTA();
	}
	
	
	
	@Then("verify search results are displayed with {string}")
	public void verify_search_results_are_displayed(String jobTitle) {
		searchResultsPage = new SearchResultsPage(base.driver);
	    String searchText = searchResultsPage.getSearchResultsText();
	    Assert.assertTrue(searchText.contains(jobTitle));
	}

	

	

}
