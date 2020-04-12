package Practicse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmet2Ques1aengbChrome {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Browser\\80.0.3987.106\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.olay.co.uk/en-gb");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		//CLicking on No from Pop up
		driver.findElement(By.xpath("//a[@id='lnkChatDecline']")).click();
		
		//Click on Register Button
		driver.findElement(By.xpath("//div[@id='phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink']//a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink']//a[2]")).click();
		Thread.sleep(2000);
		
		//Entering Email id Details
		driver.findElement(By.xpath("//input[@id='phdesktopbody_0_grs_account[emails][0][address]']")).sendKeys("shailesh.keshri@wipro.com");
		
		//Entering Password
		driver.findElement(By.xpath("//input[@id='phdesktopbody_0_grs_account[password][password]']")).sendKeys("Shailesh@102");
		
		//Confirm Password
		driver.findElement(By.xpath("//input[@id='phdesktopbody_0_grs_account[password][confirm]']")).sendKeys("Shailesh@102");
		
		//BirthDay Day Selection 
		WebElement Listbox1= driver.findElement(By.xpath("//select[@id='phdesktopbody_0_grs_consumer[birthdate][day]']"));
		Listbox1.click();
		Select s1= new Select(Listbox1);
		s1.selectByVisibleText("11");
		
		//BirthDay Month Selection 
		 WebElement Listbox2= driver.findElement(By.xpath("//select[@id='phdesktopbody_0_grs_consumer[birthdate][month]']"));
		 Listbox1.click();
		 Select s2= new Select(Listbox2);
		 s2.selectByVisibleText("8");
		 
		//BirthDay Year Selection 
		 WebElement Listbox3= driver.findElement(By.xpath("//select[@id='phdesktopbody_0_grs_consumer[birthdate][year]']"));
		 Listbox1.click();
		 Select s3= new Select(Listbox3);
		 s3.selectByVisibleText("1990");
		 
		 
		 //Scroll Down
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,300)");
		 Thread.sleep(5000);
		 
		 //Clicking for creating new profile
		 driver.findElement(By.xpath("//input[@id='phdesktopbody_0_submit']")).click();
		 
		 
				
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
