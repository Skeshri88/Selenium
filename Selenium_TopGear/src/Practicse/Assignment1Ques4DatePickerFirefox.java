package Practicse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1Ques4DatePickerFirefox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Software\\Browser\\Firefox\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();	
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//a[text()='14']")).click();

	}

}
