package Practicse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1Ques3DragDropFireFox {

	public static void main(String[] args) 
	{
		//Opening Browser and Basic setup
		System.setProperty("webdriver.gecko.driver", "D:\\Software\\Browser\\Firefox\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(" https://demoqa.com/droppable/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		//Xpath for text
		WebElement source1 = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement target1 = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		//verification of text in source location 
		String SourceText="Drag me to my target";
		String ApplicationSourceText= source1.getText();
		System.out.println(ApplicationSourceText);
		
		if(SourceText.equalsIgnoreCase(ApplicationSourceText))
		{
			System.out.println("Text Verified");
		}
		
		else
		{
			System.out.println("Text not Verified");
		}
		
		//verification of Destination Text
		String DestinationText="Drop here";
		String ApplicationDestinationText= target1.getText();
		System.out.println(ApplicationDestinationText);
		
		if(DestinationText.equalsIgnoreCase(ApplicationDestinationText))
		{
			System.out.println("Text Verified");
		}
		
		else
		{
			System.out.println("Text not Verified");
		}
		
		//Drag and Drop
		Actions action= new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		action.dragAndDrop(source, target).perform();
		
		
		

	}

}
