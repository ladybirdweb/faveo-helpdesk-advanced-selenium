package loginscript;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import loginpage.basiclogin;

public class BasicAgent extends  Basetest 
{
	//checking the testcase for agent verified(only alphabets)
	@Test(priority=1)
	public void Agentverified() throws InterruptedException
	{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "loginscript", 12, 1));
		login.passsword(input.getdata(excel, "loginscript", 13, 1));
		login.clicklogin1();
		
	}

	//checking the testcase for agent verified(email,alphabet)
	@Test(priority=2)
	public void Agentverifiedemailpwd() throws InterruptedException
	{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "loginscript", 14, 1));
		login.passsword(input.getdata(excel, "loginscript", 15, 1));
		login.clicklogin1();
	}
	
	//checking the testcase for agent verified (email,number)
	@Test(priority=3)
	public void Agentverifiedemailnumber() throws InterruptedException
	{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "loginscript", 18, 1));
		login.passsword(input.getdata(excel, "loginscript", 19, 1));
		login.clicklogin1();
	}
	
	//checking the test case for agent verified (email,alphanumeric)

	@Test(priority=4)
	public void Agentverifiedalphanumeric() throws InterruptedException
	{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "loginscript", 20, 1));
		login.passsword(input.getdata(excel, "loginscript", 21, 1));
		login.clicklogin1();
	}

	//checking the test case for agent unverified
	@Test(priority=5)
	public void Agentunverified() throws InterruptedException
	{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "loginscript", 22, 1));
		login.passsword(input.getdata(excel, "loginscript", 23, 1));
		login.clicklogin1();
	}
	
	//checking the testcase for agent ban
	@Test(priority=6)
	public void Agentban() throws InterruptedException
	{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		login.username(input.getdata(excel, "loginscript", 24, 1));
		login.passsword(input.getdata(excel, "loginscript", 25, 1));
		login.clicklogin1();
	}

    //checking the testcase for agent deactivate
	@Test(priority=7)
	public void Agentdeactivate() throws InterruptedException
	{
		basiclogin login=new basiclogin(driver);
		login.clicklogin();
		
		login.username(input.getdata(excel, "loginscript", 26, 1));
		login.passsword(input.getdata(excel, "loginscript", 27, 1));
		login.clicklogin1();
	}	
}
