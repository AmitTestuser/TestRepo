package testscript;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	    try {
//	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	         driver.get("https://www.google.com");
	            driver.manage().window().maximize();
	        
	        File scFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	          FileUtils.copyFile(scFile , new File(".//Screenshots/screen.png"));
	    }
	    catch(Exception ex) {
	        ex.printStackTrace();
	       
	        
	    }
	    
	    }




}
