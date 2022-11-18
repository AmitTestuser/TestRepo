package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AN69831\\selenium-sample-project\\chromedriver.exe");
		try{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		
		driver.get("https://www.nopcommerce.com/en/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.orangehrm.com/"); // used for navigation purpose
		Thread.sleep(2000);
		driver.navigate().back(); // going back 
		Thread.sleep(2000);
		driver.navigate().forward(); // going forward
		
		Thread.sleep(2000);
		driver.quit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
		
		
		

	}

}
