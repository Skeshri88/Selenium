package Practicse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2Quest1GermanyFirefox {

	public static void main(String[] args) throws InterruptedException
   {
		//Basic Browser Setting 
		   System.setProperty("webdriver.gecko.driver", "D:\\Software\\Browser\\Firefox\\geckodriver.exe");
		   FirefoxDriver driver = new FirefoxDriver();
		   driver.get("https://www.olaz.de/de-de");
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.manage().window().maximize();

	
	
	 //Click on Register Button
	driver.findElement(By.xpath("//div[@id='phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink']//a[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink']//a[2]")).click();
							 
	//Scroll Down
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,500)");
	Thread.sleep(5000);
			 
	//Clicking on Female Icon
	 driver.findElement(By.xpath("//img[@id='phdesktopbody_0_imgfemale']")).click();
			 
	//First Name
	 driver.findElement(By.xpath("//input[@id='phdesktopbody_0_grs_consumer[firstname]']")).sendKeys("Shailesh");
			 
	//Last Name
	  driver.findElement(By.xpath("//input[@id='phdesktopbody_0_grs_consumer[lastname]']")).sendKeys("Keshri");
			 
	//Email
	  driver.findElement(By.xpath("//input[@id='phdesktopbody_0_grs_account[emails][0][address]']")).sendKeys("Shailesh.Keshri@wipro.com");
			 
	 //Password
	  driver.findElement(By.xpath("//input[@id='phdesktopbody_0_grs_account[password][password]']")).sendKeys("Keshri@10245");
			 
	//Confirm Password
	driver.findElement(By.xpath("//input[@id='phdesktopbody_0_grs_account[password][confirm]']")).sendKeys("Keshri@10245");
	
	//Birth Day
	WebElement listbox1=driver.findElement(By.xpath("//select[@id='phdesktopbody_0_grs_consumer[birthdate][day]']"));
	listbox1.click();
	Select S1= new Select(listbox1);
	S1.selectByVisibleText("11");
	
	//Birth Month
	WebElement listbox2 =driver.findElement(By.xpath("//select[@id='phdesktopbody_0_grs_consumer[birthdate][month]']"));
	listbox2.click();
	Select S2= new Select(listbox2);
	S2.selectByVisibleText("8");
	
	//Select Year
	WebElement listbox3 =driver.findElement(By.xpath("//select[@id='phdesktopbody_0_grs_consumer[birthdate][year]']"));
	listbox3.click();
	Select S3= new Select(listbox3);
	S3.selectByVisibleText("1990");
	
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	js2.executeScript("window.scrollBy(0,300)");
	Thread.sleep(5000);
	
	//Land  Drop down selection
	WebElement listbox4 =driver.findElement(By.xpath("//select[@id='phdesktopbody_0_labelgrs_account[addresses][0][country]']"));
	listbox4.click();
	Select S4= new Select(listbox4);
	S4.selectByVisibleText("Deutschland");
	
	//Strabe Field
	driver.findElement(By.xpath("//input[@id='phdesktopbody_0_labelgrs_account[addresses][0][line1]']")).sendKeys("1234");
	
	//POST
	 driver.findElement(By.xpath("//input[@id='phdesktopbody_0_grs_account[addresses][0][postalarea]']")).sendKeys("10115");
	 
	//ORT
	 driver.findElement(By.xpath("//input[@id='phdesktopbody_0_labelgrs_account[addresses][0][city]']")).sendKeys("1234");
	 
	//Submit Button
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	 


}


}
