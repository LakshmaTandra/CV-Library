package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchResultsPage  extends BasePage{
	
	private By _searchResultsTitle = By.className("search-header__title");
	

	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}

	
	public String getSearchResultsText() {
	 return wait.until(ExpectedConditions.visibilityOfElementLocated(_searchResultsTitle)).getText();
	}
	
	
	
}
