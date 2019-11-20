package homedeport.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerpage {
	public WebDriver driver;


	public registerpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
		
}

@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="password-input-field")
	WebElement password;
	
	@FindBy (id="zipCode")
	WebElement zip;
	
	@FindBy (id="phone")
	WebElement phone;
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div[2]/form/button[1]/span")
	WebElement createbutton;
	
	


public void email(String emailid) {
	email.sendKeys(emailid);
	
	
}

public void password(String pass) {
	password.sendKeys(pass);
}

public void zip(String zipcode) {
	zip.sendKeys(zipcode);

}

public void phone(String phnumber) {
	phone.sendKeys(phnumber);
	
}
 public void createbutton() {
	createbutton.click();
}

}

