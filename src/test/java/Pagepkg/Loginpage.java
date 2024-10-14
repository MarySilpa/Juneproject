package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver dr;
	
	@FindBy(id="user-name")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(name="login-button")
	WebElement Loginbutton;
	
	public Loginpage(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	public void setValues(String usname,String uspass)
	{
		Username.clear();
		Username.sendKeys(usname);
		Password.clear();
		Password.sendKeys(uspass);
	}
	
	public void loginButtonClick()
	{
		Loginbutton.click();
	}
	

}
