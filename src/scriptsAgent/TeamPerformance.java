package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.teamperformance;

public class TeamPerformance extends Basetest 
{
@Test	
public void Test6()
	{
		teamperformance performance=new teamperformance(driver);
		performance.clicklogin11();
		performance.username11(input.getdata(excel, "sheet1", 0, 1));
		performance.passsword11(input.getdata(excel, "sheet1", 1, 1));
		performance.clicklogin21();
		performance.clickreportpage();
		performance.clickteamperformance();
	}
}

