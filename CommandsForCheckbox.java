 package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommandsForCheckbox {

	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ingoldee\\OneDrive - Tietoevry\\Desktop\\Automation_Java_Practice\\seleniumtraning\\test\\resorces\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//go to wikipedia.org

		driver.get("https://nichethyself.com/tourism/customised.html");
		driver.manage().window().maximize();
		
		//to verify the checkbox is clicked or not		
		WebElement englandcheckbx = driver.findElement(By.xpath("//label[text()='England']/input"));
		
		if(!englandcheckbx.isSelected())
		{
			englandcheckbx.click();
			System.out.println("The button is clicked ");
		}
		
		driver.close();
	}
		

	}


