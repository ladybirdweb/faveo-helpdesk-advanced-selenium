package scriptsAgent;

import Generic.Basetest;
import Generic.input;
import Page.addcategory;

import org.testng.annotations.Test;

public class Categories extends Basetest 
{
	@Test
	public void Test()
	{
		addcategory category=new addcategory(driver);
		category.clicklogin11();
		category.username11(input.getdata(excel, "sheet1", 0, 1));
		category.passsword11(input.getdata(excel, "sheet1", 1, 1));
		category.clicklogin21();
		category.clicktoolspage();
		category.clickknowledgebase();
		category.clickcategories();
	}

}
