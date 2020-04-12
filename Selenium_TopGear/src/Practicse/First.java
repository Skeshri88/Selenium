package Practicse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class First
{

	public static void main(String[] args) throws InterruptedException
	{
		//Opening Browser and Basic setup
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Browser\\80.0.3987.106\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/selectable/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//I1 Element
        driver.findElement(By.xpath("//ol[@id='selectable']//li[1]")).click();
	    String I1Text= driver.findElement(By.xpath("//ol[@id='selectable']//li[1]")).getText();
	    System.out.println("Item 1 text is "+ I1Text);
	
	 
	 //I2 Element
	 driver.findElement(By.xpath("//ol[@id='selectable']//li[2]")).click();
	 String I2Text= driver.findElement(By.xpath("//ol[@id='selectable']//li[2]")).getText();
	 System.out.println("Item 2 text is "+ I2Text);
	 
	 
	//I3 Element
	 driver.findElement(By.xpath("//ol[@id='selectable']//li[3]")).click();
	 String I3Text= driver.findElement(By.xpath("//ol[@id='selectable']//li[3]")).getText();
	 System.out.println("Item 3 text is "+ I3Text);
	 
	//I4 Element
	 driver.findElement(By.xpath("//ol[@id='selectable']//li[4]")).click();
	 String I4Text= driver.findElement(By.xpath("//ol[@id='selectable']//li[3]")).getText();
	 System.out.println("Item 4 text is "+ I4Text);
	 
	//I5 Element
	 driver.findElement(By.xpath("//ol[@id='selectable']//li[5]")).click();
	 String I5Text= driver.findElement(By.xpath("//ol[@id='selectable']//li[5]")).getText();
	 System.out.println("Item 5 text is "+ I5Text);
	 
	//I6 Element
	 driver.findElement(By.xpath("//ol[@id='selectable']//li[6]")).click();
	 String I6Text= driver.findElement(By.xpath("//ol[@id='selectable']//li[6]")).getText();
	 System.out.println("Item 6 text is "+ I6Text);
	 
	 
	//I7 Element
	 driver.findElement(By.xpath("//ol[@id='selectable']//li[7]")).click();
	 String I7Text= driver.findElement(By.xpath("//ol[@id='selectable']//li[7]")).getText();
	 System.out.println("Item 7 text is "+ I7Text);
	 
	 Thread.sleep(5000);
	 
	 
		
		
		driver.close();

	}

}
