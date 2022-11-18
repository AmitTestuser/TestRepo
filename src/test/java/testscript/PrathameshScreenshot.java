package testscript;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrathameshScreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\git project\\TestRepo\\chromedriver.exe");
	//	WebDriverManager().chromedriver.setup();
        try{
        	//D:\git project\TestRepo
            WebDriver driver= new ChromeDriver();
            driver.get("https://google.com");
            driver.manage().window().maximize();
            File screenShotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenShotFile, new File (".//ScreenShots/screen1.png"));
            driver.quit();
            
        }
        catch(Exception ex)
        {
            ex.getStackTrace();
            ex.printStackTrace();
        }
		
		
	}

}
