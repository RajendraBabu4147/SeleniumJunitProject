package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutomationScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".nav-line-1-container")).click();
		WebElement uName = driver.findElement(By.xpath("//input[@id='ap_email']"));
		uName.sendKeys("santosh.ras@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Snoopy@331");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Dairy Milk Choclate");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		// use java script executor 
		
		//by pixels 
		// to element 
		// page end 
		//horizontal scroll 
		
		
		
		
		driver.findElement(By.xpath("//*[@id=\"CardInstanceL6cTS_X2X1XfdWKm8T4WMA\"]/a"));
		driver.quit();
		
		
	}

}
