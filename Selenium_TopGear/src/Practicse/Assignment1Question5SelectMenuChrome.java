package Practicse;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1Question5SelectMenuChrome {

	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver", "D:\\Software\\Browser\\80.0.3987.106\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/selectmenu/");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		
		//Select a Speed
		driver.findElement(By.xpath("//span[@id='speed-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='ui-id-4']")).click();
		
		//Select a File
		driver.findElement(By.xpath("//span[@id='files-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='ui-id-8']")).click();
		
		//Select a number
		driver.findElement(By.xpath("//span[@id='number-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='ui-id-12']")).click();
		
		//Select a Title 
		driver.findElement(By.xpath("//span[@id='salutation-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='ui-id-30']")).click();
		
		driver.close();
		
		
		
		
		
		
		 
		
	}
}