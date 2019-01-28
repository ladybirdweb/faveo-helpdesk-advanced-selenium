package loginscript;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import loginpage.basiclogin;

public class BasicAdmin extends Basetest 
{
	//checking the test case for admin verified(only alphabets)
	@Test(priority=1)
	public void adminverified() throws InterruptedException
	{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "loginscript", 0, 1));
		login.passsword(input.getdata(excel, "loginscript", 1, 1));
		login.clicklogin1();
		login.adminpanel();
	}
	
	//checking the testcase for admin verified(email,numbers)
	@Test(priority=2)
	public void adminverifiedemailpwd() throws InterruptedException
	{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "loginscript", 2, 1));
		login.passsword(input.getdata(excel, "loginscript", 3, 1));
		login.clicklogin1();
		login.toString();
	}
    
	//checking the testcase for admin verified(email,alphanumeric) 
	@Test(priority=3)
	public void adminverifiedemailnumber() throws InterruptedException
	{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "loginscript", 4, 1));
		login.passsword(input.getdata(excel, "loginscript", 5, 1));
		login.clicklogin1();
		login.adminpanel();
	}

	//checking the testcase for adminunverified
	 @Test(priority=4)
		public void adminunverified() throws InterruptedException
		{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "loginscript", 6, 1));
		login.passsword(input.getdata(excel, "loginscript", 7, 1));
		login.clicklogin1();
		login.adminpanel();
        }
	
	 //checking the test case for adminban
	 @Test(priority=5)
		public void adminban() throws InterruptedException
		{
			basiclogin login=new basiclogin(driver);
			login.clicklogin();
			login.username(input.getdata(excel, "loginscript", 8, 1));
			login.passsword(input.getdata(excel, "loginscript", 9, 1));
			login.clicklogin1();
			login.adminpanel();
		}
       
	 //checking the test case for admin deactivate
	 @Test(priority=6)
		public void admindeactivate() throws InterruptedException
		{
			basiclogin login=new basiclogin(driver);
			login.clicklogin();
			login.username(input.getdata(excel, "loginscript", 10, 1));
			login.passsword(input.getdata(excel, "loginscript", 11, 1));
			login.clicklogin1();
			login.adminpanel();
		}
}
