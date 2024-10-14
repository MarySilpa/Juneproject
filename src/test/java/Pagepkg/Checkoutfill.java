package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutfill {
	
	WebDriver dr;
	
	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement Firstname;
	
	@FindBy(xpath="//*[@id=\"last-name\"]")
	WebElement Lastname;
	
	@FindBy(xpath="//*[@id=\"postal-code\"]")
	WebElement Postalcode;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement Continue;
	
	@FindBy(xpath="//*[@id=\"finish\"]")
	WebElement Finish;
	
	@FindBy(xpath="//*[@id=\"back-to-products\"]")
	WebElement Backbutton;
	
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	WebElement Hamburger;
	
	@FindBy(xpath="/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]")
	WebElement logoutbutton;
	
	public Checkoutfill(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	public void setValues(String firstname,String lastname,String postalcode)
	{
		Firstname.sendKeys(firstname);
		Lastname.sendKeys(lastname);
		Postalcode.sendKeys(postalcode);
	}
	
	public void continueclick()

	{
		Continue.click();
		
	}
	
	public void finishbutton()
	{
		Finish.click();
	}
	
	public void backbutton()
	{
		Backbutton.click();
	}
	
	public void burgermenu()
	{
		Hamburger.click();
		
	}
	
	public void Logoclick() {
		
		logoutbutton.click();
		
	}
}
