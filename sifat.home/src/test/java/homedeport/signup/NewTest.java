package homedeport.signup;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException {
		 homepage home=new homepage(driver);
		  home.myaccount();
		  
		  Thread.sleep(8000);
		  home.register();
		  
		  Thread.sleep(5000);
		  
		  registerpage rgpg=new registerpage(driver);
		  rgpg.email("sifatsifat98@gmail.com");
		  rgpg.password("Iluneytiri@41");
		  rgpg.zip("23233");
		  rgpg.phone("8049823225");
		  Thread.sleep(3000);
		  rgpg.createbutton();

	
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sikde\\eclipse-workspace\\airlines-expedia\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://homedepot.com");
	
		
  }

  @AfterClass
  public void afterClass() {
  }

}
