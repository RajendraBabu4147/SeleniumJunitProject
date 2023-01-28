package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("userName")).sendKeys("Santosh Angadi");

        driver.findElement(By.id("userEmail")).sendKeys("Santosh Angadi@gmail.com");

        WebElement cAddress = driver.findElement(By.id("currentAddress"));
        cAddress.sendKeys("123, Cross1 , Street2 , Delhi");


        Actions actions = new Actions(driver);


        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();



        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();


        actions.sendKeys(Keys.TAB).build().perform();

        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

        /*
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();



        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();


        actions.sendKeys(Keys.TAB);
        actions.build().perform();

        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("v");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();

       */

        //driver.quit();

 
	
	}

}
