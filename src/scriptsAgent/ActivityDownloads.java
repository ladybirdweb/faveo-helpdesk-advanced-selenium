package scriptsAgent;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.activitydownloads;

public class ActivityDownloads extends Basetest 
{
	@Test
	public void Test12()
	{
		activitydownloads download=new activitydownloads(driver);
	    download.clicklogin11();
		download.username11(input.getdata(excel, "sheet1", 0, 1));
		download.passsword21(input.getdata(excel, "sheet1",1, 1));
		download.clicklogin21();
		download.clickreportpage();
		download.clickactivitydownloads();
	}

}
