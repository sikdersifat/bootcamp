package expedia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class expedia {

public WebDriver driver;
	
	public expedia(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
}

@FindBy(id="tab-flight-tab-hp")
WebElement flight;
@FindBy(id="flight-origin-hp-flight")
WebElement from;

@FindBy(xpath="/html/body/meso-native-marquee/section/div/div/div[1]/section/div/div[2]/div[2]/section[1]/form/div[3]/div[1]/div/div[2]/ul/div/li[1]/a/span[2]/div")
WebElement richmond;

@FindBy(id="flight-destination-hp-flight")
WebElement to;
@FindBy(id="flight-departing-hp-flight")
WebElement dpdate;
@FindBy(xpath="/html/body/meso-native-marquee/section/div/div/div[1]/section/div/div[2]/div[2]/section[1]/form/fieldset[2]/div/div[2]/div/div/div[2]/div[2]/table/tbody/tr[5]/td[7]/button")
WebElement date;

@FindBy(id="flight-returning-hp-flight")
WebElement rtflight;

@FindBy(xpath="/html/body/meso-native-marquee/section/div/div/div[1]/section/div/div[2]/div[2]/section[1]/form/fieldset[2]/div/div[3]/div/div/div[2]/div[3]/table/tbody/tr[3]/td[3]/button")
WebElement rtdate;

@FindBy(xpath="//form[@id='gcw-flights-form-hp-flight']//button[@class='btn-primary btn-action gcw-submit']")
WebElement search;


public void flight() {
	flight.click();
}
public void from(String flight_from) {
	from.sendKeys(flight_from);
	
	//Select airport=new Select(driver.findElement(By.id("flight-origin-hp-flight-airport_code")));
	
}
public void to(String flight_to) {
	to.sendKeys(flight_to);
}

public void dpdate() {
	dpdate.click();
	

}
public void date() {
	date.click();
}

public void rtdate() {
	rtdate.click();
}
public void rtflight() {
	rtflight.click();
}
public void search() {
	search.click();
}
public void richmond() {
	richmond.click();
}

}
