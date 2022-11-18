package testscript;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Shreyash {
	
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	try {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\AN69831\\selenium-sample-project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(screenShotFile, new File(".//Screenshots/screen1.png"));
	driver.quit();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
	

