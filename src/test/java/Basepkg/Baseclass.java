package Basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Baseclass {
	
	public static WebDriver dr;

	@BeforeTest
	public void setUp()
	{
		dr=new ChromeDriver();
	}
	
	@Test
	public void test()
	{
		dr.get("https://www.saucedemo.com/");
		dr.manage().window().maximize();
	}
}
