package expedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class confirm {
	
public WebDriver driver;
	
	public confirm(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

}
@FindBy(id="bookButton")
WebElement bookflight;


public void bookflight() {
	bookflight.click();
}
	
	
}