package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteIncident {

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
			WebElement findd = driver.findElement(By.xpath("(//a[@class='linked formlink'])[1]"));
			String dnum = findd.getText();
			WebElement searchh = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
			searchh.sendKeys(dnum);
			searchh.sendKeys(Keys.ENTER);
			driver.switchTo().defaultContent();
			
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//a[@class='linked formlink'])[1]")).click();
			driver.switchTo().defaultContent();
			
			Thread.sleep(2000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//button[@id='sysverb_delete']")).click();
			driver.findElement(By.xpath("//button[@id='ok_button']")).click();
			driver.switchTo().defaultContent();
			
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).click();
			driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(dnum);
			driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(Keys.ENTER);
			driver.switchTo().defaultContent();
			
			driver.switchTo().frame(0);
			WebElement conclusion=driver.findElement(By.xpath("//td[@colspan='5']"));
			String fresult = conclusion.getText();
			if(fresult.contains("No records")) {
				System.out.println("Testcase passed");
			}
	}

}
