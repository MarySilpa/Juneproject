package Pagepkg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocartpage {
	
	WebDriver dr;
	
	
	
	@FindBy(xpath="//*[@class = \"btn btn_primary btn_small btn_inventory \"]")
	List<WebElement> addtocart;
	
	public Addtocartpage(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	
	
	public void addtocartClick()
	{
		for(WebElement cart:addtocart)
		{
			cart.click();
		}
	}

}
