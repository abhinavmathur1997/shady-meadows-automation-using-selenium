package demo;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class shadymeadows {
	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://automationintesting.online/");
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Book this room']"))).click();
      
 
            driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();
            Thread.sleep(3000);
           
            driver.findElement(By.xpath("//input[@placeholder='Firstname']")).sendKeys("Abhinav");
            driver.findElement(By.xpath("//input[@placeholder='Lastname']")).sendKeys("Mathurxyz");
            driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abhinavkishore999@gmail.com");
            driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9152106461");
            driver.findElement(By.xpath("//button[normalize-space()='19']")).click();
            driver.findElement(By.xpath("//button[normalize-space()='Book']")).click();
            driver.findElement(By.xpath("//div[@class='pigeon-overlays']")).click();
            driver.findElement(By.xpath("//*[name()='circle' and contains(@cx,'30.5')]")).click();
	}

}
