package installationscript;

import installationpage.InstallationPageLocally;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;

public class InstallationScriptLocally extends Basetest{

	private static final String Host = input.getdata(excel, "installation", 0, 1);
	private static final String Databasename =input.getdata(excel, "installation", 1, 1);
	private static final String Username = input.getdata(excel, "installation", 2, 1);
	private static final String Firstname = input.getdata(excel, "installation", 3, 1);
	private static final String Lastname = input.getdata(excel, "installation", 4, 1);
	private static final String Email = input.getdata(excel, "installation", 5, 1);
	private static final String AdminUsername = input.getdata(excel, "installation", 6, 1);
	private static final String Password = input.getdata(excel, "installation", 7, 1);
	private static final String ConfirmPassword = input.getdata(excel, "installation", 8, 1);
	private static final String EnterTimezone = input.getdata(excel, "installation", 9, 1);
	private static final String ProductKey1 = input.getdata(excel, "installation", 10, 1);
	private static final String ProductKey2 = input.getdata(excel, "installation", 11, 1);
	private static final String ProductKey3 = input.getdata(excel, "installation", 12, 1);
	private static final String ProductKey4 = input.getdata(excel, "installation", 13, 1);
	
	@SuppressWarnings("unused")
	@Test
	public void installationtest() throws InterruptedException
	{
		Basetest opbr = new Basetest();
		InstallationPageLocally ipl = new InstallationPageLocally(driver);
		ipl.probePage();
		ipl.acceptCheckbox();
		ipl.licenseAgreement();
		ipl.setconfirmPwd();
		ipl.dbSetup(Host,Databasename,Username);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(90000);
		ipl.dbSetupDone();
		ipl.localeInformation (Firstname,Lastname,Email,AdminUsername,Password,ConfirmPassword,EnterTimezone);
		ipl.licenseCode(ProductKey1,ProductKey2,ProductKey3,ProductKey4);
		ipl.finalStep();	
	}
	
}



