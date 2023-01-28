package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		// click on the second window button 
		
		driver.findElement(By.id("windowButton")).click();
		
		// click on the third window button 
		
		driver.findElement(By.id("messageWindowButton")).click();
		
		// Handling windows 
		
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		
		Set <String> set1 = driver.getWindowHandles();
		Iterator <String> itr = set1.iterator();
		
		while(itr.hasNext())
		{
			String childWindow = itr.next();
			if (!mainWindow.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
				System.out.println(childWindow);
				//driver.findElement(By.id("sampleHeading")); print all the contents of the html as home work 
				driver.close();
				System.out.println("Getting ,child window closed");
				
			}
			
			
		}
		
		driver.switchTo().window(mainWindow);
		driver.quit();
	
		
		
	}

}
