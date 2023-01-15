package interview1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShot1 {
	FirefoxDriver abc=null;
@BeforeMethod
public void setup(){
	ProfilesIni pr=new ProfilesIni();
	abc=new FirefoxDriver(pr.getProfile("seleniumuser"));
	abc.get("http://google.com");
	}
@Test
public void ScreenShot() throws IOException{
	File srcfile=((TakesScreenshot)abc).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcfile, new File("G:\\google.png"));
}
}