package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class flipkartLoginPage {
	static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		// Initialize WebDriver
		driver = new ChromeDriver();
		//Maximize window
		driver.manage().window().maximize();
		
		// Navigate to Flipkart
		driver.get("https://www.flipkart.com/");
	}
	
	@Test
	public static void Login() {
		
		 // Click on the login button
		WebElement loginButton = driver.findElement(By.linkText("Login"));
		loginButton.click();
		
		// Enter email/phone
		WebElement enterData = driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
		enterData.sendKeys("sarikagharage8@gmail.com");
		
		//enter OTP which received on email id and automatically it navigate to page
		WebElement otp = driver.findElement(By.xpath("//button[text() = 'Request OTP']"));
		otp.click();
	}
	
	@AfterClass
	 public void tearDown() {
        driver.quit();
    }

}
