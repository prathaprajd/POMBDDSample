package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseData.TestBase;



public class LoginPage extends TestBase{
	
	@FindBy(xpath="//input[@type='email']")
	WebElement username;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement next;
	
	@FindBy(xpath="//img[contains(@class,'d-block mar-b-15')]")
	WebElement logo;
		
	public LoginPage() {
		PageFactory.initElements(driver, LoginPage.class);	//instead of Loginpage.class we shall user 'THIS' too
		
	}
	
	public String validateLoginUrl() {
		return driver.getCurrentUrl();
	}
	
	public boolean albertLogo() {
		return logo.isDisplayed();
		
	}
	
	public HomePage login(String un){
		username.sendKeys(un);
		//loginBtn.click();
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", next);
		    	
		return new HomePage();
	}

}

