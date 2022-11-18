package testscript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import junit.framework.Assert;
public class Check {
	
	WebDriver driver;
	public void Accept()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AN69831\\selenium-sample-project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/");
		driver.manage().window().maximize();
	}
	public void valid_data()
	{
		try
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AN69831\\selenium-sample-project\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/");
		driver.manage().window().maximize();
		WebElement userIcon = driver.findElement(By.xpath("(//ul[@class='navigation-top-menu navigation-top-menu-user-actions'])/li[3]"));
		WebElement registerLink = driver.findElement(By.xpath("((//ul[@class='navigation-top-menu-sublist'])[6]/li)[2]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(userIcon); // this is hovering operation
		Thread.sleep(3000);
		action.click(registerLink).build().perform(); // checking everything and performing action
		Thread.sleep(3000);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
		firstName.sendKeys("AMit");
		lastName.sendKeys("Nitnaware");
		Assert.assertEquals("Register - nopCommerce",VerifyTitle());
		}
		catch(Exception e )
		{
			e.printStackTrace();
		}
	}
	public String VerifyTitle()
	{ // outside main function
		
		String Mtitle= driver.getTitle();
		System.out.println("The Title is ="+Mtitle);
		return Mtitle;
		
		
		
	}
	public static void main(String args[])
	{
		
		Check c = new Check();
		c.valid_data();
		
		
		
	}
}
