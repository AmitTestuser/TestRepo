package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class NoCommerceAutomation {
	WebDriver driver = new ChromeDriver();
	public String VerifyTitle()
	{ // outside main function
		
		String Mtitle= driver.getTitle();
		System.out.println("The Title is ="+Mtitle);
		return Mtitle;
		
	}
	
	
	public void valid(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AN69831\\selenium-sample-project\\chromedriver.exe");
		try{
		
	
		driver.get("https://www.nopcommerce.com/en/"); 
		
		//http://www.tms.pisystindia.com/siteengineer.com
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		

		WebElement userIcon = driver.findElement(By.xpath("(//ul[@class='navigation-top-menu navigation-top-menu-user-actions'])/li[3]"));
		WebElement registerLink = driver.findElement(By.xpath("((//ul[@class='navigation-top-menu-sublist'])[6]/li)[2]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(userIcon); // this is hovering operation
		Thread.sleep(3000);
		action.click(registerLink).build().perform(); // checking everything and performing action
		Thread.sleep(3000);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement Cemail = driver.findElement(By.xpath("//input[@Id='ConfirmEmail']"));
		WebElement time = driver.findElement(By.xpath("//select[@id='TimeZoneId']"));
		WebElement userName = driver.findElement(By.xpath("//input[@id='Username']"));
//		
		Select dropDown = new Select(driver.findElement(By.xpath("(//select[@name='CountryId'])[1]")));  
		Select timeDrop = new Select(time);
		//WebElement newsLetter = driver.findElement(By.xpath("//label[@for='Newsletter']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		WebElement Cpassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		
		Select mPdropDown = new Select(driver.findElement(By.xpath("//select[@id='Details_CompanyIndustryId']")));
		Select mRdropDown = new Select(driver.findElement(By.xpath("//select[@id='Details_CompanyRoleId']")));
		Select mDdropDown = new Select(driver.findElement(By.xpath("//select[@id='Details_WebsitesDevelopmentPeriodId']")));
		Select cDropDown = new Select(driver.findElement(By.xpath("//select[@id='Details_CompanySizeId']")));
		
		WebElement radioBNo = driver.findElement(By.xpath("((//div[@class='custom-control custom-radio custom-control-inline'])[2]/label)[1]"));
		WebElement radioBYes = driver.findElement(By.xpath("((//div[@class='custom-control custom-radio custom-control-inline'])[1]/label)[1]"));
		WebElement inputText = driver.findElement(By.xpath("//input[@id='Details_CompanyWebsiteUrl']"));
//		
		WebElement register = driver.findElement(By.name("register-button"));
		
		
		firstName.sendKeys("Amit");
		lastName.sendKeys("Nitnaware");
		email.sendKeys("amitnitnaware06@gmail.com");
		Cemail.sendKeys("amitnitnaware06@gmail.com");
		userName.sendKeys("amit_2005");
		password.sendKeys("Pass@1234");
		Cpassword.sendKeys("Pass@1234");
			
		dropDown.selectByVisibleText("India");
		
		timeDrop.selectByVisibleText("(UTC-10:00) Hawaii");
		mPdropDown.selectByIndex(1);
		mRdropDown.selectByIndex(2);
		mDdropDown.selectByVisibleText("We are going to start");
		cDropDown.selectByIndex(2);
		
		radioBYes.click();
		radioBNo.click();
		
		Thread.sleep(2000);
		
		inputText.sendKeys("www.google.com");
		
		register.click();
		
		 Assert.assertEquals("Register - nopCommerce",VerifyTitle());
	
	
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
	public void invalid(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AN69831\\selenium-sample-project\\chromedriver.exe");
		try{
		
	
		driver.get("https://www.nopcommerce.com/en/"); 
		
		//http://www.tms.pisystindia.com/siteengineer.com
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		

		WebElement userIcon = driver.findElement(By.xpath("(//ul[@class='navigation-top-menu navigation-top-menu-user-actions'])/li[3]"));
		WebElement registerLink = driver.findElement(By.xpath("((//ul[@class='navigation-top-menu-sublist'])[6]/li)[2]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(userIcon); // this is hovering operation
		Thread.sleep(3000);
		action.click(registerLink).build().perform(); // checking everything and performing action
		Thread.sleep(3000);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement Cemail = driver.findElement(By.xpath("//input[@Id='ConfirmEmail']"));
		WebElement time = driver.findElement(By.xpath("//select[@id='TimeZoneId']"));
		WebElement userName = driver.findElement(By.xpath("//input[@id='Username']"));
//		
		Select dropDown = new Select(driver.findElement(By.xpath("(//select[@name='CountryId'])[1]")));  
		Select timeDrop = new Select(time);
		//WebElement newsLetter = driver.findElement(By.xpath("//label[@for='Newsletter']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		WebElement Cpassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		
		Select mPdropDown = new Select(driver.findElement(By.xpath("//select[@id='Details_CompanyIndustryId']")));
		Select mRdropDown = new Select(driver.findElement(By.xpath("//select[@id='Details_CompanyRoleId']")));
		Select mDdropDown = new Select(driver.findElement(By.xpath("//select[@id='Details_WebsitesDevelopmentPeriodId']")));
		Select cDropDown = new Select(driver.findElement(By.xpath("//select[@id='Details_CompanySizeId']")));
		
		WebElement radioBNo = driver.findElement(By.xpath("((//div[@class='custom-control custom-radio custom-control-inline'])[2]/label)[1]"));
		WebElement radioBYes = driver.findElement(By.xpath("((//div[@class='custom-control custom-radio custom-control-inline'])[1]/label)[1]"));
		WebElement inputText = driver.findElement(By.xpath("//input[@id='Details_CompanyWebsiteUrl']"));
//		
		WebElement register = driver.findElement(By.name("register-button"));
		
		
		firstName.sendKeys("Amit");
		lastName.sendKeys("Nitnaware");
		email.sendKeys("amitnitnaware08@gmail.com");
		Cemail.sendKeys("amitnitnaware08@gmail.com");
		userName.sendKeys("amit");
		password.sendKeys("Pass@1234");
		Cpassword.sendKeys("Pass@1234");
			
		dropDown.selectByVisibleText("India");
		
		timeDrop.selectByVisibleText("(UTC-10:00) Hawaii");
		mPdropDown.selectByIndex(1);
		mRdropDown.selectByIndex(2);
		mDdropDown.selectByVisibleText("We are going to start");
		cDropDown.selectByIndex(2);
		
		radioBYes.click();
		radioBNo.click();
		
		Thread.sleep(2000);
		
		inputText.sendKeys("www.google.com");
		
		register.click();
		
		WebElement title = driver.findElement(By.xpath("(//div[@class='section-title']/strong)[1]"));
		
		System.out.println(title.isDisplayed());
		 Assert.assertEquals("True",title.isDisplayed());
		 driver.quit();
	
	
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void blankInput(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AN69831\\selenium-sample-project\\chromedriver.exe");
		try{
		
	
		driver.get("https://www.nopcommerce.com/en/"); 
		
		//http://www.tms.pisystindia.com/siteengineer.com
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		

		WebElement userIcon = driver.findElement(By.xpath("(//ul[@class='navigation-top-menu navigation-top-menu-user-actions'])/li[3]"));
		WebElement registerLink = driver.findElement(By.xpath("((//ul[@class='navigation-top-menu-sublist'])[6]/li)[2]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(userIcon); // this is hovering operation
		Thread.sleep(3000);
		action.click(registerLink).build().perform(); // checking everything and performing action
		Thread.sleep(3000);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement Cemail = driver.findElement(By.xpath("//input[@Id='ConfirmEmail']"));
		WebElement time = driver.findElement(By.xpath("//select[@id='TimeZoneId']"));
		WebElement userName = driver.findElement(By.xpath("//input[@id='Username']"));
//		
		Select dropDown = new Select(driver.findElement(By.xpath("(//select[@name='CountryId'])[1]")));  
		Select timeDrop = new Select(time);
		//WebElement newsLetter = driver.findElement(By.xpath("//label[@for='Newsletter']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		WebElement Cpassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		
		Select mPdropDown = new Select(driver.findElement(By.xpath("//select[@id='Details_CompanyIndustryId']")));
		Select mRdropDown = new Select(driver.findElement(By.xpath("//select[@id='Details_CompanyRoleId']")));
		Select mDdropDown = new Select(driver.findElement(By.xpath("//select[@id='Details_WebsitesDevelopmentPeriodId']")));
		Select cDropDown = new Select(driver.findElement(By.xpath("//select[@id='Details_CompanySizeId']")));
		
		WebElement radioBNo = driver.findElement(By.xpath("((//div[@class='custom-control custom-radio custom-control-inline'])[2]/label)[1]"));
		WebElement radioBYes = driver.findElement(By.xpath("((//div[@class='custom-control custom-radio custom-control-inline'])[1]/label)[1]"));
		WebElement inputText = driver.findElement(By.xpath("//input[@id='Details_CompanyWebsiteUrl']"));
//		
		WebElement register = driver.findElement(By.name("register-button"));
		
		
		firstName.sendKeys("");
		lastName.sendKeys("");
		email.sendKeys("");
		Cemail.sendKeys("");
		userName.sendKeys("");
		password.sendKeys("");
		Cpassword.sendKeys("");
			
		dropDown.selectByVisibleText("India");
		
		timeDrop.selectByVisibleText("(UTC-10:00) Hawaii");
		mPdropDown.selectByIndex(1);
		mRdropDown.selectByIndex(2);
		mDdropDown.selectByVisibleText("We are going to start");
		cDropDown.selectByIndex(2);
		
		radioBYes.click();
		radioBNo.click();
		
		Thread.sleep(2000);
		
		inputText.sendKeys("");
		
		register.click();
		
		WebElement title = driver.findElement(By.xpath("(//div[@class='section-title']/strong)[1]"));
		
		System.out.println(title.isDisplayed());
		  Assert.assertEquals("True",title.isDisplayed());
		  driver.quit();
	
	
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	public void firstNameBlank(){
		
	}
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		//(//div[@class='section-title']/strong)[1]
		
		NoCommerceAutomation obj = new NoCommerceAutomation();
		//obj.valid();
		//obj.invalid();
		//obj.blankInput();
		obj.firstNameBlank();
		
		
	}

}
