package loginscript;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import loginpage.basiclogin;

public class Basicclient extends Basetest 
{
	//checking the test case for the client verified
	@Test(priority=1)
	public void Clientverified() throws InterruptedException
	{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "loginscript", 28, 1));
		login.passsword(input.getdata(excel, "loginscript", 29, 1));
		login.clicklogin1();
		login.clicksubmitticket();
	}
	
	//checking the testcase for the client verified(email,password)
	@Test(priority=2)
	public void Clientverifiedemailpwd() throws InterruptedException
	{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "loginscript", 30, 1));
		login.passsword(input.getdata(excel, "loginscript", 31, 1));
		login.clicklogin1();
		login.clicksubmitticket();
	}
    
	//checking the testcase for client verified(email,number)
	@Test(priority=3)
	public void Clientverifiedemailnumber() throws InterruptedException
	{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "loginscript", 32, 1));
		login.passsword(input.getdata(excel, "loginscript", 33, 1));
		login.clicklogin1();
		login.clicksubmitticket();
	}
	
	//checking the testcase for client verified(email,alphanumeric)
	@Test(priority=4)
	public void Clientverifiedemailalphanumeric() throws InterruptedException
	{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "loginscript", 34, 1));
		login.passsword(input.getdata(excel, "loginscript", 35, 1));
		login.clicklogin1();
		login.clicksubmitticket();
	}
	
	//checking the testcase for client unverified
	@Test(priority=5)
	public void Clientunverified() throws InterruptedException
	{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "loginscript", 36, 1));
		login.passsword(input.getdata(excel, "loginscript", 37, 1));
		login.clicklogin1();
		login.clicksubmitticket();
	}
	
	//checking the testcase for client ban
	@Test(priority=6)
	public void Clientban() throws InterruptedException
	{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "loginscript", 38, 1));
		login.passsword(input.getdata(excel, "loginscript", 39, 1));
		login.clicklogin1();
		//login.clicksubmitticket();
	}
     
	//checking the testcase for clientdeactivate
	@Test(priority=7)
	public void clientdeactivate() throws InterruptedException
	{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "loginscript", 40, 1));
		login.passsword(input.getdata(excel, "loginscript", 41, 1));
		login.clicklogin1();
		//login.clicksubmitticket();
	}	
}
