package testscript;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class MyntraAutomation {
	static WebDriver driver =new ChromeDriver();
	public static String VerifyTitle()
	{ // outside main function
		
		String Mtitle= driver.getTitle();
		System.out.println("The Title is ="+Mtitle);
		return Mtitle;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AN69831\\selenium-sample-project\\chromedriver.exe");
		try{
		
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// (//div[@class='desktop-navLink']/a)[1]
		//((//div[@class='desktop-backdropStyle']/div/div/li)[25]/ul/li)[10]
		 WebElement menTab= driver.findElement(By.xpath("(//div[@class='desktop-navLink']/a)[1]"));
	     Thread.sleep(7000);   
		 WebElement phoneCases =driver.findElement(By.xpath("((//div[@class='desktop-backdropStyle']/div/div/li)[5]/ul/li)[11]"));
	     Thread.sleep(5000);   
	        
	        Actions action = new Actions(driver);
		// 
		action.moveToElement(menTab);
	     Thread.sleep(7000);   
		action.click(phoneCases).build().perform();
	     Thread.sleep(3000);   
	     
	     Assert.assertEquals("Mobile Phone Cases - Buy Mobile Phone Cases Online - Myntra", VerifyTitle());
		
		WebElement phoneCaseRow3 = driver.findElement(By.xpath("(//div[@class='search-searchProductsContainer row-base']/section/ul/li)[11]/a"));
		Thread.sleep(5000); 
		
		phoneCaseRow3.click();
		Thread.sleep(3000);
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
//		WebElement priceOfcase = driver.findElement(By.xpath("//div[@class='pdp-description-container']/div/div/p/span/strong"));
//		Thread.sleep(3000); 
//		
//		
//		
//		Thread.sleep(5000); 
//		System.out.println("Phonecase clicked");
//		int price = Integer.parseInt(priceOfcase.getText());
//		System.out.println(price);
//		
		
		driver.get(""); 
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
