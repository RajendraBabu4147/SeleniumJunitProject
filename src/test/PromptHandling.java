package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromptHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		  //driver.findElement(By.id("promtButton"));
        WebElement prompt = driver.findElement(By.id("alertButton"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()",prompt);
        Alert promptAlert = driver.switchTo().alert();
        System.out.println(promptAlert.getText());
        promptAlert.accept();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        WebElement prompt2 = driver.findElement(By.id("timerAlertButton"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()",prompt2);
        
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        Alert alert2 = wait.until(ExpectedConditions.alertIsPresent());
        
        //Alert promptAlert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert2.accept();
        
        WebElement prompt3 = driver.findElement(By.id("confirmButton"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()",prompt3);
        
        Alert promptAlert3 = driver.switchTo().alert();
        System.out.println(promptAlert3.getText());
        promptAlert3.accept();
        
        WebElement prompt4 = driver.findElement(By.id("promtButton"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click()",prompt4);
        
        Alert promptAlert4 = driver.switchTo().alert();
        System.out.println(promptAlert4.getText());
        
        promptAlert4.sendKeys("Santosh A ");
        promptAlert4.accept();
        
        System.out.println(driver.findElement(By.id("promptResult")).getText());
        
        driver.quit();
     
	}

}
