package Generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot 
{
	public static void getphoto(WebDriver driver,String name)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./photo/"+name+".png");
		try {
		FileUtils.copyFile(source, dest);
		}
		catch(IOException e)
		{
			
		}
	}

}
