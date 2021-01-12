package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class HomePage  extends BasePage{

	
	private By _jobTitle = By.id("keywords");
	private By _location = By.id("location");
	private By _distance = By.id("distance");
	private By _moreOptionsLink = By.id("toggle-hp-search");
	
	private By _minSalary = By.id("salarymin");
	private By _maxSalary = By.id("salarymax");
	private By _salaryType = By.id("salarytype");
	private By _jobType = By.id("tempperm");
	
	private By _searchCTA = By.id("hp-search-btn");
	
	private By _acceptCookies = By.xpath("//*[@class='accept-all mat-button mat-button-base mat-raised-button']");
	private String  _cookiesFrame = "gdpr-consent-notice";
	
	
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	
	public void enterSearchwithjobTitleLocationandDistance(String job_title,String location,Integer distance) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(_jobTitle)).sendKeys(job_title);
		wait.until(ExpectedConditions.visibilityOfElementLocated(_location)).sendKeys(location);
		selectByValue(_distance, distance.toString());
	}
	
	public void clickOnMoreOptions() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(_moreOptionsLink)).click();
	}
	
	
	
	public void enterDataForMoreOptionsFields(Integer min_Salary, Integer max_Salary, String salary_Type , String job_Type) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(_minSalary)).sendKeys(min_Salary.toString());
		wait.until(ExpectedConditions.visibilityOfElementLocated(_maxSalary)).sendKeys(max_Salary.toString());
		selectByValue(_salaryType, salary_Type);
		selectByValue(_jobType, job_Type);
		
	}
	
	public void clickSearchCTA() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(_searchCTA)).click();
	}
	
	
	public void acceptAllCookies() {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(_cookiesFrame));
		driver.switchTo().frame(_cookiesFrame);
        wait.until(ExpectedConditions.visibilityOfElementLocated(_acceptCookies)).click();
        driver.switchTo().defaultContent();
	}
	
	
	public void selectByValue(By locator, String value) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
		Select select = new Select(driver.findElement(locator));
		select.selectByValue(value); 
		
	}
	
//	public void enterjobTitleAndLocation(String job_title, String location) {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(_jobTitle)).sendKeys(job_title);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(_location)).sendKeys(location);
//	}
//	
//	public void selectDistance(Integer distance) {
//		selectByValue(_distance, distance.toString());
//	}
//	
//	
//	public void enterMinimumAndMaximumSalary(Integer min_Salary , Integer max_Salary) {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(_minSalary)).sendKeys(min_Salary.toString());
//		wait.until(ExpectedConditions.visibilityOfElementLocated(_maxSalary)).sendKeys(max_Salary.toString());
//	}
//	
//	public void selectSalaryType(String salary_Type) {
//		selectByValue(_salaryType, salary_Type);
//		
//	}
//	
//	
//	public void selectJobType(String job_Type) {
//		selectByValue(_jobType, job_Type);
//	}

}
