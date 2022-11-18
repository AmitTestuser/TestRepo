package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class orangeHrms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AN69831\\selenium-sample-project\\chromedriver.exe");
		try{
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.orangehrm.com/");
			driver.manage().window().maximize(); // full screen mode
			
			Thread.sleep(100);
			
			WebElement bookButton = driver.findElement(By.linkText("Book a Free Demo")); // LinkText used for linked button
			WebElement fullName = driver.findElement(By.xpath("//input[@id = 'Form_getForm_FullName']"));
			WebElement BusinessEmail = driver.findElement(By.xpath("//input[@id='Form_getForm_Email']"));
			WebElement phone = driver.findElement(By.xpath("//input[@id='Form_getForm_Contact']"));
			
			Select country = new Select(driver.findElement(By.xpath("//select[@id='Form_getForm_Country']")));

			
			bookButton.click();
			Thread.sleep(100000);
			
			fullName.sendKeys("Amit");
			Thread.sleep(1000);
			BusinessEmail.sendKeys("a@gmail.com");
			Thread.sleep(1000);
			country.selectByValue("India");
			Thread.sleep(1000);
			phone.sendKeys("8988838389");
			Thread.sleep(1000);
			
			driver.quit();
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
