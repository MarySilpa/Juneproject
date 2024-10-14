package Testpkg;

import java.time.Duration;

import org.testng.annotations.Test;

import Basepkg.Baseclass;
import Pagepkg.Addtocartpage;
import Pagepkg.Checkoutfill;
import Pagepkg.Checkoutpage;
import Pagepkg.Loginpage;
import Utilities.Sauceutils;

public class Saucetest extends Baseclass {
	
	@Test
	public void verifyloginwithcred() throws Exception
	{
		Loginpage lp=new Loginpage(dr);
		Addtocartpage a = new Addtocartpage (dr);
		Checkoutpage cp=new Checkoutpage(dr);
		Checkoutfill cf=new Checkoutfill(dr);
		
		String xl="D:\\saucecredentials.xlsx";
		
		String Sheet="Sheet1";
		
		int rowcount=Sauceutils.getRowCount(xl, Sheet);
		
		for(int i=1;i<rowcount;i++)
		{
			String Username=Sauceutils.getCellValue(xl, Sheet, i, 0);
			System.out.println("Username..."+Username);
			String Password=Sauceutils.getCellValue(xl, Sheet, i, 1);
			System.out.println("Password..."+Password);
			lp.setValues(Username, Password);
			lp.loginButtonClick();
			
			
			String Expurl="https://www.saucedemo.com/inventory.html";
			String Acturl=dr.getCurrentUrl();
			if(Acturl.equals(Expurl))
					{
				System.out.println("Pass");
				a.addtocartClick();
				cp.cartclick();
				cp.checkoutclick();
				cf.setValues("Mary Silpa", "N A", "682008");
				cf.continueclick();
				cf.finishbutton();
				cf.backbutton();
				cf.burgermenu();
				dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				cf.Logoclick();
				
					}
			else
			{
				System.out.println("Fail");
			}
		}
		
	}
	
	
	
	

}
