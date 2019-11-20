package expedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flightpage {

public WebDriver driver;
	
	public flightpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}


	
@FindBy(xpath="//li[@id='flight-module-2019-11-30t15:51:00-05:00-coach-ric-phl-aa-4863-coach-phl-doh-qr-728-coach-doh-dac-qr-638_2019-12-17t17:50:00+06:00-coach-dac-doh-qr-635-coach-doh-bos-qr-743-coach-bos-ric-b6-381_']//button[@class='btn-secondary btn-action t-select-btn']")
WebElement fgt;

@FindBy(id="primary-header-hotel")
WebElement hotel;

@FindBy(xpath="/html/body/div[2]/div[10]/section/div/div[11]/ul/li[1]/div[1]/div[1]/div[2]/div/div[2]/button")
WebElement rgt;


@FindBy(id="forcedChoiceNoThanks")
WebElement noth;

public void booking() {
	fgt.click();
}

public void hotel() {
	hotel.click();
}
public void booink2() {
	rgt.click();
}

public void noth() {
	noth.click();
}
}