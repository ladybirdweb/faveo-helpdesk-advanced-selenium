package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.ticketvolumetrends;

public class ticketvolumetrend extends Basetest 
{
@Test
public void Test3()
{
	ticketvolumetrends trends=new ticketvolumetrends(driver);
	trends.clicklogin11();
	trends.username11(input.getdata(excel, "sheet1", 0, 1));
	trends.passsword11(input.getdata(excel, "sheet1", 1, 1));
	trends.clicklogin21();
	trends.clickreportpage();
	trends.clickticketvolumetrends();
}
}
