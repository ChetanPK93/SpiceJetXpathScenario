package spiceJetScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetScenario 
{
	@Test
	public void test() throws AWTException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		//open the browse
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		// enter the url
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(4000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_ALT);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//select Destination
		driver.findElement(By.xpath("//input[@value='Select Destination']")).sendKeys("Delhi");
		
		//Select Departure date
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-150rngu r-18u37iz r-16y2uox r-1wbh5a2 r-lltvgl r-buy8e9 r-1sncvnh']/div/div/div/div[3]/div[5]/div[3]/div/div)[1]")).click();
		
		
		//Click on Search Flight Button
		driver.findElement(By.xpath("//div[.='Search Flight']/div[2]/div")).click();
		
		//click on continue button
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1wtj0ep']/div[3]/div[2]")).click();
		
		//Enter First name
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1x0uki6 r-10ahfku']/div[2]/div/div/div[2]/input")).sendKeys("James");
		
		//Enter Last name
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1x0uki6 r-10ahfku']/div[3]/div/div/div[2]/input")).sendKeys("Gosling");
		
		//Enter Contact number
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1x0uki6 r-10ahfku']/div[4]/div/div[2]/input")).sendKeys("9988776655");
		
		//Enter Email address
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-18u37iz r-1g94qm0 r-mhe3cw']/div/div/div/div[2]/input)[1]")).sendKeys("punuhrsolutions@gmail.com");
		
		//Enter Town or City
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-18u37iz r-1g94qm0 r-mhe3cw']/div/div/div/div[2]/input)[2]")).sendKeys("Bengaluru");
		
		//check box check and uncheck
		WebElement ele = driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-18u37iz r-15d164r']/div/div/div/div)[1]"));
		
		ele.click();
		Thread.sleep(5000);
		ele.click();
		
		//Enter first name and middle name
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-8fdsdq']/div[2]/div/div/div[2]/input")).sendKeys("Gosling");
		
		//Enter Last Name
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-8fdsdq']/div[3]/div/div/div[2]/input")).sendKeys("James");
	}
}
