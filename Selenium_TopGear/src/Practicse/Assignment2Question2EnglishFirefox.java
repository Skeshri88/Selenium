package Practicse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2Question2EnglishFirefox
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Software\\Browser\\Firefox\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.olay.co.uk/en-gb");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Click on Sign in button
		driver.findElement(By.xpath("//a[@href='/en-gb/loginpage']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Enter Email id
		driver.findElement(By.xpath("//input[@id='phdesktopbody_0_username']")).sendKeys("shailesh.keshri@wipro.com");
		
		//Password
		driver.findElement(By.xpath("//input[@id='phdesktopbody_0_password']")).sendKeys("Test!102");
		
		//Click on Sign in Button
		driver.findElement(By.xpath("//input[@id='phdesktopbody_0_SIGN IN']")).click();
		
		
		String TextBox= "The email and password combination you entered is incorrect. Please try again, or click the link below to create an account.";
		WebElement Textbox1= driver.findElement(By.xpath("//span[@id='phdesktopbody_0_Message']"));
		String Textbox2= Textbox1.getText();
		
		if(TextBox.equalsIgnoreCase(Textbox2))
		{
			System.out.println("Validation successfull");
		}
		
		else
		{
			System.out.println("Validation not  successfull");
		}
		
		
		//Forgot Password
		driver.findElement(By.xpath("//a[@id='phdesktopbody_0_forgotpassword']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Enter Email Id
		driver.findElement(By.xpath("//input[@id='phdesktopbody_0_username']")).sendKeys("shailesh.keshri@wipro.com");
		
		//Click on Next
		driver.findElement(By.xpath("//input[@name='phdesktopbody_0$NEXT']")).click();

}
}
