package com.e2etests.automation.page_objects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class TicketSearchPage {
	
	private ConfigFileReader configFileReader;
	
	/*@FindBy*/
	@FindBy(how = How.ID ,using = "departure-place")
	public static WebElement departurePlaceList;
	//@FindBy(how = How.XPATH , using = "//div[@attribut = 'Paris (Toutes gares)']")
	//public static WebElement departurePlace ;
	@FindBy(how = How.ID ,using = "arrival-place")
	public static WebElement arrivalPlaceList;
	//@FindBy(how = How.XPATH ,using = "//div[@attribut = 'Toulouse Matabiau']")
	//public static WebElement arrivalPlace;
	@FindBy(how = How.ID ,using = "miv-btn-modify-time-itinerary")
	public static WebElement btnDateHour;
	@FindBy(how = How.ID ,using = "search-date")
	public static WebElement dateList;
	@FindBy(how = How.NAME ,using = "search-time")
	public static WebElement timeList;
	@FindBy(how = How.ID ,using = "search-hour")
	public static WebElement hourList;
	@FindBy(how = How.ID ,using = "search-minute")
	public static WebElement minuteList;
	@FindBy(how = How.XPATH ,using = "//button[@class='btn btn-default btn-block miv-tab-btn-search']")
	public static WebElement searchBtn;
	@FindBy(how = How.XPATH,using = "//li[1]//a[1]//div[1]//div[1]//div[2]//ol[1]//li[1]//span[3]")
	public static WebElement researchResult;
	@FindBy(how = How.XPATH ,using = "//span[normalize-space()='Trajets suggérés']")
	public static WebElement suggestedMessage;
	@FindBy(how = How.XPATH ,using = "//strong[normalize-space()='Train TGV INOUI N°8501']")
	public static WebElement validationMessage;
	
		
	public TicketSearchPage() {
		PageFactory.initElements(Setup.driver,this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/*Create Method*/
	public void goToUrl() {
	Setup.driver.get(configFileReader.getProperties("home.url"));	
	}
	
	public void SelectDeparturePlace(String departure ) {
		departurePlaceList.click();
		Actions action = new Actions(Setup.driver);
        action.sendKeys(departurePlaceList,departure).sendKeys(Keys.ENTER).click().build().perform();
        departurePlaceList.click();
		
			}
	
	public void SelectArrivalPlace(String arrival ) {
		arrivalPlaceList.click();
		Actions action = new Actions(Setup.driver);
        action.sendKeys(arrivalPlaceList,arrival).sendKeys(Keys.ENTER).click().build().perform();
        arrivalPlaceList.click();
		
			}
	
	public void ClickOnButtonDateAndHour() {
		btnDateHour.click();
	}
		
	public void SelectDate(String btnDate ) {
		dateList.click();
		Actions action = new Actions(Setup.driver);
        action.sendKeys(dateList,btnDate).sendKeys(Keys.ENTER).click().build().perform();
        //DateList.click();
		
	}	
	
	public void ClickButtonTime() {
		timeList.click();
		
	}	
	
	public void SelectHour() {
		hourList.click();
		Select HourList1 = new Select(hourList);
		HourList1.selectByValue("16");
		
	}	
	public void SelectMinutes( ) {
		minuteList.click();
		Select HourList1 = new Select(minuteList);
		HourList1.selectByValue("00");
		
	}	
	public void clickOnButtonSearch( ) {
		searchBtn.click();
	}
	
	public void clickresearchResultTgvINOUI( ) {
		researchResult.click();
	}
	
	
	
	
	
	
	
	
	

}
