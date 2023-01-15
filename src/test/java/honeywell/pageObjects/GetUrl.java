package honeywell.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class GetUrl {
	WebDriver ldriver;
  public GetUrl(WebDriver rdriver) {
	  ldriver= rdriver;
	  PageFactory.initElements(rdriver, this);
  }
	public void url(String urlPass) {
		
			ldriver.get(urlPass);
		
		
	}
	
	
	public void click(FirefoxDriver driver,Object obj) {
		Dataprovider.obj
		driver.findElement(By.id("")).click();
		
	}
	
	
}
