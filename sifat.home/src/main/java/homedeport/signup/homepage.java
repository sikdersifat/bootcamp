package homedeport.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
public WebDriver driver;
	
	public homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//a[@id='headerMyAccount']")
	WebElement myaccount;
	
	@FindBy(xpath="//span[contains(text(),'Register')]")
	WebElement register;
	
	
	public void myaccount() {
		myaccount.click();
		
	}
	public void register() {
		register.click();
	}
}
