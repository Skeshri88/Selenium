package Practicse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1Ques2ContactFireFox 
{
	public static void main(String args[]) throws InterruptedException
	{
	
	       //Opening Browser and Basic setup
			System.setProperty("webdriver.gecko.driver", "D:\\Software\\Browser\\Firefox\\geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://demoqa.com/selectable/");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			
			
			//First Name 
			driver.findElement(By.xpath("//input[@class='firstname']")).sendKeys("Shailesh");
			
			//Last Time
			driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Keshri");
			
			//Country
			driver.findElement(By.xpath("//input[@name='country']")).sendKeys("India");
			
			//Subject
			driver.findElement(By.xpath("//textarea[@id='subject']")).sendKeys(" Text Details");
			
			
			//Verification Google link
			driver.findElement(By.xpath("//a[text()='Google Link']")).isDisplayed();
			
			//Verification Google link is here
			driver.findElement(By.xpath("//a[text()='Google Link is here']")).isDisplayed();
			
			//Click on Submit
			driver.findElement(By.xpath("//input[@value='Submit']")).click();
			
			
			Thread.sleep(5000);
			
			driver.close();
					
			
			

}
}
