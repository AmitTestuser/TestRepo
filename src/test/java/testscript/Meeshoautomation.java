package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Meeshoautomation {
	WebDriver driver;
	public void select_product(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AN69831\\selenium-sample-project\\chromedriver.exe");
		try{
			driver = new ChromeDriver();
			
			driver.get("https://www.meesho.com/");
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			////div[@class='NavBarDesktop__Subtitle-xsryom-0 kPKaWB']/span
			//(//div[@class='NavBarDesktop__StyledLevel3-xsryom-1 dXtvBo']/div/div)[4]/a[2]
			
			 WebElement menTab= driver.findElement(By.xpath("//div[@class='NavBarDesktop__Subtitle-xsryom-0 kPKaWB']/span"));
		     Thread.sleep(7000);
		     
		     WebElement shoes = driver.findElement(By.xpath("(//div[@class='NavBarDesktop__StyledLevel3-xsryom-1 dXtvBo']/div/div)[3]/a[2]"));
		     Thread.sleep(2000);
		     Actions action = new Actions(driver);
		     
		     action.moveToElement(menTab);
		     action.click(shoes).build().perform();
		     
		     Thread.sleep(1000);
		     driver.quit();
		}catch(Exception e){
			
		}
		
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Meeshoautomation obj = new Meeshoautomation();
		obj.select_product();
		

	}
}
