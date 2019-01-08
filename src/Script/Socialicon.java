package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.socialicons;

public class Socialicon extends Basetest 
{
@Test
public void Test14()
{
	socialicons icons=new socialicons(driver);
	icons.clicklogin();
	icons.username(input.getdata(excel, "sheet1", 0, 1));
	icons.passsword(input.getdata(excel, "sheet1", 1, 1));
	icons.clicklogin1();
	icons.clickAdminpanel();
	icons.clicksocialicon();
	
}
}
