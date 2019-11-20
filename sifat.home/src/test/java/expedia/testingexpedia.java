package expedia;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class testingexpedia  {
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	expedia vacation=new expedia(driver);
	vacation.flight();
	  Thread.sleep(7000);
	  vacation.from("richmond");
	  Thread.sleep(4000);
	  
	  vacation.richmond();
	  Thread.sleep(2000);
      vacation.to("dhaka");
      vacation.dpdate();
      Thread.sleep(5000);
      vacation.date();
      Thread.sleep(3000);
    vacation.rtflight();
    Thread.sleep(5000);
    vacation.rtdate();
	  Thread.sleep(3000);
    
    vacation.search();
    //driver.getCurrentUrl();
   // driver.switchTo().window("https://www.expedia.com/Flights-Search?flight-type=on&starDate=11%2F22%2F2019&endDate=12%2F17%2F2019&mode=search&trip=roundtrip&leg1=from%3ARichmond%2C+VA+%28RIC-Richmond+Intl.%29%2Cto%3Adhaka%2Cdeparture%3A11%2F22%2F2019TANYT&leg2=from%3Adhaka%2Cto%3ARichmond%2C+VA+%28RIC-Richmond+Intl.%29%2Cdeparture%3A12%2F17%2F2019TANYT&passengers=children%3A0%2Cadults%3A1%2Cseniors%3A0%2Cinfantinlap%3AY&fareCalendarPrice=1871");
    
    
  
    
    flightpage fgb=new flightpage(driver);
  
    fgb.hotel();
    driver.navigate().back();
    Thread.sleep(9000);
    
   
    fgb.booking();
    Thread.sleep(5000);
    fgb.booink2();
 
    
    Thread.sleep(3000);
    
    fgb.noth();
    driver.navigate().back();
   String a= driver.getWindowHandle();
    System.out.println(a);
   
    
    Set <String> newpage=driver.getWindowHandles();
	System.out.println(newpage);
    
	for (String windowbrowser: newpage) {
		if (windowbrowser !=a) {
			driver.switchTo().window(windowbrowser);}}
	
	driver.navigate().refresh();
	Thread.sleep(5000);
	
	
	confirm cnfrm=new confirm(driver);
	cnfrm.bookflight();
			
    
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sikde\\eclipse-workspace\\airlines-expedia\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://expedia.com");
  }

  @AfterClass
  public void afterClass() {
  }

}
