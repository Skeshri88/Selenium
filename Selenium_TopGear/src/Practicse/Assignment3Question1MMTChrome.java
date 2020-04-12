package Practicse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3Question1MMTChrome {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Browser\\80.0.3987.106\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//One Way is ByDefault Selected
		
	
		
		//Select From City
		driver.findElement(By.xpath("//label[@for='fromCity']")).sendKeys("Ranchi");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
		
		//Select To City
		driver.findElement(By.xpath("//label[@for='toCity']")).sendKeys("Delhi");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
		
		Thread.sleep(3000);
		
		//Select Departure Date
		//driver.findElement(By.xpath("//input[@id='departure']")).click();
		//driver.findElement(By.xpath("//*[@id='root']//div//div[2]//div//div//div[2]//div[1]//div[3]//div[1]//div//div//div//div[2]//div//div[2]/div[1]//div[3]//div[4]//div[5]//div//p")).click();
		
		
		//Click Search button 
		driver.findElement(By.xpath("//p[@data-cy='submit']")).click();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Click on View Fares
		driver.findElement(By.xpath("//button[@id='bookbutton-RKEY:352990ee-adbe-42d5-af38-aa096e520f3d:46_0']")).click();
		
		//Click on Book Now
		driver.findElement(By.xpath("//*[@id='fli_list_item_740df001-011f-4a3b-b9c6-8deca8f9e197']/div[3]/div[1]/div[2]/div[2]/button")).click();
		
		String Text1="Review your booking";
		WebElement Text2= driver.findElement(By.xpath("//h4[text()='Review your booking']"));
		String Text= Text2.getText();
		
		if(Text1==Text)
		{
			System.out.println("Review Page is shown");
		}
		
		else
		{
			System.out.println("Review Page is not shown");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
