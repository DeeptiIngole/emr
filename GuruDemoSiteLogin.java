package scripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruDemoSiteLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ingoldee\\OneDrive - Tietoevry\\Desktop\\Automation_Java_Practice\\seleniumtraning\\test\\resorces\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("https://demo.guru99.com/test/login.html");
		driver.manage().window().maximize();
          
		//To enter the details in email address field
		WebElement email = driver.findElement(By.xpath("//input[@id='email' and @name='email']"));
		email.sendKeys("ingole.deepti@gmail.com");
		
		//To enter the password value
		//WebElement password = 
		driver.findElement(By.xpath("//input[@id='passwd' and @name='passwd']")).sendKeys("12345");
		//password.sendKeys("12345");
		
		Thread.sleep(3000);
		
		email.submit();
		
		System.out.println("Successfully Logged in..." + email.isDisplayed());
		
		//to click on sign in
		//WebElement signin = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		//signin.click();
		
		
		//succ. sign in message
		//WebElement message = driver.findElement(By.xpath("//h3['Successfully Logged in...']"));
		
		//verifying the results
		//String expectedTitleAfterLogin = "Successfully Logged in...";
		//String actualTitleAfterLogin = message.getText();
				
		//assertEquals(actualTitleAfterLogin,expectedTitleAfterLogin);
				
		driver.quit();		
		
	}

}
