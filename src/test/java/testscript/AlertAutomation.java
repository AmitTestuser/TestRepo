package testscript;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAutomation {
	
	WebDriver driver;
	public void alert_check(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AN69831\\selenium-sample-project\\chromedriver.exe");
		driver = new ChromeDriver();
		
		try{
			
			driver.get("https://sweetalert2.github.io/");
			
			Thread.sleep(1000);
			
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// doesn't work for scrolling mechanism as scrolling is dimension based
			
			// this is for scrolling
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("javascript:window.scrollBy(0,360)");
			Thread.sleep(1000);
			Thread.sleep(1000);
//			WebElement alert = driver.findElement(By.xpath("/html/body/div[2]/button"));
//			Thread.sleep(1000);
//			alert.click();
//			
//			Thread.sleep(1000);
//			driver.switchTo().alert().accept(); // for default we use this method where driver.switchTo().alert().accept() is use
//			
			//Thread.sleep(1000);
//			
			
			// for custom alert we have to use xpath
			WebElement alert2 = driver.findElement(By.xpath("//button[@aria-label='Show SweetAlert2 success message']"));
			Thread.sleep(1000);
			alert2.click();
			Thread.sleep(1000);
			
			WebElement okButton = driver.findElement(By.xpath("//div[@class='swal2-actions']/button[1]"));
			okButton.click();
			Thread.sleep(200);
			js.executeScript("javascript:window.scrollBy(0, 800)");
			Thread.sleep(1000);
			
			
			WebElement tryMe1 = driver.findElement(By.xpath("//ul[@class='examples']/li/div/button[1]"));
			tryMe1.click();
			Thread.sleep(1000);
	
			WebElement tryMe1Ok = driver.findElement(By.xpath("//div[@class='swal2-actions']/button"));
			Thread.sleep(1000);
			tryMe1Ok.click();
			Thread.sleep(100);
			js.executeScript("javascript:window.scrollBy(0, 200)","");
			Thread.sleep(1000);
			
			WebElement tryMe2 = driver.findElement(By.xpath("(//ul[@class='examples']/li/div/button)[2]"));
			tryMe2.click();
			Thread.sleep(1000);
			
			WebElement tryMe2Ok = driver.findElement(By.xpath("//div[@class='swal2-actions']/button"));
			Thread.sleep(1000);
			tryMe2Ok.click();
			Thread.sleep(200);
			js.executeScript("javascript:window.scrollBy(0, 200)","");
			Thread.sleep(1000);
			js.executeScript("javascript:window.scrollBy(0, 200)","");
			WebElement tryMe3 = driver.findElement(By.xpath("(//ul[@class='examples']/li/div/button)[3]"));
			tryMe3.click();
			Thread.sleep(1000);
			WebElement tryMe3Ok = driver.findElement(By.xpath("//div[@class='swal2-actions']/button"));
			tryMe3Ok.click();
			Thread.sleep(500);
			js.executeScript("javascript:window.scrollBy(0, 200)","");
			Thread.sleep(1000);
			
			
			WebElement tryMe4 = driver.findElement(By.xpath("(//ul[@class='examples']/li/div/button)[4]"));
			tryMe4.click();
			Thread.sleep(1000);
			WebElement tryMe4Ok = driver.findElement(By.xpath("//div[@class='swal2-actions']/button"));
			tryMe4Ok.click();
			Thread.sleep(1000);
			js.executeScript("javascript:window.scrollBy(0, 200)","");
			Thread.sleep(1000);
			
			
			
			WebElement tryMe5 = driver.findElement(By.xpath("(//ul[@class='examples']/li/div/button)[5]"));
			tryMe5.click();
			Thread.sleep(1000);
			WebElement tryMe5Ok = driver.findElement(By.xpath("//div[@class='swal2-actions']/button"));
			Thread.sleep(1000);
			tryMe5Ok.click();
			Thread.sleep(1000);
			js.executeScript("javascript:window.scrollBy(0, 200)","");
			Thread.sleep(1000);
			
			WebElement tryMe6 = driver.findElement(By.xpath("(//ul[@class='examples']/li/div/button)[6]"));
			Thread.sleep(1000);
			tryMe6.click();
			Thread.sleep(1000);
			
			WebElement tryMe6Ok = driver.findElement(By.xpath("//div[@class='swal2-actions']/button[1]"));
			Thread.sleep(1000);
			tryMe6Ok.click();
			Thread.sleep(1000);
			js.executeScript("javascript:window.scrollBy(0, 200)","");
			Thread.sleep(1000);
			
			WebElement tryMe7 = driver.findElement(By.xpath("(//ul[@class='examples']/li/div/button)[7]"));
			Thread.sleep(1000);
			tryMe7.click();
			Thread.sleep(1000);
	
			WebElement tryMe7Ok = driver.findElement(By.xpath("//div[@class='swal2-actions']/button[1]"));
			Thread.sleep(1000);
			tryMe7Ok.click();
			Thread.sleep(1000);
			js.executeScript("javascript:window.scrollBy(0, 200)","");
			Thread.sleep(1000);
			
			WebElement tryMe8 = driver.findElement(By.xpath("(//ul[@class='examples']/li/div/button)[8]"));
			Thread.sleep(1000);
			tryMe8.click();
			Thread.sleep(3000);
			
			WebElement tryMe8Ok = driver.findElement(By.xpath("//div[@class='swal2-actions']/button[1]"));
			tryMe8Ok.click();
			
			Thread.sleep(3000);
			js.executeScript("javascript:window.scrollBy(0, 200)","");
			Thread.sleep(1000);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args){
		
		AlertAutomation obj =new AlertAutomation();
		obj.alert_check();
		
	}

}
