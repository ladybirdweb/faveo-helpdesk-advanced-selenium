package Generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class selec 
{
	public static void selectbyindex(WebElement element,int index)
	{
		Select  selec=new Select(element);
		selec.selectByIndex(index);
	}
	public static void selectbyvalue(WebElement element,String value)
	{
		Select selec =new Select(element);
		selec.selectByValue(value);
	}

}
