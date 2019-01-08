package Script;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.input;
import Page.plugin;

public class Plugin extends Basetest
{
@Test
public void Test30()
{
plugin plugin=new plugin(driver);
plugin.clicklogin();
plugin.username(input.getdata(excel, "sheet1", 0, 1));
plugin.passsword(input.getdata(excel, "sheet1", 1, 1));
plugin.clicklogin1();
plugin.clickAdminpanel();
plugin.clickplugin();
}
}
