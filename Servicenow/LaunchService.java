package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchService {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev112860.service-now.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Servicenow@123");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		WebElement ent = driver.findElement(By.id("filter"));
		ent.sendKeys("Incidents");
		Thread.sleep(2000);
		ent.sendKeys(Keys.ENTER);
		
	
		driver.switchTo().frame(0);
		driver.findElement(By.id("sysverb_new")).click();
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame(0);
		WebElement lase1 = driver.findElement(By.xpath("//input[@id='incident.number']"));
		String num1 = lase1.getAttribute("value");
		System.out.println(num1);
				
		driver.findElement(By.id("incident.short_description")).sendKeys("issue with the webpage");
		driver.findElement(By.xpath("(//button[@class='form_action_button header  action_context btn btn-default'])[1]")).click();
		driver.switchTo().defaultContent();
		
	    Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement findd = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		findd.sendKeys(num1);
		findd.sendKeys(Keys.ENTER);
		WebElement ele1 = driver.findElement(By.xpath("//a[@class='linked formlink']"));
		String num2 = ele1.getText();
		System.out.println(num2);
		
		driver.switchTo().defaultContent();
		
		
		
		if(num1.equals(num2)) {
			System.out.println("Incident is created");
		}
		else {
			System.out.println("Incident not created");
		}
	}

}
