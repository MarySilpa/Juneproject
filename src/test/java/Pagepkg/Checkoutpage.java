package Pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {
	
	WebDriver dr;
	JavascriptExecutor js=(JavascriptExecutor) dr;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement cartbutton;
	
	@FindBy(xpath="//*[@id=\"checkout\"]")
	WebElement checkoutbutton;
	
	public Checkoutpage(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	public void cartclick()
	{
		cartbutton.click();
		
	}
	
	public void checkoutclick()
	{
		checkoutbutton.click();
	}
	
	
	
	
	

}
