package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.satisfactionsurvey;

public class SatisfactionSurvey extends Basetest 
{
	@Test
	public void Test10()
	{
		satisfactionsurvey survey=new satisfactionsurvey(driver);
		survey.clicklogin11();
		survey.username11(input.getdata(excel, "sheet1", 0, 1));
		survey.passsword11(input.getdata(excel, "sheet1", 1, 1));
		survey.clicklogin21();
		survey.clickreportpage();
		survey.clicksatisfactionsurvey();
	}

}
