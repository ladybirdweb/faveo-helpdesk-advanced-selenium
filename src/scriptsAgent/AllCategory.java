package scriptsAgent;

import Generic.Basetest;
import Generic.input;
import Page.allcategory;

import org.testng.annotations.Test;

public class AllCategory extends Basetest 
{
	@Test
	public void Test() 
	{
		allcategory all=new allcategory(driver);
		all.clicklogin11();
		all.username11(input.getdata(excel, "sheet1", 0, 1));
		all.passsword11(input.getdata(excel, "sheet1", 1, 1));
		all.clicklogin21();
		all.clicktoolspage();
		all.clickknowledgebase();
		all.clickcategories();
		all.clickallcategory();
	}

}
