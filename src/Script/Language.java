package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.language;

public class Language extends Basetest 
{
@Test
public void Test25()
{
	language lang=new language(driver);
	lang.clicklogin();
	lang.username(input.getdata(excel, "sheet1", 0, 1));
	lang.passsword(input.getdata(excel, "sheet1", 1, 1));
	lang.clicklogin1();
	lang.clickAdminpanel();
	lang.clicklanguage();
}
}
