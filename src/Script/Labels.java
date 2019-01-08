package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.labels;

public class Labels extends Basetest 
{
@Test
public void Test16()
{
	labels label=new labels(driver);
	label.clicklogin();
	label.username(input.getdata(excel, "sheet1", 0, 1));
	label.passsword(input.getdata(excel, "sheet1", 1, 1));
	label.clicklogin1();
	label.clickAdminpanel();
	label.clicklabels();
}
}
