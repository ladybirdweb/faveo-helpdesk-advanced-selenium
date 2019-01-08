package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.addcategory;

public class Addcategoy extends Basetest 
{
	@Test
	public void Ttest()
	{
		addcategory category=new addcategory(driver);
		category.clicklogin11();
		category.username11(input.getdata(excel, "sheet1", 0,1));
		category.passsword11(input.getdata(excel, "sheet1", 1, 1));
		category.clicklogin21();
		category.clicktoolspage();
		category.clickknowledgebase();
		category.clickcategories();
		category.clickaddcategory();
	}

}
