package Practicse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2Question1SpainChrome
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Browser\\80.0.3987.106\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.olay.es/es-es");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		//Click on Register
		driver.findElement(By.xpath("//div[@id='phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink']//a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink']//a[2]")).click();
		
		//Sex Selection
		driver.findElement(By.xpath("//img[@id='phdesktopbody_0_imgfemale']")).click();
		
		// First Name
		driver.findElement(By.xpath("//input[@id='phdesktopbody_0_grs_consumer[firstname]']")).sendKeys("Shailesh");
		
		//Middle  Name
		driver.findElement(By.xpath("//input[@id='phdesktopbody_0_labelgrs_consumer[secondary_lastname]']")).sendKeys("Kumar");
		
		//Last Name
		driver.findElement(By.xpath("//input[@id='phdesktopbody_0_grs_consumer[lastname]']")).sendKeys("Keshri");
		
		//Email
		driver.findElement(By.xpath("//input[@id='phdesktopbody_0_grs_account[emails][0][address]']")).sendKeys("shailesh.keshri@wipro.com");
		
		//Password
		driver.findElement(By.xpath("//input[@id='phdesktopbody_0_grs_account[password][password]']")).sendKeys("Testing@1234");
				
		//Confirm Password
		driver.findElement(By.xpath("//input[@id='phdesktopbody_0_grs_account[password][confirm]']")).sendKeys("Testing@1234");
		
		//Select Day of Birth
		WebElement listbox1= driver.findElement(By.xpath("//Select[@id='phdesktopbody_0_grs_consumer[birthdate][day]']"));
		listbox1.click();
		Select S1= new Select(listbox1);
		S1.selectByVisibleText("11");
		
		//Select Month of Birth
		WebElement listbox2= driver.findElement(By.xpath("//Select[@id='phdesktopbody_0_grs_consumer[birthdate][month]']"));
		listbox2.click();
		Select S2= new Select(listbox2);
		S2.selectByVisibleText("8");
		
		
		//Select Month of Birth
		WebElement listbox3 = driver.findElement(By.xpath("//Select[@id='phdesktopbody_0_grs_consumer[birthdate][year]']"));
		listbox3.click();
		Select S3= new Select(listbox3);
		S3.selectByVisibleText("1990");
		
		//Phone no
		driver.findElement(By.xpath("//input[@id='phdesktopbody_0_grs_account[phones][0][fulltelephonenumber]']")).sendKeys("+34912345678");
		
		
		//Scroll Down
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,600)");
		 Thread.sleep(5000);
		
		
		//Privacy Check Box
	    driver.findElement(By.xpath("//input[@id='phdesktopbody_0_ctl74']")).click();
	    
	    //Click on Submit
	    driver.findElement(By.xpath("//input[@id='phdesktopbody_0_submit']")).click();
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
