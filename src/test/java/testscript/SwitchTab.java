package testscript;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTab {
	WebDriver driver;
	
	public void tab_switch(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AN69831\\selenium-sample-project\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/about/index.htm");
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(0));
		System.out.println("Title:"+driver.getTitle());	
		
		driver.quit();
	}
	
	public static void main(String[] args){
		SwitchTab obj = new SwitchTab();
		try{
		obj.tab_switch();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
