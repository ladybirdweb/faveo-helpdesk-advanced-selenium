package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.performancedistribution;

public class PerformanceDistribution extends Basetest 
{
@Test
public void Test7()
{
	performancedistribution distribution =new performancedistribution(driver);
	distribution.clicklogin11();
	distribution.username11(input.getdata(excel, "sheet1", 0, 1));
	distribution.passsword11(input.getdata(excel, "sheet1", 1, 1));
	distribution.clicklogin21();
	distribution.clickreportpage();
	distribution.clickperformancedistribution();

}
}
