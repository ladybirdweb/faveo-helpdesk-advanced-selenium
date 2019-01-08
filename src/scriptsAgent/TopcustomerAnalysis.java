package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.topcustomeranalysis;

public class TopcustomerAnalysis extends Basetest 
{
@Test
public void Test10()
{
	topcustomeranalysis analysis=new topcustomeranalysis(driver);
	analysis.clicklogin11();
	analysis.username11(input.getdata(excel, "sheet1", 0, 1));
	analysis.passsword11(input.getdata(excel, "sheet1", 1, 1));
	analysis.clicklogin21();
	analysis.clickreportpage();
	analysis.clicktopcustomeranalysis();
}
}
