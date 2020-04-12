package Practicse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1Ques6ControlGroupFireFox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Software\\Browser\\Firefox\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(" https://demoqa.com/controlgroup/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		//Selecting Company Car
				driver.findElement(By.xpath("//span[@id='ui-id-8-button']")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div[@id='ui-id-10']")).click();
				
				
				//Scroll Down
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,300)");
				Thread.sleep(5000);
				
				//Selecting Automatic
				driver.findElement(By.xpath("//label[@for='transmission-automatic-v']//span[2]")).click();
				
				//Insurance Selection
				driver.findElement(By.xpath("//label[@for='insurance-v']//span[2]")).click();
				
				//No of Cars
				driver.findElement(By.xpath("//input[@id='vertical-spinner']")).sendKeys("3");
				
				//Click On Submit button 
				driver.findElement(By.xpath("//button[@id='book']")).click();
				
				driver.close();
				
				
		
		
		

	}

}
