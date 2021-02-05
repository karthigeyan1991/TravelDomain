package org.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilityclass.UtilityClass;

public class HomePageLocator extends UtilityClass {
	
	public HomePageLocator(){
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getFromCity() {
		return fromCity;
	}

	public WebElement getToCity() {
		return toCity;
	}

	public WebElement getFromCitySearchBar() {
		return fromCitySearchBar;
	}

	public WebElement getToCitySearchBar() {
		return toCitySearchBar;
	}


	@FindBy (xpath="//span[text()='DEL, Delhi Airport India']")
	private WebElement fromCity;
	
	
	@FindBy (xpath="//span[text()='BLR, Kempegowda International Airport India']")
	private WebElement toCity;
	
	
	@FindBy (xpath="//input[@class='react-autosuggest__input react-autosuggest__input--open']")
	private WebElement fromCitySearchBar;
	
	@FindBy (xpath="//input[@class='react-autosuggest__input react-autosuggest__input--open']")
	private WebElement toCitySearchBar; 
	
	@FindBy (xpath="//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")
	private WebElement searchBtn;

	public WebElement getSearchBtn() {
		return searchBtn;
	}


	public void setSearchBtn(WebElement searchBtn) {
		this.searchBtn = searchBtn;
	}
	

}