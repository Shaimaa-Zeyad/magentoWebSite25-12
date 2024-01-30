package magentoWebSite;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases extends Parameters {
	WebDriver driver= new ChromeDriver();
	@BeforeTest
	public void mySetUp () {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	
		
	}
	@Test
	public void signUp ()
	{
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.findElement(By.cssSelector("body > div:nth-child(5) > header:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)")).click();
	//	driver.findElement(By.linkText("https://magento.softwaretestingboard.com/customer/account/create/")).click();
		WebElement FirstName= driver.findElement(By.id("firstname")) ;
		WebElement LastName = driver.findElement(By.id("lastname"));
		WebElement Email =driver.findElement(By.id("email_address"));
		WebElement Password =driver.findElement(By.id("password"));
		WebElement confirmPassword =driver.findElement(By.id("password-confirmation"));
		WebElement CreatAccountButton = driver.findElement(By.cssSelector("button[title='Create an Account'] span")) ;
		
		//Interact with the elements 
        FirstName.sendKeys(firstNames[randomIndex]);
        LastName.sendKeys(lastNames[randomIndex]);
        String EmailAddress=(firstNames[randomIndex]+lastNames[randomIndex]+randEmailId+"@"+"gmail.com");
        Email.sendKeys(EmailAddress);
        Password.sendKeys(commonPassword);
        
        confirmPassword.sendKeys(commonPassword);
        CreatAccountButton.click();
        String WelcomeMsg= driver.findElement(By.className("message-success")).getText();
        assertEquals(WelcomeMsg, "Thank you for registering with Main Website Store.");
        
        
       
        

		
	}
}
